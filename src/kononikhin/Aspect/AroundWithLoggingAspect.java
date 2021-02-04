package kononikhin.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(-77)
public class AroundWithLoggingAspect {
    private Logger logger = Logger.getLogger(AroundWithLoggingAspect.class.getName());

    @Around("execution(* kononikhin.Service.TrafficFortuneService.getForuneOld(..))")
    public Object aroundGetFortune(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().toShortString();
        logger.info("----Executing Around advice---");
        logger.info("Method " + method);

        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();

        long finish = System.currentTimeMillis();

        logger.info("Execution duration is :" + (finish - begin) + "ms");

        return result;
    }
}
