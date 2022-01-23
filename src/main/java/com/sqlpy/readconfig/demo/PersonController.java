package com.sqlpy.readconfig.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PersonController {
    @Autowired
    private Person person;

    @GetMapping("/")
    public Person get() {
        log.info(this.person.toString());
        return this.person;
    }
}
