package ru.samsung.itschool.book;

class Unit {
    public String name;
    public int health;
}

class Robot extends Unit {
    private int armor;
}

class Wizard extends Unit {
    private int mana;
}

class Warrior extends Unit {
    public void attack() {}
}

public class Example {

	public static void main(String[] args) {
		System.out.println("Hello");
	}

}


