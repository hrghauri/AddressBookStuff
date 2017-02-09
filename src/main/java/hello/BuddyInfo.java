package hello;

/**
 * Created by harisghauri on 1/12/2017.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {




    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    String name;

    String address;

    String phone_nummber;

    protected BuddyInfo(){}


    public BuddyInfo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_nummber() {
        return phone_nummber;
    }


    public void setPhone_nummber(String phone_nummber) {
        this.phone_nummber = phone_nummber;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
