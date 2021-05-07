package com.dev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsvendas.entities.Seller;

// Já é um componente por padrão
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
