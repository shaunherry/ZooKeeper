package com.zookeeper1;

public class Bat {
	private Integer activeEnergy = 300;
		public Integer fly(Integer num) {
			System.out.println("Bat be flying");
			this.activeEnergy = activeEnergy-(num*50);
			return activeEnergy;
	}
		
	public Integer eatHumans(Integer num) {
		System.out.println("Bat eating human flesh");
		this.activeEnergy = activeEnergy+(num*25);
		return activeEnergy;
	}
	
	public Integer attackTown(Integer num) {
		System.out.println("bat attacks town");
		this.activeEnergy = activeEnergy-(num*100);
		return activeEnergy;
	}
	
	

}
