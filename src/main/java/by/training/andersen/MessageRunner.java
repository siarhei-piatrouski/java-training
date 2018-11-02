package by.training.andersen;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Message message = (Message) context.getBean("message");
        System.out.println("\n==================================");
        System.out.println(message.getMessage());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
