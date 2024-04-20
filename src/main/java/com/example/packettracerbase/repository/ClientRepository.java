package com.example.packettracerbase.repository;

import com.example.packettracerbase.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    // Add custom queries if needed
}
