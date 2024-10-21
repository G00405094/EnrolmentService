package ie.atu.enrolmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {
    private EnrolRepostiory enrolRepostiory;

    @Autowired
    public EnrollService(EnrolRepostiory enrolRepostiory) {
        this.enrolRepostiory = enrolRepostiory;
    }

    public List<Student>getAllStudents(){
        return enrolRepostiory.findAll();
    }

    public void addStudent(Student student){
       enrolRepostiory.save(student);
    }
}
