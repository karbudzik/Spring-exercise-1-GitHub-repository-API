package com.karolina.githubrepositoryapi.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.TimeZone;

@Getter
@NoArgsConstructor
public class Repository {
    @JsonSetter("name")
    private String fullName;
    @JsonSetter("description")
    private String description;
    @JsonSetter("clone_url")
    private String cloneUrl;
    @JsonSetter("stargazers_count")
    private int stars;
    @JsonSetter("created_at")
    private String createdAt;
}
