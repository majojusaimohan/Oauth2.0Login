package com.dragonbyte.Oauth2lLogin.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github")
public class GitHubController {

    @GetMapping
    public ResponseEntity<String> githubController(){
         return  ResponseEntity.ok("Hello from Github Controller");
    }
}
