package com.genesys.repository;

import com.genesys.model.GenesysEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenesysEmployeeRepository extends JpaRepository<GenesysEmployee,Integer> {
}
