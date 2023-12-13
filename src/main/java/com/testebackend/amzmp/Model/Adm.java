package com.testebackend.amzmp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adm")
public class Adm {

    @Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento de 1 em 1
	private long id;
    
    private String email;
    private String Senha;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }

}
