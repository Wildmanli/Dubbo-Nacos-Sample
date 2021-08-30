package cn.histo.provider.service.demo;

import cn.histo.provider.api.demo.DemoServiceI;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@RestController
@DubboService
public class DemoServiceImpl implements DemoServiceI {

    @Value(value = "${spring.application.name}")
    private String serviceName;

    @Value(value = "${provider.auto-refresh}")
    private Boolean autoRefresh;

    @Value(value = "${provider.state}")
    private String state;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s, the Config is [autoRefresh = %s, state = %s]", serviceName, name, autoRefresh, state);
    }
}
