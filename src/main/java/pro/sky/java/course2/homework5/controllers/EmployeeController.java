package pro.sky.java.course2.homework5.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework5.classes.Employee;
import pro.sky.java.course2.homework5.services.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @GetMapping(path = "/list")
    public List<Employee> getListOfEmployees() {
        return employeeServiceImpl.getListOfEmployees();
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceImpl.addEmployee(employee);
        return employee;

    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                                   @RequestParam("lastName") String lastName) {
        Employee removedEmployee = new Employee(firstName, lastName);
        employeeServiceImpl.removeEmployee(removedEmployee);
        return removedEmployee;
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        Employee foundEmployee = new Employee(firstName, lastName);
        employeeServiceImpl.findEmployee(foundEmployee);
        return foundEmployee;
    }

}
