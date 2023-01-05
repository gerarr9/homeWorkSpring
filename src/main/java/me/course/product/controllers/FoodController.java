package me.course.product.controllers;

import me.course.product.services.RecipeImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class FoodController {
  private   RecipeImpl recipe;

    public FoodController(RecipeImpl recipe) {
        this.recipe = recipe;
    }
    @GetMapping("/list")
    public String recipesList(){
        return  "ss";
    }
}
