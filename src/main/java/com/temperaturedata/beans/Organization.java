package com.temperaturedata.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Organization implements Serializable {
    private String name;
    private String certificateid;
    private String type;
    private LocalDate dateOfInitiation;
    private String email;
    private String phone;
    private String ceo;
    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateOfInitiation() {
        return dateOfInitiation;
    }

    public void setDateOfInitiation(LocalDate dateOfInitiation) {
        this.dateOfInitiation = dateOfInitiation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String toString() {
        return this.name + " " +
                this.phone;
    }
}
