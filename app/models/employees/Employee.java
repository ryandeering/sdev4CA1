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


@Table(name = "EMPLOYEE")
@Entity
@DiscriminatorValue("employee")


public class Employee extends User {

    @ManyToOne
    public Department department;

    @OneToOne(cascade = CascadeType.ALL)
    public Address address;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
    public List<Project> projects;


    public Employee(String email, String name, String password, String role) {
        super(email, name, password, role);
        this.department = department;
        this.address = address;
    }

    public static final Finder<String, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public static List<Employee> findFilter(String ID, String filter) {
        return Employee.find.query().where()
                .eq("deps.id", ID)
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


    public List<Project> getProjects() {
        return projects;
    }

    public List<Long> projSelect = new ArrayList<Long>(); //equivalent of catSelect

    public List<Long> getprojSelect() {
        return projSelect;
    }

    public void setprojSelect(List<Long> projSelect) {
        this.projSelect = projSelect;
    }


    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}