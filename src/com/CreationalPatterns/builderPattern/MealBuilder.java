package com.CreationalPatterns.builderPattern;

import com.CreationalPatterns.builderPattern.impl.ChickenBurger;
import com.CreationalPatterns.builderPattern.impl.Coke;
import com.CreationalPatterns.builderPattern.impl.Pepsi;
import com.CreationalPatterns.builderPattern.impl.VegBurger;

/**
 * @ClassName: MealBuilder
 * @Description: TODO
 * @author DELL
 * @date 2017��12��9�� ����11:19:45
 * 
 */

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal PrepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
