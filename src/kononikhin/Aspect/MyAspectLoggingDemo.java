package kononikhin.Aspect;

import kononikhin.Entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(10)
public class MyAspectLoggingDemo {

//    @Before("execution(* kononikhin.DAO.*.*(..))")
//    public void beforeExecution(){
//        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");
//    }

    @AfterReturning(
            pointcut = "execution(* kononikhin.DAO.AccountDAO.getAccounts(..))",
            returning = "result"
    )
    public void afterReturningThrowingAdvice(JoinPoint joinPoint, List<Account> result) {
        String method = joinPoint.getSignature().toShortString();

        System.out.println("Method " + method);
        System.out.println("Result "+result);
    }

    @Before("kononikhin.Aspect.AOPExressions.excludeGettersAndSetters()")
    public void beforeExecution(JoinPoint joinPoint) {
        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");

        //display method signature
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Metod " + methodSignature);

        //display method arguments
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println(arg);
            if (arg instanceof Account) {
                Account account = (Account) arg;
                System.out.println("Account name " + account.getName());
                System.out.println("Account level " + account.getLevel());
            }
        }

    }


}
