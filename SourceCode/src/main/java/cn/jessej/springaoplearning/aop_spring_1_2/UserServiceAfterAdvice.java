package cn.jessej.springaoplearning.aop_spring_1_2;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: jesse
 * @date: 2019/3/15
 */
public class UserServiceAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法返回：" + returnValue);
    }
}
