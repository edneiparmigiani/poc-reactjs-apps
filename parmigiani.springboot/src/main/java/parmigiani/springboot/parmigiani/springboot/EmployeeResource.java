package parmigiani.springboot.parmigiani.springboot;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class EmployeeResource extends ResourceSupport {

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> list() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1l,"Ednei José", "Parmigiani Júnior", 30));
        employees.add(new Employee(2l,"Bruna Teixeira", "de França", 28));
        employees.add(new Employee(3l,"Bruna Caroline", "Lourenzone Parmigiani", 24));
        employees.add(new Employee(4l,"Adriana", "Lourenzone Parmigiani", 50));
        employees.add(new Employee(5l,"Huco Teixeira", "de França", 24));

        //add(linkTo(methodOn(EmployeeResource.class).get(id)).withSelfRel());

        return new ResponseEntity<List<Employee>>((employees), HttpStatus.OK);
    }

    public ResponseEntity<Employee> get(@PathVariable final long id) {
        return null;
    }

}