package models.employees;

import io.ebean.Finder;
import models.entities.Address;
import models.entities.Department;
import models.entities.Project;

import javax.persistence.*;
import java.util.List;


@Table(name="EMPLOYEES")
@Entity
@DiscriminatorValue("employee")



public class Employee extends User{

    @ManyToOne
    private Department department;

    @OneToOne(cascade=CascadeType.ALL)
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy="employees")
    public List<Project> projects;





    public Employee(String email, String name, String password, String role) {
        super(email, name, password, role);
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll() {
        return Employee.find.all();
    }






}
