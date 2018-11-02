package by.training.andersen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Singleton scope:");
        Message singletonScopeMessage = (Message) context.getBean("singletonScopeMessage");
        singletonScopeMessage.setMessage("This is first object.");
        System.out.println(singletonScopeMessage.getMessage());

        Message oneMoreSingletonScopeMessage = (Message) context.getBean("singletonScopeMessage");
        System.out.println(oneMoreSingletonScopeMessage.getMessage());

        System.out.println("Prototype scope:");
        Message prototypeScopeMessage = (Message) context.getBean("prototypeScopeMessage");
        prototypeScopeMessage.setMessage("This is first object.");
        System.out.println(prototypeScopeMessage.getMessage());

        Message oneMorePrototypeScopeMessage = (Message) context.getBean("prototypeScopeMessage");
        System.out.println(oneMorePrototypeScopeMessage.getMessage());
    }
}
