package com.example.packettracerbase.repository;

import com.example.packettracerbase.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {
    // Add custom queries if needed
}
