package by.training.andersen.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Developer {
    private Integer id;
    private String name;
    private String specialty;
    private Integer experience;
}
