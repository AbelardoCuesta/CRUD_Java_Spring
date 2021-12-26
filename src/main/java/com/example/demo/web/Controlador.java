/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.web;

import com.example.demo.domain.Persona;
import com.example.demo.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Dell
 */
@Controller
public class Controlador {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardar(persona);
        return "redirect:/";
    }
}
