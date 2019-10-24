package com.exercise23generics.model;

public class Sum <T>{
	T myObject;
	
	public Sum(T myObject) {
		this.myObject = myObject;
	}
	public T getMyObject() {
		return this.myObject;
	}
	
	public static <T extends Number, T2 extends Number> T SumNumbers(T object1, T2 object2){
		/*
		Double objDouble1 = 0.0, objDouble2 = 0.0;
		if(object1 instanceof Double && object2 instanceof Double) {
			objDouble1 = ((Double) object1).doubleValue();
			objDouble2 = ((Double) object1).doubleValue();
			return objDouble1 + objDouble2;
		}
		*/
		Double result = 0.0;
		result = object1.doubleValue() + object2.doubleValue();
		return (T) result;
	}
}
