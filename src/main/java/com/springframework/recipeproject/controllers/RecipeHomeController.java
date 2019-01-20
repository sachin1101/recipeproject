package com.springframework.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RecipeHomeController {

    @RequestMapping({"", "/","/index", "/test"})
    public String home()
    {
        System.out.println("122343536");

        return "Index";
    }

}
