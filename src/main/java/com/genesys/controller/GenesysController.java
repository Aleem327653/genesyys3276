package com.genesys.controller;

import com.genesys.model.Genesys;
import com.genesys.service.GenesysServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genesys")
public class GenesysController {

    @Autowired
    private GenesysServiceImp serviceImp;

    @GetMapping
    public ResponseEntity<List<Genesys>> getAllData(){
        try{
            List<Genesys> list=this.serviceImp.getAll();
            return new ResponseEntity<>(list,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public ResponseEntity<Genesys> addGenesysData(@RequestBody Genesys genesys){
        try{
            Genesys data=serviceImp.addGenesys(genesys);
            return new ResponseEntity<>(data,HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Genesys> getDataById(@PathVariable Integer id){
        try{
            Genesys data=this.serviceImp.findGenesysById(id);
            return new ResponseEntity<>(data,HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
