package ie.atu.enrolmentservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EnrolRepostiory extends MongoRepository<Student, String> {
    List<Student>findByStudentId(String studentID);
}
