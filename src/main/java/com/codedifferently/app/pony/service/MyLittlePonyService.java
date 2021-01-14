package com.codedifferently.app.pony.service;

import com.codedifferently.app.pony.model.MyLittlePony;
import com.codedifferently.app.pony.repo.MyLittlePonyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyLittlePonyService {

    private MyLittlePonyRepo repo;

    @Autowired
    public MyLittlePonyService(MyLittlePonyRepo repo){
        this.repo = repo;
    }

    public MyLittlePony create(String name, String color){
        MyLittlePony pony = repo.save(new MyLittlePony(name,color));
        return pony;
    }

    public MyLittlePony readByName(String name){
        return repo.findByName(name);
    }
}
