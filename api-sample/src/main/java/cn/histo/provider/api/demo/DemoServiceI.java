package cn.histo.provider.api.demo;

import cn.histo.provider.fallback.demo.DemoServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider-demo", contextId = "demoService", fallbackFactory = DemoServiceFallbackFactory.class)
public interface DemoServiceI {

    /**
     * RPC 接口示例
     *
     * @param name name
     * @return str
     */
    @GetMapping(value = "/demo/hello/{name}")
    String sayHello(@PathVariable("name") String name);
}
