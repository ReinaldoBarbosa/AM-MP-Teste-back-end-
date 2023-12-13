package com.testebackend.amzmp.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/amz-mp/api")
public class IndexController {
    @GetMapping("/index")
    public String login() {
        return "redirect:/login";
    }

    @GetMapping("/painel")
    public String painel() {
        return "redirect:/amz-mp/cliente/listar-cliente";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "redirect:/cliente/novo-cliente";
    }

}
