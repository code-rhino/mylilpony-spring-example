package com.codedifferently.app.pony.controller;

import com.codedifferently.app.pony.service.MyLittlePonyService;
import com.codedifferently.app.pony.model.MyLittlePony;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLittlePonyController {

    MyLittlePonyService myLittlePonyService;

    @Autowired
    public MyLittlePonyController(MyLittlePonyService myLittlePonyService){
        this.myLittlePonyService = myLittlePonyService;
    }

    @GetMapping("/")
    public MyLittlePony whoIsTheBestLittlePonyInTheWorld(){
        MyLittlePony tony = myLittlePonyService.readByName("Tony");
        return tony;
    }
}
