package teste.youtube.course.endpoint.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.youtube.course.endpoint.services.CourseService;
import teste.youtube.course.model.Course;
import java.awt.print.Pageable;

@Slf4j
@RequiredArgsConstructor(onConstructor = @___(@Autowired))
@RestController
@RequestMapping("v1/admin/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable){
        return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);

    }
}