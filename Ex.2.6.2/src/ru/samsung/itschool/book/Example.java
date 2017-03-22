package ru.samsung.itschool.book;

class Unit{
	public String className(){ 
		return "Unit"; 
	}
}

class Robot extends Unit{
	public String className(){ 
		return "Robot";
	}
}

class Wizard extends Unit{
	public String className(){
		return "Wizard"; 
	}
}

class Terminator extends Robot{
	public String className()
	{ 
		return "Terminator"; 
	}
}

public class Example{
	public static void main(String [] args){
		Unit unit = new Unit();
		Robot robot = new Robot();
		Wizard wizard = new Wizard();
		Terminator terminator = new Terminator();
	
		Unit [] units = {unit, robot, wizard, terminator};
		for(Unit u: units)
			System.out.println(u.className());
	}
}

