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

    public static final Finder<Long, Address> find = new Finder<>(Address.class);

    public static final List<Address> findAll() {
        return Address.find.all();
    }


    public static Map<String,String> options(){
        LinkedHashMap<String,String> options = new LinkedHashMap<>();

        for(Address a: Address.findAll()){
            options.put(a.getId().toString(),a.getAddress());
        }
        return options;


    }






}
