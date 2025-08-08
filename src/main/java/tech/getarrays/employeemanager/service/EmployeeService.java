package tech.getarrays.employeemanager.service;

import java.util.List;
import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee updateEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    void deleteEmployee(Long id);
}
