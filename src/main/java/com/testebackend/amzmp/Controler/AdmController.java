package com.testebackend.amzmp.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testebackend.amzmp.Model.Adm;
import com.testebackend.amzmp.Model.Cliente;
import com.testebackend.amzmp.Repository.AdmRepository;

@Controller
@RequestMapping("/amz-mp/adm")
public class AdmController {

    @Autowired
    private AdmRepository admRepository;
    
     public AdmController(AdmRepository admRepository) {
        this.admRepository = admRepository;
    }

    @GetMapping("/novo-adm")
    public String CadastrarCliente(Adm adm, Model model) {

        adm.setEmail("admin@admin.com");
        adm.setSenha("admin");

        model.addAttribute("adm", adm);
        return "novo-cliente";
    }
    
    //Cadastrar (inserir)

    @PostMapping("/add-adm")
    public String addClinte(Adm adm, BindingResult result, Model model) {
        

        Adm admDb = admRepository.save(adm);

        return "redirect:/login";
    }
}
