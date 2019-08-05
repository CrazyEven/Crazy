package main.com.learn.extend.exception;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public interface ErrorCodes {

    ErrorCode NO_ERROR = new ErrorCode("000000", "交互成功"); // 接口交互正常
    ErrorCode UNKNOWN_ERROR = new ErrorCode("666666", "交互错误"); // 接口未知错误
    ErrorCode SHAM_SUCCESS = new ErrorCode("888888", "交互成功"); // 需要接口交互成功并有异常要处理时使用

    // api接入
    interface API_ENTRANCE {

        ErrorCode INVALID_SIGN = new ErrorCode("100001", "签名不正确");
        ErrorCode EMPTY_PARAM = new ErrorCode("100002", "字段为空");
        ErrorCode INVALID_TOKEN = new ErrorCode("100003", "Token不合法");
        ErrorCode USER_NOT_EXISTS = new ErrorCode("100004", "用户不可用");
        ErrorCode INVALID_PURVIEW = new ErrorCode("100005", "权限不合法");
        ErrorCode IDEMPOTENT_REPORT_SUBMIT = new ErrorCode("100006", "重复提交");
        ErrorCode USER_OR_PASSWORD_ERROR = new ErrorCode("100007", "用户名或密码错误");
        ErrorCode INVALID_APPID = new ErrorCode("100008", "appId不合法");

    }

    // 缓存相关异常code描述
    interface CACHE {
        ErrorCode EMPTY_REGION = new ErrorCode("200001", "Region值为空");
        ErrorCode EMPTY_KEY = new ErrorCode("200002", "Key值为空");
        ErrorCode GET_UNSUPPORTED_COLLECTION_OR_MAP = new ErrorCode("200003", "不支持集合或Map的获取");
        ErrorCode EMPTY_CLASS_OBJECT = new ErrorCode("200004", "Class参数为空");
        ErrorCode GET_DATA_OVERFLOW = new ErrorCode("200005", "获取缓存集合数据过大");
        ErrorCode PUT_DATA_OVERFLOW = new ErrorCode("200006", "不支持集合或Map的添加");

    }

    // 权限相关异常code描述
    interface PURVIEW {

        ErrorCode QUERY_NO_PURVIEW = new ErrorCode("500001", "未查询到权限!");
        ErrorCode HAS_FUNC_IN_PURVIEW = new ErrorCode("500002", "权限下配有功能列表");

    }

    // 订单相关异常code描述
    interface ORDER {

        ErrorCode NO_ORDER_IN_BERTH = new ErrorCode("600001", "该泊位不存在订单!");
        ErrorCode EMPTY_ORDER_SN = new ErrorCode("600002", "订单编号为空");
        ErrorCode NO_ORDER = new ErrorCode("600003", "该订单不存在!");
        ErrorCode ORDER_STATUS_ERROR = new ErrorCode("600004", "订单状态有误!");
        ErrorCode PLATE_EXIST_BILLING_ORDER = new ErrorCode("600005", "该车辆存在计费中的订单!");
        ErrorCode EMPTY_ORDER_BN = new ErrorCode("600006", "订单流水号为空!");


        ErrorCode NO_DEVICE = new ErrorCode("610001", "该设备不存在!");


        ErrorCode NO_BERTH = new ErrorCode("620001", "该泊位不存在!");
        ErrorCode EMPTY_BERTH_SN = new ErrorCode("620002", "泊位编号为空!");
        ErrorCode BERTH_IN_USE = new ErrorCode("620003", "该泊位正在使用中!");


        ErrorCode NO_PLATE = new ErrorCode("630001", "车牌号为空!");
        ErrorCode PLATE_ERROR = new ErrorCode("630002", "车牌号不合法!");

    }


    // 交易相关异常code描述
    interface TRADE {

        ErrorCode TRADE_ALREADY_IN_ORDER = new ErrorCode("700001", "该订单已存在支付中交易!");
        ErrorCode REFUND_AMOUNT_EXCEED = new ErrorCode("700002", "退款金额超出上限");

    }

    // 用户相关异常code描述
    interface USER {

        ErrorCode USER_DIMISSION = new ErrorCode("800001", "用户已离职!");
        ErrorCode NO_USER = new ErrorCode("800002", "用户不存在!");

    }

    // 系统状态相关（临时添加）
    interface SYSTEM_STATUS {

        ErrorCode EMPTY_DEVICE_OR_HOST = new ErrorCode("990001", "空的设备编号或地址");

    }

    // 网关层
    interface GATEWAY {
        ErrorCode INVALID_SYSTEM_TAG = new ErrorCode("300001", "不合法的SystemTag");
    }

    static void main(String[] args) {
        List<ErrorCode> list = new ArrayList<>();
        Arrays.stream(ErrorCodes.class.getClasses()).forEach(category -> Arrays.stream(category.getFields()).forEach(f -> {
            try {
                ErrorCode errorCode = ErrorCode.class.cast(f.get(null));
                list.add(errorCode);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }));

        list.add(NO_ERROR);
        list.add(UNKNOWN_ERROR);

        TreeMap<String, Object> map = list.stream().collect(Collectors.toMap(ErrorCode::getCode, ErrorCode::getMessage, (u, v) -> {
            throw new IllegalStateException(String.format("Duplicate key %s", u));
        }, TreeMap<String, Object>::new));

        System.out.println(new JSONObject(map));
    }
}
