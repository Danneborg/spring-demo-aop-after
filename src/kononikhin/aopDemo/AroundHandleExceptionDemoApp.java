package kononikhin.aopDemo;

import kononikhin.Service.TrafficFortuneService;
import kononikhin.aopDemo.Config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundHandleExceptionDemoApp {

    private static Logger logger = Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        boolean academicBoolean = true;

        logger.info("----Performing Around Demo App----");

        logger.info(fortuneService.getFortune(academicBoolean));

        logger.info("----Performing finished----");

        context.close();

    }
}
