package com.angelica.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api",produces = MediaType.APPLICATION_JSON_VALUE)
public class Controlador {
    @GetMapping(path = "/api")
    public Usuario prueba (){
        Usuario usuarioObject = new Usuario();
        usuarioObject.setName("Angelica");
        usuarioObject.setLastName("Madera");
        return usuarioObject;
    }
}
