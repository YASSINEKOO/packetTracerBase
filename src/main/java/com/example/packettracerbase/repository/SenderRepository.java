package com.example.packettracerbase.repository;

import com.example.packettracerbase.model.Sender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepository extends JpaRepository<Sender, String> {
    // Add custom queries if needed
}
