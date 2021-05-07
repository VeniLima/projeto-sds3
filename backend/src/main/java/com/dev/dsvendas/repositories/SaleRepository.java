package com.dev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsvendas.entities.Sale;

// Já é um componente por padrão
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
