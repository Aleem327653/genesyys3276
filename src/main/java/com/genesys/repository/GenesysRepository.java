package com.genesys.repository;

import com.genesys.model.Genesys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenesysRepository extends JpaRepository<Genesys,Integer> {
}
