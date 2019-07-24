package com.example.nganhangmau.Repository;
import com.example.nganhangmau.Entities.Nguoihienmau;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HienmauRepository extends CrudRepository<Nguoihienmau,Integer> {

    Iterable<Nguoihienmau> findByHoTen(String ten);

}
