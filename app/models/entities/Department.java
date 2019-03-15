package models.entities;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.employees.*;


@Entity
@Table(name = "DEPARTMENT")
public class Department extends Model{

    @Id
    private Long id;


    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
    private List<Employee> employees;

    

    public Department() {
    }

    public Department(Long id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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


    public List<Employee> getEmployees() {
        return employees;
    }



    public static final Finder<Long, Department> find = new Finder<>(Department.class);

    public static final List<Department> findAll() {
        return Department.find.all();
    }

    public static Map<String,String> options(){
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Department d: Department.findAll()){
            options.put(d.getId().toString(),d.getName());
        }
        return options;

    }



}
