package com.duoc.bancoxyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.bancoxyz.entity.CuentaAnual;

@Repository
public interface CuentaAnualRepository extends JpaRepository<CuentaAnual, Long> {

}
