package com.swiggy.api.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProjectConfig {
    @Bean
    public Cloudinary getCloudinary(){
        Map map=new HashMap();
        map.put("cloud_name","doqtyaaeq");
        map.put("api_key","336698618575942");
        map.put("api_secret","ybwfGwFO6l3XJledjBoa81ynObg");
        map.put("secure","true");
        return new Cloudinary(map);
    }
}
