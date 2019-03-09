package models.employees;

import io.ebean.Finder;

import javax.persistence.*;
import java.util.List;
@Table(name="EMPLOYEE")
@Entity
// the user type of this class is "admin"
@DiscriminatorValue("manager")
public class Manager extends User {
    public Manager(String email, String name, String password, String role) {

        super(email, name, password, role);
    }


    public static final Finder<Long, Manager> find = new Finder<>(Manager.class);

    public static final List<Manager> findAll() {
        return Manager.find.all();
    }


}
