package com.asif.java8Learning.PredicateFuncInterface4;

import java.util.function.Predicate;

class SoftwareEngineer {

	private String name;
	private Integer age;
	private Boolean hasGirlFriend;

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", hasGirlFriend=" + hasGirlFriend + "]";
	}

	public SoftwareEngineer(String name, Integer age, Boolean hasGirlFriend) {
		super();
		this.name = name;
		this.age = age;
		this.hasGirlFriend = hasGirlFriend;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasGirlFriend() {
		return hasGirlFriend;
	}

	public void setHasGirlFriend(Boolean hasGirlFriend) {
		this.hasGirlFriend = hasGirlFriend;
	}

}

public class PredicateFuncInterface_UsingArraysEg2 {

	public static void main(String[] args) {

		SoftwareEngineer[] arrayOfSoftwareEngineers = {
		new SoftwareEngineer("E1", 60, false),
		new SoftwareEngineer("E2", 25, true),
		new SoftwareEngineer("E3", 26, true),
		new SoftwareEngineer("E4", 28, false),
		new SoftwareEngineer("E5", 18, true)};

		// Predicate creating a Function, to call it use its impl method test()

		Predicate<SoftwareEngineer> s = e -> e.getAge() >= 18 && e.getHasGirlFriend() == true;
		for (SoftwareEngineer softwareEngineer : arrayOfSoftwareEngineers) {
			if (s.test(softwareEngineer)) {
				System.out.println("Pub Entry Allowed for : " + softwareEngineer);
			} else {
				System.out.println("Pub Entry Rejected for : " + softwareEngineer);
			}
		}
		
		//l.stream().filter(e.getAge() >= 18 && e.getHasGirlFriend() == true).collect(Collections.list(SoftwareEngineer));
	}
}
