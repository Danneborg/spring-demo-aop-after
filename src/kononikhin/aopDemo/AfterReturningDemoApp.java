package kononikhin.aopDemo;

import kononikhin.DAO.AccountDAO;
import kononikhin.DAO.MemberShipDAO;
import kononikhin.Entity.Account;
import kononikhin.aopDemo.Config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> accountList = accountDAO.getAccounts();

        System.out.println("----------Performing After Throwing----------");
        accountList.forEach(System.out::println);

        context.close();

    }
}
