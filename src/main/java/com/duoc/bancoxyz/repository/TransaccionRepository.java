package com.duoc.bancoxyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.bancoxyz.entity.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {

}
