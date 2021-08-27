package cn.histo.provider.service.demo;

import cn.histo.provider.api.demo.DemoServiceI;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class DemoServiceImpl implements DemoServiceI {

    @Value(value = "${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
