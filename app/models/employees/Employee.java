package models.employees;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.entities.*;

@Entity
// specify mapped table name
@Table(name = "EMPLOYEE")
// map subclasses to a single table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// the discriminator column is used to define Employee type
@DiscriminatorColumn(name = "role")
// the Employee type of this class (the base class) is "Employee"
@DiscriminatorValue("employee")

public class Employee extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String name;
    
    @Constraints.Required
    private String password;


    @ManyToOne
    private Department department;

    @OneToOne(cascade=CascadeType.ALL)
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy="employees")
    public List<Project> projects;



    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    public static final List<Employee> findAll() {
        return Employee.find.all();
    }

    public static Employee authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static Employee getEmployeeById(String id) {
        if (id == null) {
            return null;
        } else {
            return find.query().where().eq("email", id).findUnique();
        }
    }

    public Employee() {

    }

    public Employee(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}