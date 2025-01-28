package com.genesys.service;

import com.genesys.model.Genesys;

import java.util.List;

public interface GenesysService {
    public Genesys addGenesys(Genesys genesys);
    public Genesys findGenesysById(Integer id);
    public List<Genesys> getAll();
}
