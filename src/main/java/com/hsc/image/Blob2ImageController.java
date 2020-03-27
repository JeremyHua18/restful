/*
 * Shopping System Based on Block Chain.
 * Copyright 2018 zhouxz.
 */
package com.hsc.image;

import com.hsc.entity.TestImage;
import com.hsc.repo.TestImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jeremy Hua
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/image")
public class Blob2ImageController {
    @Autowired
    TestImageRepository testImageJpaRepository;
    
    @RequestMapping(value = "/hello", produces = "application/json")
    @ResponseBody
    public String findAllUsersByJdbcTemplate() {  
        return "hello";
    }
    
    @RequestMapping(value = "/listAllImages", produces = "application/json")
    @ResponseBody
    public Iterable<TestImage> findAllTestImage() {
        return testImageJpaRepository.findAll();
    }

    
}
