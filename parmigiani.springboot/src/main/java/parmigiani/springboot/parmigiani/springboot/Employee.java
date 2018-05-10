package parmigiani.springboot.parmigiani.springboot;

import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

@Data
public class Employee extends ResourceSupport {
    private String firstName;
    private String lastName;
    private Integer age;

    public Employee(){};

    public Employee(Long id, String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
