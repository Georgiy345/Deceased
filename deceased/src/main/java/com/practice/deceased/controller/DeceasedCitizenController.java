package com.practice.deceased.controller;

import com.practice.deceased.database.DList;
import com.practice.deceased.service.DeceasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.io.*;

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

    @PostMapping("/upload")
    public ResponseEntity<List<DList>> uploadFile(@RequestParam("file") MultipartFile file) {
        try (InputStream inputStream = file.getInputStream()) {
            List<DList> deceasedCitizens = service.processExcelFile(inputStream);
            return ResponseEntity.ok(deceasedCitizens);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
