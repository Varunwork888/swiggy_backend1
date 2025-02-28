package com.swiggy.api.service.impl;

import com.cloudinary.Cloudinary;
import com.swiggy.api.service.CloudinaryImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
@Service
public class CloudinaryServiceImageServiceImpl implements CloudinaryImageService {
   @Autowired
   private Cloudinary cloudinary;
    @Override
    public Map upload(MultipartFile file) {
        try {
          Map data= this.cloudinary.uploader().upload(file.getBytes(),Map.of());
          return data;
        } catch (IOException e) {
            throw new RuntimeException("image uploading fail");
        }
    }
}
