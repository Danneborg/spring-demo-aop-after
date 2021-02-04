package kononikhin.aopDemo;

import kononikhin.Service.TrafficFortuneService;
import kononikhin.aopDemo.Config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println("----Performing Around Demo App----");

        System.out.println(fortuneService.getFortune());

        System.out.println("----Performing finished----");

        context.close();

    }
}
