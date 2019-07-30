package com.example.nganhangmau.Service;

import com.example.nganhangmau.Entities.Nguoihienmau;
import com.example.nganhangmau.Entities.khoMau;

public interface HienmauService {

/*    Iterable<Nguoihienmau> findAll();*/

    Iterable<Nguoihienmau> searchh(String hoTen);

    void save(Nguoihienmau nguoihienmau);
}
