package cn.histo.provider.api.demo1;

import cn.histo.provider.fallback.demo1.Demo1ServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider-demo", contextId = "demo1Service", fallbackFactory = Demo1ServiceFallbackFactory.class)
public interface Demo1ServiceI {

    /**
     * RPC 接口示例
     *
     * @param name name
     * @return str
     */
    @GetMapping(value = "/demo/bye/{name}")
    String sayBye(@PathVariable("name") String name);
}
