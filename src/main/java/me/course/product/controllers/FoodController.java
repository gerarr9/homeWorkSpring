package me.course.product.controllers;

import me.course.product.services.IngredientImpl;
import me.course.product.services.Recipe;
import me.course.product.services.RecipeImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public class FoodController {
  private   RecipeImpl recipe;

    public FoodController(RecipeImpl recipe) {
        this.recipe = recipe;
    }
    @PostMapping()
    public String recipesList(@RequestParam Integer id){
        return  this.recipe.getRecipe(id).toString();
    }  @GetMapping()
    public String recipesList1(Integer id){
        return  recipesList(id);
    }
}
