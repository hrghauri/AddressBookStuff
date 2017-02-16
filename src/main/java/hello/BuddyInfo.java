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

    String phoneNumber;

    protected BuddyInfo(){
        System.out.println("BuddyInfo ....");
    }


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

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;}

    public Integer getId() {
        return id;
    }
}
