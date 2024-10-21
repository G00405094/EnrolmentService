package ie.atu.enrolmentservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnrollController {
    private EnrollService enrollService;

    @Autowired
    public EnrollController(EnrollService enrollService) {
        this.enrollService = enrollService;
    }

    @GetMapping
    public List<Student> getStudentList()
    {
        return enrollService.getAllStudents();
    }

    @PostMapping("/add")
    public Student addStudent(@Valid @RequestBody Student student){
        enrollService.addStudent(student);
        return student;
    }
}
