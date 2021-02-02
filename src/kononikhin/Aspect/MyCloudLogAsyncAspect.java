package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyCloudLogAsyncAspect {

    @Before("kononikhin.Aspect.AOPExressions.excludeGettersAndSetters()")
    public void performeCloudAnalytics() {
        System.out.println("=>>>>>> Logging to cloud <<<<<<=");
    }

}
