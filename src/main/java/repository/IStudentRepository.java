package repository;
import model.Classs;
import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    Iterable<Student> findAllByClasss(Classs classs);

    Iterable<Student> findAllByOrderByScoreAsc();

    Iterable<Student> findByName(String name);
}
