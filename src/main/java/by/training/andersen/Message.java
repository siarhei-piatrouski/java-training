package by.training.andersen;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String message;

    public void init() {
        System.out.println("Bean is in init phase.");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }
}
