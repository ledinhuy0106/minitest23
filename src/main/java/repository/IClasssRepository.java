package repository;

import model.Classs;
import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClasssRepository extends JpaRepository<Classs, Long> {
}
