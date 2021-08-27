package cn.histo.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = {"cn.histo.provider"})
public class ProviderBootstrap {

    public static void main(String[] args) {
        // WebApplicationType.SERVLET 开启 web 请求 & WebApplicationType.NONE 关闭 Web 请求
        new SpringApplicationBuilder(ProviderBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
