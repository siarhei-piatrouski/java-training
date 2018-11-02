package by.training.andersen;

import by.training.andersen.beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Project webProject = (Project) context.getBean("webProject");
        webProject.start();
    }
}
