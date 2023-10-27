package cn.nenu.model;

import org.aspectj.lang.JoinPoint;
import java.util.Arrays;

/**
 * 基于xml的aop实现
 */
public class Aspect2 {

    public void printDepositMoney(JoinPoint joinPoint){
        System.out.println("accountService的deposit的前置通知:");
        System.out.println("存取金额为："+ Arrays.asList(joinPoint.getArgs()).get(1));
        System.out.println("--------------------");
    }


    public void printBalance(Account account){
        System.out.println("accountService的后置通知:");
        System.out.println("余额为："+account.getBalance());
        System.out.println("--------------------");
    }

    public void log(){
        System.out.println("RiZhi................log()...............记录日志");
    }

}
