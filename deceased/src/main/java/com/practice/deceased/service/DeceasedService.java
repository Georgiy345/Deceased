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

    public DList updateDeceasedCitizen(Long id, DList updatedDeceasedCitizen) {
        DList existingDeceasedCitizen = repository.findById(id).orElseThrow();
        existingDeceasedCitizen.setZagsName(updatedDeceasedCitizen.getZagsName());
        existingDeceasedCitizen.setFamr(updatedDeceasedCitizen.getFamr());
        existingDeceasedCitizen.setNamer(updatedDeceasedCitizen.getNamer());
        existingDeceasedCitizen.setOtchr(updatedDeceasedCitizen.getOtchr());
        existingDeceasedCitizen.setDataro(updatedDeceasedCitizen.getDataro());
        existingDeceasedCitizen.setDatar(updatedDeceasedCitizen.getDatar());
        existingDeceasedCitizen.setCountryh(updatedDeceasedCitizen.getCountryh());
        existingDeceasedCitizen.setStated(updatedDeceasedCitizen.getStated());
        existingDeceasedCitizen.setDepd(updatedDeceasedCitizen.getDepd());
        existingDeceasedCitizen.setTownd(updatedDeceasedCitizen.getTownd());
        existingDeceasedCitizen.setMesthml(updatedDeceasedCitizen.getMesthml());
        existingDeceasedCitizen.setNameu(updatedDeceasedCitizen.getNameu());
        existingDeceasedCitizen.setNumh(updatedDeceasedCitizen.getNumh());
        existingDeceasedCitizen.setNumk(updatedDeceasedCitizen.getNumk());
        existingDeceasedCitizen.setNumf(updatedDeceasedCitizen.getNumf());
        existingDeceasedCitizen.setNomakt(updatedDeceasedCitizen.getNomakt());
        existingDeceasedCitizen.setDatreg(updatedDeceasedCitizen.getDatreg());
        existingDeceasedCitizen.setBirthPlace(updatedDeceasedCitizen.getBirthPlace());
        existingDeceasedCitizen.setDeathPlace(updatedDeceasedCitizen.getDeathPlace());
        existingDeceasedCitizen.setPol(updatedDeceasedCitizen.getPol());
        existingDeceasedCitizen.setCitizen(updatedDeceasedCitizen.getCitizen());
        existingDeceasedCitizen.setPoslmz(updatedDeceasedCitizen.getPoslmz());

        return repository.save(existingDeceasedCitizen);
    }
}
