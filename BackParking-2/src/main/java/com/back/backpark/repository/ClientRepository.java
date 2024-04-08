package com.back.backpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

import com.back.backpark.model.Client; 

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { // Correction de la typographie de Long

}
