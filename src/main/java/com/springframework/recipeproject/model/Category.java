package com.springframework.recipeproject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany
    Set<Recipe> recipes;
}
