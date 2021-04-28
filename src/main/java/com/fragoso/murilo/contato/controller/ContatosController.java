package com.fragoso.murilo.contato.controller;

import java.util.List;

import com.fragoso.murilo.contato.model.Contato;
import com.fragoso.murilo.contato.repository.Contatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contatos")
public class ContatosController {
    @Autowired
    private Contatos contatos;
    
    @GetMapping
    public ModelAndView listar() {
        List<Contato> lista = contatos.findAll();

        ModelAndView modelAndView = new ModelAndView("contatos");
        modelAndView.addObject("contatos", lista);

        return modelAndView;
    }
}
