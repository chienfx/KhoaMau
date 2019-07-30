package com.example.nganhangmau.Service;

import com.example.nganhangmau.Entities.khoMau;

public interface KhomauService {
    Iterable<khoMau> search (String s);
    Iterable<khoMau> findAll();

}
