package ru.tusur.gpo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.tusur.gpo.data.Education;

import java.util.List;

/**
 * Created by nkurtushin on 29.03.2017.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface EducationRepository extends PagingAndSortingRepository<Education, Long> {
    List<Education> findAll();
}
