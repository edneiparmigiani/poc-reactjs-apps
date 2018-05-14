package parmigiani.springboot.parmigiani.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class EmployeeResource {

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ResponseEntity<Employee> get(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        return new ResponseEntity<Employee>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> get(@PathVariable("id") long id) {
        Employee e1 = new Employee(1l, "Ednei José", "Parmigiani Júnior", 30);
        e1.add(linkTo(methodOn(EmployeeResource.class).get(1)).withSelfRel());

        return new ResponseEntity<Employee>((e1), HttpStatus.OK);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> list() {
        List<Employee> employees = new ArrayList<Employee>();

        Employee e1 = new Employee(1l, "Ednei José", "Parmigiani Júnior", 30);
        e1.add(linkTo(methodOn(EmployeeResource.class).get(1)).withSelfRel());
        employees.add(e1);

        Employee e2 = new Employee(2l, "Bruna Teixeira", "de França", 28);
        e2.add(linkTo(methodOn(EmployeeResource.class).get(2)).withSelfRel());
        employees.add(e2);

        Employee e3 = new Employee(3l, "Bruna Caroline", "Lourenzone Parmigiani", 24);
        e3.add(linkTo(methodOn(EmployeeResource.class).get(3)).withSelfRel());
        employees.add(e3);

        Employee e4 = new Employee(4l, "Adriana", "Lourenzone Parmigiani", 50);
        e4.add(linkTo(methodOn(EmployeeResource.class).get(4)).withSelfRel());
        employees.add(e4);

        Employee e5 = new Employee(5l, "Huco Teixeira", "de França", 24);
        e5.add(linkTo(methodOn(EmployeeResource.class).get(5)).withSelfRel());
        employees.add(e5);

        return new ResponseEntity<List<Employee>>((employees), HttpStatus.OK);
    }

}