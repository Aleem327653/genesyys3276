package com.genesys.service;

import com.genesys.model.Genesys;
import com.genesys.repository.GenesysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenesysServiceImp implements GenesysService{
    @Autowired
    private GenesysRepository genesysRepository;
    @Override
    public Genesys addGenesys(Genesys genesys) {
        return genesysRepository.save(genesys);
    }

    @Override
    public Genesys findGenesysById(Integer id) {
        return genesysRepository.findById(id).get();
    }

    @Override
    public List<Genesys> getAll() {
        return genesysRepository.findAll();
    }
}
