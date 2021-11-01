package com.example.lkproje.HelloWorld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {

    @Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/HelloWORLD")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/HelloWORLD2")
    public HelloWorldBean HelloWORLDD() {
        return new HelloWorldBean("Merhaba DÜNYA");
    }
    @GetMapping(path = "/HelloWORLD3")
    public String HelloWorldX() {
        return messageSource.getMessage("Good.Moarning.Message",null, LocaleContextHolder.getLocale());
    }

    @GetMapping(path = "/HelloWORLD4/{name}")
    public HelloWorldBean HelloWORLDDD(@PathVariable String name) {
        return new HelloWorldBean(String.format("HelloWorld,%s",name));

    }
}

