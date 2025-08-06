package com.temperaturedata.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.temperaturedata.Dao.OrganizationDao;
import com.temperaturedata.model.Organization;



@RestController
public class OrganizationController {
    @Autowired
    private final OrganizationDao organizationDao;

    public OrganizationController(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }

    @PostMapping("/organizations")
    public ResponseEntity<Organization> save(@RequestBody Organization myorganization){
        Organization  createdOrganization = organizationDao.save(myorganization);
        return ResponseEntity.ok(createdOrganization);
    
    }

    @GetMapping("/organizations")
    public List<Organization> getList(){
        Organization organization = new Organization("OurKadaiTechnology","9876543210","ourkadai@ourkadai.com","ourkadai.com",101);
        return Arrays.asList(organization);

    }


}
