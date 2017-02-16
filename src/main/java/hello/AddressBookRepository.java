package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

/**
 * Created by harisghauri on 2/2/2017.
 */
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook, Integer> {
    List<AddressBook> findById(Integer Id);

}
