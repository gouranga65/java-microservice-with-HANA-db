package com.example.db_boot_three.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.db_boot_three.entity.Cendentials;
import com.example.db_boot_three.service.CendentialsService;

@RestController
public class cendentialsControl {
    @Autowired
    private CendentialsService service;

    @GetMapping("/all")
    public List<Cendentials> getAllValue() {
        return service.getall();
    }

    @PostMapping("/data")
    public Cendentials createElement(@RequestBody Cendentials cendentials) {
        return service.createData(cendentials);
    }

    @GetMapping("/singleData/{id}")
    public Optional<Cendentials> getData(@PathVariable("id") String id) {
        return service.getById(id);
    }

    @DeleteMapping("/deleteId/{id}")
    public String deleteCredential(@PathVariable("id") String id) {
        return service.deleteData(id);
    }

    @PutMapping("update/{id}")
    public Cendentials updateCradential(@PathVariable("id") String id, @RequestBody Cendentials cendentials) {
        return service.updatedata(id, cendentials);

    }
}
