package com.genesys.service;

import com.genesys.model.GenesysEmployee;
import com.genesys.repository.GenesysEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenesysEmployeeServiceImp implements GenesysEmployeeService{
    @Autowired
    private GenesysEmployeeRepository repository;
    @Override
    public GenesysEmployee addGenesysEmployee(GenesysEmployee employee) {
        return repository.save(employee);
    }

    @Override
    public List<GenesysEmployee> getAllGenesysEmployee() {
        return repository.findAll();
    }
}
