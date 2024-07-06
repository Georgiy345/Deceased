package com.practice.deceased.controllers;

import com.practice.deceased.database.DList;
import com.practice.deceased.service.DeceasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deceased")
public class MainController {
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

    @DeleteMapping("/{id}")
    public void deleteDeceasedCitizen(@PathVariable Long id) {
        service.deleteDeceasedCitizen(id);
    }
}