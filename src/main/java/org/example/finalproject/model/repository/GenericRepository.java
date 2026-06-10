package org.example.finalproject.model.repository;

public interface GenericRepository<T,ID> {
    void save(T t);
    String findPasswordById(ID id);
    boolean existsByUsername(ID id);

}
