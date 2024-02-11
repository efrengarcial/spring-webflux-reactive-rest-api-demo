package dev.gokhana.reactiveapi.service;

import dev.gokhana.reactiveapi.model.Employee;
import dev.gokhana.reactiveapi.model.User;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<Employee> getEmployeeById(Long id);

    Mono<User> saveUser(Employee employee);
}
