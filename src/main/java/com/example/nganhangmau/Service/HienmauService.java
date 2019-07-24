package com.example.nganhangmau.Service;

import com.example.nganhangmau.Entities.Nguoihienmau;

public interface HienmauService {

/*    Iterable<Nguoihienmau> findAll();*/

    Iterable<Nguoihienmau> search(String q);

    void save(Nguoihienmau nguoihienmau);
}
