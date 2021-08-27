package cn.histo.provider.fallback.demo;

public class DefaultDemoServiceFallback implements DemoServiceFallback {

    @Override
    public String sayHello(String name) {
        return name + ", I can't say hello";
    }
}
