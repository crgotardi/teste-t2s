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

import com.coreapi.coreapi.model.Handling;
import com.coreapi.coreapi.repository.HandlingRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class HandlingController {
    @Autowired
    private HandlingRepository handlingRepository;

    @GetMapping("/handlings")
    public List<Handling> getAllHandlings() {
        return handlingRepository.findAll();
    }

    @GetMapping("/handlings/{id}")
    public ResponseEntity<Handling> getHandlingById(@PathVariable(value = "id") Long id) {
        Handling handling = handlingRepository.findById(id).orElse(null);;
        return ResponseEntity.ok().body(handling);
    }

    @PostMapping("/handlings")
    public Handling createHandling(@RequestBody final Handling handling) {
        return handlingRepository.save(handling);
    }

    @PutMapping("/handlings/{id")
    public ResponseEntity<Handling> updateHandling(@PathVariable(value = "id") final Long id, 
            @RequestBody final Handling handlingForm) {
            final Handling handling = handlingRepository.findById(id).orElse(null);;
            handling.setClient(handlingForm.getClient());
            handling.setType(handlingForm.getType());
            handling.setCategory(handlingForm.getCategory());
            handling.setShip(handlingForm.getShip());
            handling.setStartDate(handlingForm.getStartDate());
            handling.setEndDate(handlingForm.getEndDate());
            handlingRepository.save(handling);
            return ResponseEntity.ok().body(handling);
    }

    @DeleteMapping("/handlings/{id}")
    public Map<String, Boolean> deleteHandling(@PathVariable(value = "id") final Long id) {
        Handling handling = handlingRepository.findById(id).orElse(null);;
        handlingRepository.deleteById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}