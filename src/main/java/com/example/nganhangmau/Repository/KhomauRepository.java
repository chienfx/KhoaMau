package com.example.nganhangmau.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.nganhangmau.Entities.khoMau;

public interface KhomauRepository extends CrudRepository<khoMau,Integer> {
    Iterable<khoMau> findByNhommau(String s);

}
