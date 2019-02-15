package models.entities;


import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;



@Entity
@Table(name = "ADDRESS")



public class Address extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String address;

    public Address(){
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }







}
