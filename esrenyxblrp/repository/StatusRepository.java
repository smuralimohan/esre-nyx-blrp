package com.paypal.esrenyxblrp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.esrenyxblrp.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
    
     List<Status> findAll(); 
}
