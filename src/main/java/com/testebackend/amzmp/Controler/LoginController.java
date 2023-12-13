package com.testebackend.amzmp.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.testebackend.amzmp.Model.Adm;
import com.testebackend.amzmp.Repository.AdmRepository;

@Controller
public class LoginController {

	@Autowired
	private AdmRepository admRepository;
    
    @GetMapping("/login")
	public String index(Model model, Adm adm) {
		
		model.addAttribute("adm", adm);
        return "index";
    }

    @PostMapping("/login")
	public String login(Model model, Adm adm){

		Adm admin = this.admRepository.Login(adm.getEmail(), adm.getSenha());

		if(admin != null) {
			return "redirect:/amz-mp/api/painel";
		}
		
		model.addAttribute("erro", "Email ou senha invalidos");
		return "index";

		
		

		
	}
}
