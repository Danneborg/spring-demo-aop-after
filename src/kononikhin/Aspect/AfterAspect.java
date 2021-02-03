package kononikhin.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-19)
public class AfterAspect {

    @After("execution(* kononikhin.DAO.AccountDAO.getAccounts(..))")
    public void afterAdviceAccountsDAO(JoinPoint joinPoint){

        String method = joinPoint.getSignature().toShortString();
        System.out.println("----After Aspect has been triggered with data---");
        System.out.println("Method " + method);

    }


}
