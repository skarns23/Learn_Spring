package org.example.AOP.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop {

    @Pointcut("execution(* org.example.AOP.controller..*.*(..))")
    private void cut(){

    }
    @Pointcut("@annotation(org.example.AOP.annotation.Timer)")
    private void enableTimer(){

    }

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed(); // 실제 메소드가 실행되고 반환형이 있다면 Object로 들어감
        stopWatch.stop();
        System.out.println("total time : "+stopWatch.getTotalTimeMillis());
    }
}
