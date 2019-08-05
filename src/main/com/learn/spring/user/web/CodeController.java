package main.com.learn.spring.user.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import main.com.learn.spring.user.service.HttpClient;
import main.com.learn.spring.user.utils.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/code")
@RestController
public class CodeController {
    @Autowired
    private HttpClient httpClient;

    @RequestMapping("/gettest")
    public String getJson() {
        String AppKey = "这里填对应的KEY";
        String Text= "这里填需要存入的二维码的数据";
        String url = "http://apis.juhe.cn/qrcode/api?key=" + AppKey + "&text="+Text;
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        //调用工具类 返回API返回的Json
        String str = httpClient.client(url, HttpMethod.GET, params);
        //使用的是alibaba的JSON工具类
        System.out.println(str);
        JSONObject object = JSON.parseObject(str);

        String base64 = object.getJSONObject("result").get("base64_image").toString();
        //路径自己修改，这里图方便直接写死了
        Base64.GenerateImage(base64, "/usr/local");
        return "";
    }
}
