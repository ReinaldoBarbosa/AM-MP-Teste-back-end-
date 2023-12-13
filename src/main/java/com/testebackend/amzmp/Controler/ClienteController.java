package com.testebackend.amzmp.Controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testebackend.amzmp.Model.Cliente;
import com.testebackend.amzmp.Repository.ClienteRepository;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("/amz-mp/cliente")
public class ClienteController {
    List<Cliente> listCliente = new ArrayList<Cliente>();

    @Autowired
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    //Carregar a listagem clientes

    @GetMapping("/listar-cliente")
    public String ListarCliente(Model model ) {
        model.addAttribute("cliente" , repository.findAll());
        return "cliente";
    }

    //Carregar o formulario cadastro
    
    @GetMapping("/novo-cliente")
    public String CadastrarCliente(Cliente cliente, Model model) {
        model.addAttribute("cliente", cliente);
        return "novo-cliente";
    }
    
    //Cadastrar (inserir)

    @PostMapping("/add-cliente")
    public String addClinte(Cliente cliente, BindingResult result, Model model) {
        if (result.hasErrors()) {
                return "/novo-cliente";
        }

        Cliente clienteDb = repository.save(cliente);
        cliente.setStatus_cliente(true);

        return "redirect:/amz-mp/cliente/listar-cliente";
    }
    

}
