package by.training.andersen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());
    }
}
