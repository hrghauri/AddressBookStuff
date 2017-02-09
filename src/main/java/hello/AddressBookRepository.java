package hello;

import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

/**
 * Created by harisghauri on 2/2/2017.
 */
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook, Integer> {
    List<AddressBook> findById(Integer Id);

}
