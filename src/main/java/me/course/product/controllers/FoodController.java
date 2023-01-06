package me.course.product.controllers;

import me.course.product.services.IngredientImpl;
import me.course.product.services.Recipe;
import me.course.product.services.RecipeImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class FoodController {
  private   RecipeImpl recipe;

    public FoodController(RecipeImpl recipe) {
        this.recipe = recipe;
    }
    @GetMapping("/list")
    public String recipesList(@RequestParam RecipeImpl  id){
        return  this.recipe.getRecipe(id).toString();
    }
}
