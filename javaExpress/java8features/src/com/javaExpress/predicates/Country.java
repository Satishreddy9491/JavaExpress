package com.javaExpress.predicates;

public class Country {
	private String name;
	private int population;
	
	
	public String getName() {
		return name;
	}
	public int getPopulation() {
		return population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	
	
	
	
	
}
