package com.practice.deceased.service;

import com.practice.deceased.database.DList;
import com.practice.deceased.repo.DListRepository;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.io.InputStream;

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
        DList existingDeceasedCitizen = repository.findById(id).orElseThrow(() -> new RuntimeException("Deceased Citizen not found"));
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

    public List<DList> processExcelFile(InputStream inputStream) throws Exception {
        Workbook workbook = new Workbook(inputStream);
        Worksheet worksheet = workbook.getWorksheets().get(0);

        List<DList> deceasedCitizens = new ArrayList<>();

        int rowsCount = worksheet.getCells().getMaxDataRow();
        for (int i = 1; i <= rowsCount; i++) {
            DList deceasedCitizen = new DList();
            deceasedCitizen.setZagsName(worksheet.getCells().get(i, 0).getStringValue());
            deceasedCitizen.setFamr(worksheet.getCells().get(i, 1).getStringValue());
            deceasedCitizen.setNamer(worksheet.getCells().get(i, 2).getStringValue());
            deceasedCitizen.setOtchr(worksheet.getCells().get(i, 3).getStringValue());
            deceasedCitizen.setDataro(worksheet.getCells().get(i, 4).getStringValue());
            deceasedCitizen.setDatar(worksheet.getCells().get(i, 5).getStringValue());
            deceasedCitizen.setCountryh(worksheet.getCells().get(i,6).getStringValue());
            deceasedCitizen.setStated(worksheet.getCells().get(i,7).getStringValue());
            deceasedCitizen.setDepd(worksheet.getCells().get(i,8).getStringValue());
            deceasedCitizen.setTownd(worksheet.getCells().get(i,9).getStringValue());
            deceasedCitizen.setMesthml(worksheet.getCells().get(i,10).getStringValue());
            deceasedCitizen.setNameu(worksheet.getCells().get(i,11).getStringValue());
            deceasedCitizen.setNumh(worksheet.getCells().get(i,12).getStringValue());
            deceasedCitizen.setNumk(worksheet.getCells().get(i,13).getStringValue());
            deceasedCitizen.setNumf(worksheet.getCells().get(i,14).getStringValue());
            deceasedCitizen.setNomakt(worksheet.getCells().get(i,15).getStringValue());
            deceasedCitizen.setDatreg(worksheet.getCells().get(i,16).getStringValue());
            deceasedCitizen.setBirthPlace(worksheet.getCells().get(i,17).getStringValue());
            deceasedCitizen.setDeathPlace(worksheet.getCells().get(i,18).getStringValue());
            deceasedCitizen.setPol(worksheet.getCells().get(i,19).getStringValue());
            deceasedCitizen.setCitizen(worksheet.getCells().get(i,20).getStringValue());
            deceasedCitizen.setPoslmz(worksheet.getCells().get(i,21).getStringValue());

            DList savedCitizen = repository.save(deceasedCitizen);
            deceasedCitizens.add(savedCitizen);
        }
        return deceasedCitizens;
    }
}
