package com.example.demo.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.example.demo.order..*(..))")
    public void allOrder() { //pointcut signature

    }

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {

    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() {

    }
}
