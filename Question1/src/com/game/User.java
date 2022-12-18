package com.game;

public class User {

   String name;
	 User(String name){
	        this.name = name;
	}
	@Override
	public String toString() {
	return "User "+name;
	}
}
