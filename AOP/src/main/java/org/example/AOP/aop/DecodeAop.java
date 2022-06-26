package org.example.AOP.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.example.AOP.dto.User;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@Aspect
@Component
public class DecodeAop {

    @Pointcut("execution(* org.example.AOP.controller..*.*(..))")
    public void cut(){}

    @Pointcut("@annotation( org.example.AOP.annotation.Decode)")
    public void enableDecode(){}

    @Before("cut() &&enableDecode()")
    public void before(JoinPoint joinPoint) throws UnsupportedEncodingException {
        Object[] objects = joinPoint.getArgs();
        for(Object obj : objects){
            if(obj instanceof User){
                User user = User.class.cast(obj);
                String base64Email = user.getEmail();
                String email = new String(Base64.getDecoder().decode(base64Email),"UTF-8");
                user.setEmail(email);
            }
        }
    }

    @AfterReturning(value = "cut() &&enableDecode()",returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        if(returnObj instanceof  User){
            User user = User.class.cast(returnObj);
            String email = user.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());
            user.setEmail(base64Email);
        }
    }
}
