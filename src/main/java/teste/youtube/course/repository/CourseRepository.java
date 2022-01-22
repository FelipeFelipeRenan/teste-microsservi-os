package teste.youtube.course.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import teste.youtube.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{
}
