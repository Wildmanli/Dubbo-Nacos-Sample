package cn.histo.provider.service.demo1;

import cn.histo.provider.api.demo1.Demo1ServiceI;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class Demo1ServiceImpl implements Demo1ServiceI {

    @Value(value = "${spring.application.name}")
    private String serviceName;

    @Override
    public String sayBye(String name) {
        return String.format("[%s] : Bye, %s", serviceName, name);
    }
}
