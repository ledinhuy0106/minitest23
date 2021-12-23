package service.Ipml;

import model.Classs;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IStudentRepository;
import service.service.IStudentService;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Iterable<Student> findAllByClasss(Classs classs) {
        return studentRepository.findAllByClasss(classs);
    }

    @Override
    public Iterable<Student> findAllByOrderByScoreAsc() {
        return studentRepository.findAllByOrderByScoreAsc();
    }

    @Override
    public Iterable<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Iterable<Student> findAllByScoreGreaterThan8() {
        return studentRepository.findAllByScoreGreaterThan8();
    }
}
