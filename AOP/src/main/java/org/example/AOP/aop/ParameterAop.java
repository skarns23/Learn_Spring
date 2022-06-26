package org.example.AOP.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class ParameterAop {

    @Pointcut("execution(* org.example.AOP.controller..*.*(..))") // controller 하위에서 일어나느 모든 것에 대해  로그찍음
    private void cut(){

    }

    @Before("cut()") // cut() 메소드가 실행되기 전에 하겠다
    public void before(JoinPoint joinPoint) {// Joinpoint는 들어가는 지점을 담아 놓은 객
        Object[] args = joinPoint.getArgs();
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName());
        for(Object obj :args){
            System.out.println("type : "+obj.getClass().getSimpleName());
            System.out.println("value : "+obj);
        }
    }
    @AfterReturning(value = "cut()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        System.out.println("returnObj : "+returnObj);
    }
}
