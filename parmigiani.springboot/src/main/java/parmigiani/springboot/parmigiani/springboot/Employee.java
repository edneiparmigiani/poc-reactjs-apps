package parmigiani.springboot.parmigiani.springboot;

import lombok.Data;
import org.springframework.hateoas.Identifiable;
import org.springframework.hateoas.ResourceSupport;

@Data
public class Employee extends ResourceSupport {
    private Long code;
    private String firstName;
    private String lastName;
    private Integer age;

    public Employee(){};

    public Employee(Long code, String firstName, String lastName, Integer age) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
