package kononikhin.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-9)
public class AfterThrowingAspect {

    @AfterThrowing(
            pointcut = "execution(* kononikhin.DAO.AccountDAO.getAccounts(..))",
            throwing = "theException")
    public void afterThrowingAccountsDAO(JoinPoint joinPoint,Throwable theException){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("----After Throwing Aspect has been triggered with data---");
        System.out.println("Method " + method);
        System.out.println("Exception "+theException);

    }


}
