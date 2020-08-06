package com.karolina.githubrepositoryapi.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class Repository {
    @JsonSetter("name")
    private String name;
    @JsonSetter("description")
    private String description;
    @JsonSetter("clone_url")
    private String cloneUrl;
    @JsonSetter("stargazers_count")
    private int starGazers;
    @JsonSetter("created_at")
    private Date dateOfCreation;
}
