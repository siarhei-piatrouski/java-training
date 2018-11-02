package by.training.andersen.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Project {
    private ProjectManager projectManager;
    private Developer developer;

    public void start() {
        System.out.println("Project started");
        projectManager.manage();
        developer.develop();
    }
}
