package com.CreationalPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

import com.CreationalPatterns.builderPattern.dao.Item;

/** 
* @ClassName: Meat 
* @Description: TODO
* @author  DELL  
* @date 2017年12月9日 上午11:14:41 
*  
*/

public class Meal {
	private List<Item> items=new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	public float getCost(){
		float cost=0.0f;
		for(Item item:items){
			cost+=item.price();
		}
		return cost;
	}
	public void showItems(){
		for(Item item:items){
			System.out.print("Item:"+item.name());
			System.out.print(",Packing"+item.packing().pack());
			System.out.println(",Price:"+item.price());
		}
	}

}
