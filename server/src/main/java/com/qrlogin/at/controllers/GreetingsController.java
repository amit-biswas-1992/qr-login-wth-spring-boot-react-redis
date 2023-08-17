package com.qrlogin.at.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qrlogin.Model.User;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    //retrun User Model json response
    public User greeting(@PathVariable String name) {
        User user = new User();
        user.setUsername(name);
        user.setPhone("1234567890");
        user.setId("123");
        
        return user;
        
    }

   
}
