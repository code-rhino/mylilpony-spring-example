package com.codedifferently.app.pony.repo;

import com.codedifferently.app.pony.model.MyLittlePony;
import org.springframework.data.repository.CrudRepository;

public interface MyLittlePonyRepo extends CrudRepository<MyLittlePony,Long> {
    MyLittlePony findByName(String name);
    MyLittlePony findByColor(String color);
}
