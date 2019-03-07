package models.employees;

import io.ebean.*;
import models.entities.Address;
import models.entities.Department;
import models.entities.Project;

import javax.persistence.*;
import java.util.*;
import java.lang.Object;
import play.data.format.*;
import play.data.validation.*;



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

    public static List<Employee> findFilter(Long catID, String filter) {
        return Employee.find.query().where()
                .eq("deps.id", catID)
                .ilike("name", "%" + filter + "%")
                .orderBy("name asc")
                .findList();
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }




    }