package ru.tusur.gpo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.tusur.gpo.data.PlaceOfRegistration;

/**
 * Created by maxim on 31.03.17.
 */

@RepositoryRestResource(collectionResourceRel = "placeOfRegistration", path = "placeOfRegistration")
public interface PlaceOfRegistrationRepository extends PagingAndSortingRepository<PlaceOfRegistration, Long> {

}
