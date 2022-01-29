package com.tutorial.crud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;


@RestController()
@RequestMapping("/")
public class ApiController {
    @GetMapping("")
    public ResponseEntity ping(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("USERNAME",System.getenv("USERNAME"));
        map.put("USERDNSDOMAIN",System.getenv("USERDNSDOMAIN"));
        map.put("PROCESSOR_IDENTIFIER",System.getenv("PROCESSOR_IDENTIFIER"));
        map.put("COMPUTERNAME",System.getenv("COMPUTERNAME"));
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
