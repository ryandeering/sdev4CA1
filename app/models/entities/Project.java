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

    public void setId(Long id){
        this.id = id;
    }




    public String getPname(){
        return pname;
    }

    public void setPname(String pname){
        this.pname = pname;
    }


    public static final Finder<Long, Project> find = new Finder<>(Project.class);

    public static final List<Project> findAll() {
        return Project.find.all();
    }

    public static Map<String,String> options(){
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Project p: Project.findAll()){
            options.put(p.getId().toString(),p.getPname());
        }
        return options;


    }



    public static boolean inProject(Long project, String employee) {
        return find.query().where().eq("employees.email", employee)
                .eq("id", project)
                .findList().size() > 0;
    }



    }