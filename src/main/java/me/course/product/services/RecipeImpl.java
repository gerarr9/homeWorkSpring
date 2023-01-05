package me.course.product.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecipeImpl {
    public static Map<Integer, RecipeImpl> recipes = new HashMap<>();
    private  String name;
    private  int time;
    private List<IngredientImpl> ingredients = new ArrayList<>();
    private List<String > cookingSteps = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<IngredientImpl> getIngredients() {
        return ingredients;
    }
    public void addIngredient(IngredientImpl ingredient){
        ingredients.add(ingredient);
    }


    public List<String> getCookingSteps() {
        return cookingSteps;
    }

    public void addCookingSteps(String cookingStep) {
       cookingSteps.add(cookingStep);
    }
    public static void addRecipe(RecipeImpl recipe) {
        Integer id = recipes.size() + 1;
        recipes.put(id, recipe);

    }

    public static RecipeImpl getRecipe(Integer id) {
        return recipes.get(id);}

    @Override
    public String toString() {
        return "RecipeImpl{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", ingredients=" + ingredients +
                ", cookingSteps=" + cookingSteps +
                '}';
    }
}


