package com.testebackend.amzmp.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/amz-mp/ap1")
public class IndexController {
    @GetMapping("/index")
    public String login() {
        return "/login";
    }

    @GetMapping("/painel")
    public String painel() {
        return "/amz-mp/cliente/listar-cliente";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "/amz-mp/cliente/novo-cliente";
    }

     @GetMapping("/editar")
    public String editar() {
        return "/amz-mp/cliente/editar";
    }

    
    
}
