package com.testebackend.amzmp.Controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testebackend.amzmp.Model.Cliente;
import com.testebackend.amzmp.Repository.ClienteRepository;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/amz-mp/cliente")
public class ClienteController {
    List<Cliente> listCliente = new ArrayList<Cliente>();

    @Autowired
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listar-cliente")
    public String listarCliente(Model model ) {
        model.addAttribute("cliente" , repository.findAll());
        return "cliente";
    }
    

}
