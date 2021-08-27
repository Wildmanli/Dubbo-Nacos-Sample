package cn.histo.consumer;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        // WebApplicationType.SERVLET 开启 web 请求 & WebApplicationType.NONE 关闭 Web 请求
        new SpringApplicationBuilder(ConsumerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
