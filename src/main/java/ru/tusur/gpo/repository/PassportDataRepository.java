package ru.tusur.gpo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.tusur.gpo.data.PassportData;

/**
 * Created by maxim on 30.03.17.
 */
@RepositoryRestResource(collectionResourceRel = "passportData", path = "passportData")
public interface PassportDataRepository extends PagingAndSortingRepository<PassportData, Long> {

}