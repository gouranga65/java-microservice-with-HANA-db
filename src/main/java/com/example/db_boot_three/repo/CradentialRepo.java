package com.example.db_boot_three.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.db_boot_three.entity.Cendentials;

@Repository
public interface CradentialRepo extends JpaRepository<Cendentials, String> {

}
