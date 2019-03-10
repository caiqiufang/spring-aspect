package com.caisebei.aspect.lock.springaspect.aspect;

import com.caisebei.aspect.lock.springaspect.annotation.DistributeLock;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationLockAspect {


    @Pointcut("@within(com.caisebei.aspect.lock.springaspect.annotation.DistributeLock)")
    public void addAdvice(){}

    @Around(value = "addAdvice()")
    public void handlerPoint(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("*******进入切面方法*******************");
        //获取锁逻辑

        //如果获取锁失败则不执行目标方法
        //joinPoint.proceed();
    }

}
