package models.employees;

import javax.persistence.*;

@Entity
// the user type of this class is "admin"
@DiscriminatorValue("manager")
public class Manager extends Employee {
    public Manager(String email, String name, String password) {

        super(email, name, password);
    }
}
