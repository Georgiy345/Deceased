package com.practice.deceased.service;

import com.practice.deceased.database.DList;
import com.practice.deceased.repo.DListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeceasedService {
    @Autowired
    private DListRepository repository;

    public List<DList> getAllDeceasedCitizens() {
        return repository.findAll();
    }

    public DList saveDeceasedCitizen(DList deceasedCitizen) {
        return repository.save(deceasedCitizen);
    }

    public void deleteDeceasedCitizen(Long id) {
        repository.deleteById(id);
    }
}
