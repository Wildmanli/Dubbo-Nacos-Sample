package cn.histo.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"cn.histo.provider.api"})
@SpringBootApplication(scanBasePackages = {"cn.histo.consumer", "cn.histo.provider"})
public class FeignConsumerApplication {

    public static void main(String[] args) {
        // WebApplicationType.SERVLET 开启 web 请求 & WebApplicationType.NONE 关闭 Web 请求
        new SpringApplicationBuilder(FeignConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
