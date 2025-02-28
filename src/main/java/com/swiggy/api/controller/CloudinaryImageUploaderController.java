package com.swiggy.api.controller;

import com.swiggy.api.service.CloudinaryImageService;
import com.swiggy.api.service.impl.CloudinaryServiceImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/cloudinary/uploader")
public class CloudinaryImageUploaderController {
    @Autowired
    private CloudinaryImageService cloudinaryServiceImageService;
    @PostMapping
    public ResponseEntity<Map> uploadImage(@RequestParam("image")MultipartFile file){
       Map data= this.cloudinaryServiceImageService.upload(file);
       return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
