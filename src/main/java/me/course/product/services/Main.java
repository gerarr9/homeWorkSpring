package me.course.product.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class Main {


    public static Map<Integer, IngredientImpl> ingredients = new HashMap<>();

    public static void main(String[] args) {
        RecipeImpl salad = new RecipeImpl();
        salad.setName("Фруктовый салат");
        salad.setTime(5);
        salad.addCookingSteps("Порезать фрукты");
        salad.addCookingSteps("Высыпать йогурт");
        salad.addCookingSteps("Перемешать");
        salad.addIngredient(new IngredientImpl("Банан", 1, "kg"));
        salad.addIngredient(new IngredientImpl("Яблоко", 1, "kg"));
        salad.addIngredient(new IngredientImpl("Йогурт", 2, "kg"));

        RecipeImpl.addRecipe(salad);


    }





}
