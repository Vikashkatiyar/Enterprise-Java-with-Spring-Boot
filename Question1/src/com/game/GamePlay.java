package com.game;

import java.util.Scanner;

public class GamePlay {
	 int number;
	    User u1, u2;
	    GamePlay(){
	    Scanner sc = new Scanner(System.in);
	    number = (int)(10*Math.random());
	    System.out.println(number);
	    System.out.println("Enter user 1 name: ");
	    u1 = new User(sc.nextLine());
	    System.out.println("Enter user 2 name: ");
	    u2 = new User(sc.nextLine());
	}
	public void play(){
	    boolean turn = true;
	    int numberGuessed = Integer.MAX_VALUE;
	    Scanner sc = new Scanner(System.in);
	    while(numberGuessed != this.number){
	    System.out.println("Enter number "+(turn?this.u1:this.u2)+": ");
	    numberGuessed = sc.nextInt();
	    if(numberGuessed == this.number){
	    System.out.println(turn?this.u1:this.u2+" Wins");
	}
	turn = !turn;
	}
	}
}
