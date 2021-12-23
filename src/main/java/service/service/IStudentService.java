package service.service;

import model.Classs;
import model.Student;

import java.util.Optional;

public interface IStudentService {

    Optional<Student> findById(Long id);

    void save(Student student);

    void remove(Long id);

    Iterable<Student> findAllByClasss(Classs classs);

    Iterable<Student> findAllByOrderByScoreAsc();
    Iterable<Student> findByName(String name);
    Iterable<Student> findAllByScoreGreaterThan8();
}
