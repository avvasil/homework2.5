package pro.sky.java.course2.homework5.interfaces;

import pro.sky.java.course2.homework5.classes.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    void findEmployee(Employee employee);

    List<Employee> getListOfEmployees();
}
