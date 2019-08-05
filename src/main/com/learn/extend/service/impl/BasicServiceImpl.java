package main.com.learn.extend.service.impl;

import main.com.learn.extend.exception.ConvertValueException;
import main.com.learn.extend.service.BasicService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * Service父类
 * @author liujiegang
 */
@Service("basicService")
public class BasicServiceImpl implements BasicService {

    @Override
    public <T> T convertBusinessValue(Object resource, Class<T> target, String... ignoreProperties) {
        try {
            T t = target.newInstance();
            if(resource != null) {
                BeanUtils.copyProperties(resource, t, ignoreProperties);
            }
            return t;
        } catch (Exception e) {
            throw new ConvertValueException(e.getMessage(), e);
        }
    }

    @Override
    public <T> T convertBusinessValue(Object resource, Object target, String... ignoreProperties) {
        if(resource != null) {
            BeanUtils.copyProperties(resource, target, ignoreProperties);
        }
        return (T)target;
    }
}
