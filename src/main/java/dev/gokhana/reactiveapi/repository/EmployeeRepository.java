package dev.gokhana.reactiveapi.repository;

import dev.gokhana.reactiveapi.model.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {
}
