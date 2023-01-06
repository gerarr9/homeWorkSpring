package me.course.product.controllers;

import me.course.product.services.IngredientImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
   private IngredientImpl ingredients;

    public IngredientController(IngredientImpl ingredient) {
        this.ingredients = ingredient;
    }
    @GetMapping("/img")
    public String ingridentPrint(@RequestParam Integer id){
        return  ingredients.getIngredient(id).toString();
    }

}
