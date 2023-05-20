package com.debjit.pal.Dphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debjit.pal.Dphone.model.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer>{

}