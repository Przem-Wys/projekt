package Controllers;

import Services.CourseService;
import com.wysokinski.Projekt.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseControler {
    private List<Course> courses = new ArrayList<>();

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Course> createCourse (@RequestBody Course course){
        Course course1 = courseService.createCourse(course);
        System.out.println("creating");
        return new ResponseEntity<>(course1, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/available",method =RequestMethod.GET )
    public ResponseEntity<List<Course>> getAvailableCourses (){
        System.out.println("available");
        return new ResponseEntity<>(courseService.getAllCourse(),HttpStatus.OK);
    }
}
