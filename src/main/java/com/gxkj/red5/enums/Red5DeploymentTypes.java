package com.gxkj.red5.enums;

public enum Red5DeploymentTypes {

	
	war("WAR");
	
	private String name; 
	private Red5DeploymentTypes(String name ) {  
		       this.name = name; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		System.out.println(Red5DeploymentTypes.war.toString());
	}
}
