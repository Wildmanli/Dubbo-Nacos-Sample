package cn.histo.provider.fallback.demo;

import cn.histo.provider.api.demo.DemoServiceI;
import cn.histo.provider.fallback.AbstractFallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallbackFactory extends AbstractFallbackFactory<DemoServiceI> {

    @Autowired
    private DemoServiceFallback demoServiceFallback;

    @Bean
    @ConditionalOnMissingBean
    public DemoServiceFallback getDemoServiceFallback() {
        return new DefaultDemoServiceFallback();
    }

    @Override
    public DemoServiceI getFallbackInstance() {
        return demoServiceFallback;
    }
}
