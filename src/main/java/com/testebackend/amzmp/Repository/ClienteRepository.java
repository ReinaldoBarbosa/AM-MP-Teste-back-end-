package com.testebackend.amzmp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testebackend.amzmp.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
