package com.coreapi.coreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreapi.coreapi.model.Container;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Long>{

}