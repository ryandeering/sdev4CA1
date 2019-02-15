package models.entities;
import models.employees.*;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "PROJECT")
public class Project extends Model {





    @Constraints.Required
    private String pname;

    @Id
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;


    public Project (){

    }

    public Project(String pname, Long id, List<Employee> employees) {
        this.pname = pname;
        this.id = id;
    }


    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }




    public String getPname(){
        return pname;
    }

    public void setPname(String pname){
        this.pname = pname;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    }