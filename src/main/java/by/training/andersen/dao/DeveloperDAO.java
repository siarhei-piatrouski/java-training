package by.training.andersen.dao;

import by.training.andersen.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDAO {

    void setDataSource(DataSource dataSource);

    void createDeveloper(String name, String specialty, Integer experience);

    Developer getDeveloperById(Integer id);

    List listDevelopers();

    void removeDeveloper(Integer id);

    void updateDeveloper(Integer id, String name, String specialty, Integer experience);
}
