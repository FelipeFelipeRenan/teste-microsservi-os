package teste.youtube.course.endpoint.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import teste.youtube.course.model.Course;
import teste.youtube.course.repository.CourseRepository;


@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @___(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable){
        return courseRepository.findAll(pageable);
    }
}
