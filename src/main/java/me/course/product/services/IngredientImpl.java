package me.course.product.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientImpl {
    public static Map<Integer, IngredientImpl> ingredients = new HashMap<>();
    private  String name;
    private int quantity;
    private  String dimension;

    public IngredientImpl(String name, int quantity, String dimension) {
        this.name = name;
        this.quantity = quantity;
        this.dimension = dimension;
    }
    public static void addIngredient(IngredientImpl ingredient) {
        Integer id = ingredients.size() + 1;
        ingredients.put(id, ingredient);
    }


    public static IngredientImpl getIngredient(Integer id) {
        return ingredients.get(id);
    }

    @Override
    public String toString() {
        return "IngredientImpl{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", dimension='" + dimension + '\'' +
                '}';
    }
}
