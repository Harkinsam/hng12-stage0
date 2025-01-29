package com.hng12.backend.api.controller;

import com.hng12.backend.api.model.PublicInfo;
import com.hng12.backend.api.service.PublicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class PublicInfoController {
    @Autowired
    private PublicInfoService publicInfoService;


    @GetMapping
    ResponseEntity<PublicInfo> getMyInfo(){
        PublicInfo myInfo = publicInfoService.getPublicInfo();
        return new ResponseEntity<>(myInfo, HttpStatus.OK);
    }
}
