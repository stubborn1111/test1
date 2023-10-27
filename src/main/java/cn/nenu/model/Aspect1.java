package cn.nenu.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/**
 * 基于注解的aop实现
 */
@Component
@Aspect
public class Aspect1 {
    @Before(value = "execution(* cn.nenu.service.AccountService.depositAmount(..))")
    public void printDepositMoney(JoinPoint joinPoint){
        System.out.println("accountService的deposit的前置通知:");
        System.out.println("存取金额为："+ Arrays.asList(joinPoint.getArgs()).get(1));
        System.out.println("--------------------");
    }

    @AfterReturning(value = "execution(* cn.nenu.service.AccountService.*(..))",returning="account")
    public void printBalance(Account account){
        System.out.println("accountService的后置通知:");
        System.out.println("余额为："+account.getBalance());
        System.out.println("--------------------");
    }

    @After(value ="execution(* cn.nenu.service.AccountService.*(..))")
    public void log(){
        System.out.println("RiZhi................log()...............记录日志");
    }

}
