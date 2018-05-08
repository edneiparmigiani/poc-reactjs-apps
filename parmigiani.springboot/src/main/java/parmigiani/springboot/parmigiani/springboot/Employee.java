package parmigiani.springboot.parmigiani.springboot;

import lombok.Data;

@Data
public class Employee {
    private String firstName;
    private String lastName;
    private Integer age;

    private Employee employee;

    public Employee(){};

    public Employee(Long id, String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
