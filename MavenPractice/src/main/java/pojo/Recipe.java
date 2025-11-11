package pojo;

import java.util.*;


public class Recipe {
	
	int id;
    String name;
    List<String> ingredients;
    List<String> instructions;
    int prepTimeMinutes;
    int cookTimeMinutes;
    int servings;
    String difficulty;
    String cuisine;
    int caloriesPerServing;
    List<String> tags;
    int userId;
    String image;
    float rating;
    int reviewCount;
    List<String> mealType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public List<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}
	public int getPrepTimeMinutes() {
		return prepTimeMinutes;
	}
	public void setPrepTimeMinutes(int prepTimeMinutes) {
		this.prepTimeMinutes = prepTimeMinutes;
	}
	public int getCookTimeMinutes() {
		return cookTimeMinutes;
	}
	public void setCookTimeMinutes(int cookTimeMinutes) {
		this.cookTimeMinutes = cookTimeMinutes;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getCaloriesPerServing() {
		return caloriesPerServing;
	}
	public void setCaloriesPerServing(int caloriesPerServing) {
		this.caloriesPerServing = caloriesPerServing;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public List<String> getMealType() {
		return mealType;
	}
	public void setMealType(List<String> mealType) {
		this.mealType = mealType;
	}
		  
}