package com.coreapi.coreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreapi.coreapi.model.Handling;

@Repository
public interface HandlingRepository extends JpaRepository<Handling, Long>{

}