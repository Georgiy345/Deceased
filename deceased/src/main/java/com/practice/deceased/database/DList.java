package com.practice.deceased.database;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "deceased_citizens")
public class DList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zags_name")
    private String zagsName;
    private String famr;
    private String namer;
    private String otchr;
    private Date dataro;
    private Date datar;
    private String countryh;
    private String stated;
    private String depd;
    private String townd;
    private String mesthml;
    private String nameu;
    private String numh;
    private String numk;
    private String numf;
    private String nomakt;
    private Date datreg;
    private String birthPlace;
    private String deathPlace;
    private int pol;
    private String citizen;
    private String poslmz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZagsName() {
        return zagsName;
    }

    public void setZagsName(String zagsName) {
        this.zagsName = zagsName;
    }

    public String getFamr() {
        return famr;
    }

    public void setFamr(String famr) {
        this.famr = famr;
    }

    public String getNamer() {
        return namer;
    }

    public void setNamer(String namer) {
        this.namer = namer;
    }

    public String getOtchr() {
        return otchr;
    }

    public void setOtchr(String otchr) {
        this.otchr = otchr;
    }

    public Date getDataro() {
        return dataro;
    }

    public void setDataro(Date dataro) {
        this.dataro = dataro;
    }

    public Date getDatar() {
        return datar;
    }

    public void setDatar(Date datar) {
        this.datar = datar;
    }

    public String getCountryh() {
        return countryh;
    }

    public void setCountryh(String countryh) {
        this.countryh = countryh;
    }

    public String getStated() {
        return stated;
    }

    public void setStated(String stated) {
        this.stated = stated;
    }

    public String getDepd() {
        return depd;
    }

    public void setDepd(String depd) {
        this.depd = depd;
    }

    public String getTownd() {
        return townd;
    }

    public void setTownd(String townd) {
        this.townd = townd;
    }

    public String getMesthml() {
        return mesthml;
    }

    public void setMesthml(String mesthml) {
        this.mesthml = mesthml;
    }

    public String getNameu() {
        return nameu;
    }

    public void setNameu(String nameu) {
        this.nameu = nameu;
    }

    public String getNumh() {
        return numh;
    }

    public void setNumh(String numh) {
        this.numh = numh;
    }

    public String getNumk() {
        return numk;
    }

    public void setNumk(String numk) {
        this.numk = numk;
    }

    public String getNumf() {
        return numf;
    }

    public void setNumf(String numf) {
        this.numf = numf;
    }

    public String getNomakt() {
        return nomakt;
    }

    public void setNomakt(String nomakt) {
        this.nomakt = nomakt;
    }

    public Date getDatreg() {
        return datreg;
    }

    public void setDatreg(Date datreg) {
        this.datreg = datreg;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(String deathPlace) {
        this.deathPlace = deathPlace;
    }

    public int getPol() {
        return pol;
    }

    public void setPol(int pol) {
        this.pol = pol;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getPoslmz() {
        return poslmz;
    }

    public void setPoslmz(String poslmz) {
        this.poslmz = poslmz;
    }
}
