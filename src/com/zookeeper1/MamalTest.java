package com.zookeeper1;

public class MamalTest {
	public static void main(String[] args) {
		Mamal iDMamal = new Mamal();
		Gorilla iDGorilla = new Gorilla();
		Bat iDBat = new Bat();
		
//		Mamal Energy
		Integer gorillaNRG = iDMamal.displayGorillaNRG();
		Integer batNRG = iDMamal.displayBatNRG();
		System.out.println(batNRG);
		System.out.println(gorillaNRG);
		
		
//		Gorilla 
		
		Integer throwNRG = iDGorilla.throwSomething(2);
		System.out.println(throwNRG);
		
		Integer eatNRG = iDGorilla.eatBanana(13);
		System.out.println(eatNRG);
		
		Integer climbNRG = iDGorilla.climb(4);
		System.out.println(climbNRG);
		
//		Bat
		
		Integer flyNRG = iDBat.fly(1);
		System.out.println(flyNRG);
		
		Integer eatHumanNRG = iDBat.eatHumans(2);
		System.out.println(eatHumanNRG);
		
		Integer attackNRG = iDBat.attackTown(1);
		System.out.println(attackNRG);
		
		
	}

}
