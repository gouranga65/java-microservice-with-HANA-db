package com.example.db_boot_three.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.db_boot_three.entity.Cendentials;
import com.example.db_boot_three.repo.CradentialRepo;

@Component
public class CendentialsService {
    @Autowired
    private CradentialRepo repo;

    public List<Cendentials> getall() {
        return repo.findAll();

    }

    public Optional<Cendentials> getById(String id) {
        return repo.findById(id);
    }

    public Cendentials createData(Cendentials cendentials) {
        return repo.save(cendentials);
    }

    public String deleteData(String id) {
        repo.deleteById(id);
        return "SUCCESS";
    }

    public Cendentials updatedata(String id, Cendentials cendentials) {
        return repo.save(cendentials);
    }
}
