package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.deploy.Entity.Deploy;
import com.practice.repository.Deployeeemp;



@Service
public class Deployservice {

    @Autowired
    private Deployeeemp deployeeemp;

    // CREATE MULTIPLE
    public List<Deploy> createDeploy(List<Deploy> deployList) {
        return deployeeemp.saveAll(deployList);
    }

    // GET ALL
    public List<Deploy> getAlldeploy() {
        return deployeeemp.findAll();
    }

    // GET BY ID
    public Deploy getById(Long id) {
        return deployeeemp.findById(id).orElse(null);
    }

    public Deploy updatedeploy(Long id, Deploy updated) {

        // Check if record exists
        Deploy exists = deployeeemp.findById(id).orElse(null);

        if (exists == null) {
            return null;  // ID not found
        }

        // Update only fields — DO NOT touch ID
        exists.setName(updated.getName());
        exists.setLocation(updated.getLocation());

        // Save updated record
        return deployeeemp.save(exists);
    } 
    // UPDATE SINGLE
   /* public Deploy updatedeploy(Integer id, Deploy updated) {
        Deploy exists = deployeeemp.findById(id).orElse(null);

        if (exists == null) {
            return null; // ID not found
        }

        // DO NOT UPDATE ID
        exists.setName(updated.getName());
        exists.setLocation(updated.getLocation());

        return deployeeemp.save(exists); // return saved entity
    }*/

    // DELETE
    public boolean deleteDeploy(Long id) {
        if (deployeeemp.existsById(id)) {
            deployeeemp.deleteById(id);
            return true;
        }
        return false;
    }
}