package com.karolina.githubrepositoryapi.controllers;

import com.karolina.githubrepositoryapi.model.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


@RestController
public class RepositoryController {

    @GetMapping(value = "/repositories/{owner}/{name}", produces = "application/json; charset=utf-8")
    public Repository getRepositoryDetails(@PathVariable("owner") String owner, @PathVariable("name") String name) {
        String repositoryUri = String.format("https://api.github.com/repos/%s/%s", owner, name);
        return WebClient.builder().build()
                .get()
                .uri(repositoryUri)
                .retrieve()
                .bodyToMono(Repository.class)
                .block();
    }
}
