package com.portal.api.controller;

import com.portal.api.dto.OwnerPostDTO;
import com.portal.api.service.OwnerPostServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerPostController {
    @Autowired
    private OwnerPostServiceImpl ownerPostService;
    private final Logger LOG = LoggerFactory.getLogger(OwnerPostController.class);
    @PostMapping
    public ResponseEntity createOwnerPost(OwnerPostDTO ownerPostDTO){
        LOG.info("Using rest api - Create a new user: {}", ownerPostDTO);
        ownerPostService.createOwnerPost(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
