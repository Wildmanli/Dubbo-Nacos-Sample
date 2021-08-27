package cn.histo.provider.fallback.demo1;

import cn.histo.provider.api.demo1.Demo1ServiceI;
import cn.histo.provider.fallback.AbstractFallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Demo1ServiceFallbackFactory extends AbstractFallbackFactory<Demo1ServiceI> {

    @Autowired
    private Demo1ServiceFallback demo1ServiceFallback;

    @Bean
    @ConditionalOnMissingBean
    public Demo1ServiceFallback getDemo1ServiceFallback() {
        return new DefaultDemo1ServiceFallback();
    }

    @Override
    public Demo1ServiceI getFallbackInstance() {
        return demo1ServiceFallback;
    }
}
