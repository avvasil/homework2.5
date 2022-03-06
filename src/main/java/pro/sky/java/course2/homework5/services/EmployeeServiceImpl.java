package pro.sky.java.course2.homework5.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework5.classes.Employee;
import pro.sky.java.course2.homework5.classes.EmployeeAlreadyExistsException;
import pro.sky.java.course2.homework5.classes.EmployeeArrayOverflowException;
import pro.sky.java.course2.homework5.classes.EmployeeNotFoundException;
import pro.sky.java.course2.homework5.interfaces.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();
    int volume = 3;

    public void addEmployee(Employee employee) {

        if (employees.size() == volume) {
            throw new EmployeeArrayOverflowException("Массив переполнен");
        }

        if (employees.contains(employee)) {
            throw new EmployeeAlreadyExistsException("Этот работник уже добавлен");
        }
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        employees.remove(employee);
    }

    public void findEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }
        employees.contains(employee);
    }
}