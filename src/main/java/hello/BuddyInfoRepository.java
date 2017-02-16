package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by harisghauri on 2/2/2017.
 */
@RepositoryRestResource(collectionResourceRel = "buddies", path = "buddies")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Integer> {

    List<BuddyInfo> findByName(@Param("name")String name);
}
