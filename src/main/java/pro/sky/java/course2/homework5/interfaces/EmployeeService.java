package pro.sky.java.course2.homework5.interfaces;

import pro.sky.java.course2.homework5.classes.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    Employee removeEmployee(Employee employee);

    Employee findEmployee(Employee employee);

    List<Employee> getListOfEmployees();
}
