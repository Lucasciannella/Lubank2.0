package com.bankproject.apilubank.controller;

import com.bankproject.apilubank.model.UsuarioModel;
import com.bankproject.apilubank.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path ="/api/usuario")
    public ResponseEntity<?> todoUsuario(){
        try{
            List<UsuarioModel> todaUser = repository.findAll();
            System.out.println("achou");
            if(todaUser.isEmpty())
                System.out.println("vazia");
            return new ResponseEntity<>(todaUser, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }



    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity<UsuarioModel> consultarUsuarioID(@PathVariable Long codigo){
        Optional<UsuarioModel> UsuarioOptional = repository.findById(codigo);
        if (UsuarioOptional.isPresent()){
            UsuarioModel usuarioUnd = UsuarioOptional.get();
            return new ResponseEntity<>(usuarioUnd, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);

    }




}
