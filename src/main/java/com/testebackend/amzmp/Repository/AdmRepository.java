package com.testebackend.amzmp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.testebackend.amzmp.Model.Adm;

@Repository
public interface AdmRepository extends JpaRepository<Adm, Long>{
    
    @Query(value="SELECT * from adm u  where u.email=? and u.senha=?", nativeQuery = true)
	public Adm Login(String email, String senha);
    
}
