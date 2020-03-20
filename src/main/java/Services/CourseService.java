package Services;

import Repository.BaseRepository;
import Repository.CourseRepository;
import com.wysokinski.Projekt.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService extends BaseService<Course, Long, CourseRepository> {

   Course getCourse (Long id);

   Course createCourse (Course course);
   List<Course> getAllCourse ();


}
