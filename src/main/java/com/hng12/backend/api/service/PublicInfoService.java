package com.hng12.backend.api.service;

import com.hng12.backend.api.model.PublicInfo;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@Service

public class PublicInfoService {

    public PublicInfo getPublicInfo() {
        PublicInfo publicInfo = new PublicInfo();
        publicInfo.setEmail("harkinsam247@gmail.com");
        publicInfo.setCurrent_datetime(DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
        publicInfo.setGithub_url("https://github.com/Harkinsam/hng12-stage0-backend-api");
        return publicInfo;
    }


}
