/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dao;

import com.example.demo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dell
 */
public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
