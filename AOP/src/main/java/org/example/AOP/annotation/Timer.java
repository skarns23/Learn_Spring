package org.example.AOP.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD}) //어노테이션의 목표?
@Retention(RetentionPolicy.RUNTIME) // 언제 사용될 것인지
public @interface Timer {
}
