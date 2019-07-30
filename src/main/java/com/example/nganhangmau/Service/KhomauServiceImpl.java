package com.example.nganhangmau.Service;

import com.example.nganhangmau.Entities.khoMau;
import com.example.nganhangmau.Repository.KhomauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhomauServiceImpl implements KhomauService {
    private KhomauRepository khomauRepository;

    @Autowired
    public void setKhomauRepository(KhomauRepository khomauRepository) {
        this.khomauRepository = khomauRepository;
    }

    @Override
    public Iterable<khoMau> search(String s){
        return khomauRepository.findByNhommau(s);
    }

    @Override
    public  Iterable<khoMau> findAll(){
        return khomauRepository.findAll();
    }
}
