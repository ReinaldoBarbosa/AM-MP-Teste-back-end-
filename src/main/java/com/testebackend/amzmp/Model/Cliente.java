package com.testebackend.amzmp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private boolean status_cliente;

    public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco1) {
        endereco = endereco1;
    }


    public boolean isStatus_cliente() {
        return status_cliente;
    }
    public void setStatus_cliente(boolean status_cliente) {
        this.status_cliente = status_cliente;
    }

}
