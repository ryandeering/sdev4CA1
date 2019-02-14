package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "DEPARTMENT")

@SequenceGenerator(name="did_seq", initialValue=1, allocationSize=1)
@SuppressWarnings("SerializableClass")

public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_seq")
    private int did;
    private String depName;   
 
 @OneToMany(mappedBy = "dep")
 public List<Employee> employees;

    

    public Department() {
    }

    public Department(int did, String depName) {
        this.did = did;
        this.depName = depName;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }





}
