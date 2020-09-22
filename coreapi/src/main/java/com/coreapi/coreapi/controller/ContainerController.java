package com.coreapi.coreapi.controller;

import java.util.List;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coreapi.coreapi.model.Container;
import com.coreapi.coreapi.repository.ContainerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class ContainerController {
    @Autowired
    private ContainerRepository containerRepository;

    @GetMapping("/containers")
    public List<Container> getAllContainers() {
        return containerRepository.findAll();
    }

    @GetMapping("/containers/{id}")
    public ResponseEntity<Container> getContainerById(@PathVariable(value = "id") Long id) {
        Container container = containerRepository.findById(id).orElse(null);;
        return ResponseEntity.ok().body(container);
    }

    @PostMapping("/containers")
    public Container createContainer(@RequestBody final Container container) {
        return containerRepository.save(container);
    }

    @PutMapping("/containers/{id")
    public ResponseEntity<Container> updateContainer(@PathVariable(value = "id") final Long id, 
            @RequestBody final Container containerForm) {
            final Container container = containerRepository.findById(id).orElse(null);;
            container.setClient(containerForm.getClient());
            container.setContract(containerForm.getContract());
            container.setType(containerForm.getType());
            container.setContainerIsFull(containerForm.getContainerIsFull());
            container.setCategory(containerForm.getCategory());
            containerRepository.save(container);
            return ResponseEntity.ok().body(container);
    }

    @DeleteMapping("/containers/{id}")
    public Map<String, Boolean> deleteContainer(@PathVariable(value = "id") final Long id) {
        Container container = containerRepository.findById(id).orElse(null);;
        containerRepository.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}