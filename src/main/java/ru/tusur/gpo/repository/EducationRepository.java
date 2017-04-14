package ru.tusur.gpo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.tusur.gpo.data.Education;

import java.util.List;



@RepositoryRestResource(collectionResourceRel = "education", path = "education")
public interface EducationRepository extends PagingAndSortingRepository<Education, Long> {

}
