package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExressions {

    //any return type, any method name and any input parameters
    @Pointcut("execution(* kononikhin.DAO.*.*(..))")
    public void forDAOLayer(){};

    //for getter methods
    @Pointcut("execution(* kononikhin.DAO.*.get*(..))")
    public void getters(){};

    //for setter methods
    @Pointcut("execution(* kononikhin.DAO.*.set*(..))")
    public void setters(){};

    //exclude getters and setters
    @Pointcut("forDAOLayer() && !(setters() || getters())")
    public void excludeGettersAndSetters(){};

}
