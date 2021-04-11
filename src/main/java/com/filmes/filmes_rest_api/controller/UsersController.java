package com.filmes.filmes_rest_api.controller;

import com.filmes.filmes_rest_api.model.UsersModel;
import com.filmes.filmes_rest_api.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @GetMapping(path = "/api/users")
    public List<UsersModel> getUsers(){
        return (List<UsersModel>) repository.findAll();
    }

    @GetMapping(path = "/api/users/{email}")
    public ResponseEntity<UsersModel> findByEmail(@PathVariable String email){
        return repository.findByEmail(email)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/users")
    public UsersModel saveUsers(@RequestBody UsersModel user){
        return repository.save(user);
    }
}
