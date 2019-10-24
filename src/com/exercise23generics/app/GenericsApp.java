package com.exercise23generics.app;

import com.exercise23generics.model.Sum;
import com.exercise23generics.model.Substraction;
import com.exercise23generics.model.Times;
public class GenericsApp {

	public static void main(String[] args) {
		// Object construction of class Sum
		Sum <Integer> myObject = new Sum<Integer>(15);
		Sum <String> myObjectString = new Sum<String>("Testo");
		// Object construction of class Substraction
		Substraction<Integer, Integer> myObjectSubstraction = new Substraction<Integer, Integer>(10,20);
		Substraction<Integer, Integer> myObjectSubstraction2 = new Substraction<Integer, Integer>();
		// Show the value save in my object
		System.out.println("Object of myObject " + myObject.getMyObject());
		System.out.println("Object of myObjectString " +  myObjectString.getMyObject());
		// Assign values to my objects using their setters in this case 'key' and 'value'
		myObjectSubstraction2.setKey(100);
		myObjectSubstraction2.setValue(200);
		System.out.println("Object Substraction: "+myObjectSubstraction.ToString());
		System.out.println("Object Substraction2: "+myObjectSubstraction2.ToString());
		// Show through the method 'ShowDataType'
		System.out.println(Times.ShowDataType(10));
		System.out.println(Times.ShowDataType("Hi there"));
		System.out.println(Times.ShowDataType(10.0));
		
		System.out.println("10 + 15 = " + Sum.SumNumbers(10, 15));
	}

}
