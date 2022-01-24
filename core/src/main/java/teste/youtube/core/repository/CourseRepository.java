package teste.youtube.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import teste.youtube.core.model.Course;

@Component
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
}
