package hello;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;



/**
 *
 * Created by harisghauri on 1/12/2017.
 */

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> buddies;

    
    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public List<BuddyInfo> getAddressBook() {
        return buddies;
    }

    public void setAddressBook(List<BuddyInfo> addressBook) {
        this.buddies = addressBook;
    }

    public void getBuddiesName(){
        for (int i = 0 ; i < buddies.size() ; i++){
            System.out.println(buddies.get(i).getName());
        }
    }
    
    public Integer getId() {
        return id;
    }

    public void removeBuddy(int index){
        buddies.remove(index);
    }


    public void addBuddy(BuddyInfo abuddy){
        buddies.add(abuddy);
    }

    public int getSize(){
        return buddies.size();
    }






/*
    public static void main(String[] args) {


        BuddyInfo buddy= new BuddyInfo();
        BuddyInfo buddy2 = new BuddyInfo();
        buddy.setName("Haris");
        buddy.setPhone_nummber("613");
        buddy2.setName("Tanzeel");
        buddy2.setPhone_nummber("613");

        AddressBook buddies = new AddressBook();

        buddies.addBuddy(buddy);
        buddies.addBuddy(buddy2);




        buddies.addBuddy(buddy2);
        buddies.addBuddy(buddy2);

        buddies.removeBuddy(0);
    }
*/



}
