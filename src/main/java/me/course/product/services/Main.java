package me.course.product.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static me.course.product.services.IngredientImpl.getIngredient;

@Service
public class Main {




    public static void main(String[] args) {

        System.out.println(getIngredient(2));

    }





}
