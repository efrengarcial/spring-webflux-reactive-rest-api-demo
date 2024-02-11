package dev.gokhana.reactiveapi.service;

import dev.gokhana.reactiveapi.exception.NotFoundException;
import dev.gokhana.reactiveapi.model.Employee;
import dev.gokhana.reactiveapi.model.User;
import dev.gokhana.reactiveapi.repository.EmployeeRepository;
import reactor.core.publisher.Mono;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Mono<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .switchIfEmpty(Mono.error(new NotFoundException("User not found")));
    }

    @Override
    public Mono<User> saveUser(Employee employee) {
        return null;
    }

}
