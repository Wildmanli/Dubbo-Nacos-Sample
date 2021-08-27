package cn.histo.provider.fallback.demo1;

public class DefaultDemo1ServiceFallback implements Demo1ServiceFallback {

    @Override
    public String sayBye(String name) {
        return name + ", I can't say bye";
    }
}
