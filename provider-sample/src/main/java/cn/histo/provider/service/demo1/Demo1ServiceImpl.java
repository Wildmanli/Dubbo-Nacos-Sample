package cn.histo.provider.service.demo1;

import cn.histo.provider.api.demo1.Demo1ServiceI;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@RestController
@DubboService
public class Demo1ServiceImpl implements Demo1ServiceI {

    @Value(value = "${spring.application.name}")
    private String serviceName;

    @Value(value = "${provider.auto-refresh}")
    private Boolean autoRefresh;

    @Value(value = "${provider.state}")
    private String state;

    @Override
    public String sayBye(String name) {
        return String.format("[%s] : Bye, %s, the Config is [autoRefresh = %s, state = %s]", serviceName, name, autoRefresh, state);
    }
}
