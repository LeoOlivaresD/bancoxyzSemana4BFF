package com.duoc.bancoxyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.bancoxyz.entidades.Interes;

@Repository
public interface InteresRepository extends JpaRepository<Interes, Long> {

}
