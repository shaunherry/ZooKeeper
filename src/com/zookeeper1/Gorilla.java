package com.zookeeper1;

public class Gorilla {
	private Integer activeEnergy = 100;
	public Integer throwSomething(Integer num) {
		System.out.println("Gorilla throwing stuff");
		this.activeEnergy = activeEnergy-(num*5);
		return activeEnergy;
	}
	
	public Integer eatBanana(Integer num) {
		System.out.println("Gorilla eating food");
		this.activeEnergy = activeEnergy+(num*10);
		return activeEnergy;
	}
	
	public Integer climb(Integer num) {
		System.out.println("Gorilla climbing tree");
		this.activeEnergy = activeEnergy-(num*10);
		return activeEnergy;
	}

}
