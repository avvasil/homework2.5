package pro.sky.java.course2.homework5.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework5.classes.Employee;
import pro.sky.java.course2.homework5.classes.EmployeeAlreadyExistsException;
import pro.sky.java.course2.homework5.classes.EmployeeNotFoundException;
import pro.sky.java.course2.homework5.interfaces.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getListOfEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {

        if (employees.contains(employee)) {
            throw new EmployeeAlreadyExistsException("Этот работник уже добавлен");
        }
        employees.add(employee);
    }

    @Override
    public Employee removeEmployee(Employee employee) {
        if (!employees.remove(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        employees.remove(employee);
        return employee;
    }

    @Override
    public Employee findEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        return employee;
    }
}