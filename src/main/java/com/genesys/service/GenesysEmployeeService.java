package com.genesys.service;

import com.genesys.model.GenesysEmployee;

import java.util.List;

public interface GenesysEmployeeService {
    public GenesysEmployee addGenesysEmployee(GenesysEmployee employee);
    public List<GenesysEmployee> getAllGenesysEmployee();

}
