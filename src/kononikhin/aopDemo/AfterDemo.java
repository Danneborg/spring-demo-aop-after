package kononikhin.aopDemo;

import kononikhin.DAO.AccountDAO;
import kononikhin.Entity.Account;
import kononikhin.aopDemo.Config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accountList = null;
        System.out.println("----------Performing After advice----------");
        try {
            //boolean tag to simulate exception
            boolean booleanException = false;
            accountList = accountDAO.getAccounts(booleanException);

        } catch (Exception e) {

            System.out.println("----------Exception has been thrown----------");

        }

        accountList.forEach(System.out::println);

        context.close();
    }
}
