package service.Ipml;

import model.Classs;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IClasssRepository;
import service.service.IClasssService;

import java.util.Optional;

@Service
public class ClasssService implements IClasssService {
    @Autowired
    private IClasssRepository classsRepository;

    @Override
    public Iterable<Classs> findAll() {
        return classsRepository.findAll();
    }

    @Override
    public Optional<Classs> findById(Long id) {
        return classsRepository.findById(id);
    }

    @Override
    public void save(Classs classs) {
        classsRepository.save(classs);
    }

    @Override
    public void remove(Long id) {
        classsRepository.deleteById(id);
    }
}
