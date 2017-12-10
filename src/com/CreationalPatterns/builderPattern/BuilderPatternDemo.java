package com.CreationalPatterns.builderPattern;

/**
 * @ClassName: BuilderPatternDemo
 * @Description: TODO
 * @author DELL
 * @date 2017��12��9�� ����11:24:52
 * 
 */

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:" + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost:" + nonVegMeal.getCost());
	}

}
