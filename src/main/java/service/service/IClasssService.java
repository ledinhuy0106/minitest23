package service.service;

import model.Classs;

import java.util.Optional;

public interface IClasssService{
    Iterable<Classs> findAll();

    Optional<Classs> findById(Long id);

    void save(Classs classs);

    void remove(Long id);
}
