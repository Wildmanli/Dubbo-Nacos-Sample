package cn.histo.consumer.web;

import cn.histo.provider.api.demo.DemoServiceI;
import cn.histo.provider.api.demo1.Demo1ServiceI;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @DubboReference
    private DemoServiceI demoService;

    @DubboReference
    private Demo1ServiceI demo1Service;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
    @GetMapping("bye/{name}")
    public String sayBye(@PathVariable("name") String name) {
        return demo1Service.sayBye(name);
    }

}
