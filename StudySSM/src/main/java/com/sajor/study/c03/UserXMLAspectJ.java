package com.sajor.study.c03;

//定义代理通知类(切面类)
public class UserXMLAspectJ {
    public void aspectBefore() {
        System.out.println("方法执行之前...");
    }

    public void aspectAfter() {
        System.out.println("方法执行之后...");
    }
}
