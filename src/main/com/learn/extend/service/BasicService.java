package main.com.learn.extend.service;

/**
 * basic service interface
 *
 * @author luffy
 * @date 15/5/6
 */
public interface BasicService {

    /**
     * 转换业务对象
     * @param resource
     * @param target
     * @param <T>
     * @return
     */
    public <T> T convertBusinessValue(Object resource, Class<T> target, String... ignoreProperties);

    /**
     * 转换业务对象
     * @param resource
     * @param target
     * @param <T>
     * @return
     */
    public <T> T convertBusinessValue(Object resource, Object target, String... ignoreProperties);
}
