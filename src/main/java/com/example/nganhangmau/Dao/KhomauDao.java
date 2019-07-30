/*
package com.example.nganhangmau.Dao;

import com.example.nganhangmau.Entities.khoMau;
import com.example.nganhangmau.Model.KhoMauInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class KhomauDao {
    @Autowired
    private EntityManager entityManager;

    public KhomauDao() {
    }

    public khoMau findById(int id) {
        return this.entityManager.find(khoMau.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<khoMau> listKhoMauInfo() {
        String sql = "select  new  " + khoMau.class.getName() + "(e.id,e.nhommau,e.donvi) " + " from " + khoMau.class.getName() + " e";
        Query query = entityManager.createQuery(sql, khoMau.class);
        return query.getResultList();
    }
}
*/
