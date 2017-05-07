package ru.tusur.gpo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.tusur.gpo.data.ActualAddressOfResidence;


/**
 * Created by maxim on 06.04.17.
 */
@RepositoryRestResource(collectionResourceRel = "actualaddr", path = "actualaddr")
public interface ActualAddressOfResidenceRepository extends PagingAndSortingRepository<ActualAddressOfResidence, Long> {

}
