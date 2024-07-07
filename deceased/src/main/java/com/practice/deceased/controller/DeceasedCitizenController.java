package com.practice.deceased.controller;

import com.practice.deceased.database.DList;
import com.practice.deceased.service.DeceasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deceased")
public class DeceasedCitizenController {
    @Autowired
    private DeceasedService service;

    @GetMapping
    public List<DList> getAllDeceasedCitizens() {
        return service.getAllDeceasedCitizens();
    }

    @PostMapping
    public DList createDeceasedCitizen(@RequestBody DList deceasedCitizen) {
        return service.saveDeceasedCitizen(deceasedCitizen);
    }

    @PutMapping("/{id}")
    public DList updateDeceasedCitizen(@PathVariable Long id, @RequestBody DList updatedDeceasedCitizen) {
        return service.updateDeceasedCitizen(id, updatedDeceasedCitizen);
    }

    @DeleteMapping("/{id}")
    public void deleteDeceasedCitizen(@PathVariable Long id) {
        service.deleteDeceasedCitizen(id);
    }
}
