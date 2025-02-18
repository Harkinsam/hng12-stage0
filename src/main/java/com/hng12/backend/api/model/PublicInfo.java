package com.hng12.backend.api.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "email", "currentDateTime", "gitHubUrl" })
public class PublicInfo {
    private String email;
    private String current_datetime;
    private String github_url;

    public PublicInfo() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrent_datetime() {
        return current_datetime;
    }

    public void setCurrent_datetime(String current_datetime) {
        this.current_datetime = current_datetime;
    }

    public String getGithub_url() {
        return github_url;
    }

    public void setGithub_url(String github_url) {
        this.github_url = github_url;
    }
}

