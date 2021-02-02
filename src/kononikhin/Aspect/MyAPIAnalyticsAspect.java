package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyAPIAnalyticsAspect {

    @Before("kononikhin.Aspect.AOPExressions.excludeGettersAndSetters()")
    public void performeAPIanalytics(){
        System.out.println("=>>>>>> Perform api analytitcs <<<<<<=");
    }


}
