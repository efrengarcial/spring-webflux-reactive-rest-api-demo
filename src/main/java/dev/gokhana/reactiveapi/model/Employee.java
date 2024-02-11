package dev.gokhana.reactiveapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "employee")
public class Employee {
    @Id
    private Long id;
    private String name;
    private Long salary;
    // constructors, getters, setters

    public Employee() {
    }

    public Employee(Long id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

