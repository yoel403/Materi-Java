package tugasKelimaOOP.services;

import java.util.List;

public interface Services<T,K> {
    List<T> findAll();
    T findById(K id);
    void save (T data);
    void delete (K id);
}
