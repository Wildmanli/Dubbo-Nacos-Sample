package cn.histo.provider.fallback;

import feign.hystrix.FallbackFactory;

/**
 *
 * 仅支持 {@link feign.hystrix.FallbackFactory}的实现，原因当前openfeign版本
 * @see org.springframework.cloud.openfeign.FeignClient#fallbackFactory()
 *
 * @param <T>
 */
public abstract class AbstractFallbackFactory<T> implements FallbackFactory<T> {

    @Override
    public T create(Throwable throwable) {
        T fallbackInstance = getFallbackInstance();
        return fallbackInstance;
    }

    /**
     * 获取熔断处理实例
     *
     * @return 熔断处理实例
     */
    public abstract T getFallbackInstance();
}
