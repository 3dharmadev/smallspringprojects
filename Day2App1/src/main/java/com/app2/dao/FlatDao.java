package com.app2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app2.model.Flat;

public interface FlatDao  extends  JpaRepository<Flat, Integer>{

}
