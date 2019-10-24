package com.exercise23generics.model;

public class Times {
	public static <T> String ShowDataType(T object) {
		return "Data type is: " + object.getClass()+ 
				"\n Parameter name: "+object.getClass().getName()+
				"\n Elements value is: "+ object;
	}
}
