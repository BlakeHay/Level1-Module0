package _01_methods._1_houses;
import java.awt.Color;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
import org.jointheleague.graphical.robot.Robot;
public class Houses {
		
	public void run() {
	
		houses(10);
		// Check the recipe to find out what code to put here

	}
	public void houses(int numberOfHouses){
		Robot rob = new Robot();
	for(int i = 0; i < numberOfHouses; i++){
	
	rob.miniaturize();
	rob.setSpeed(10);
	rob.setX(50);
	rob.setY(550);
	rob.penDown();
	rob.move(100);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(100);
	rob.turn(-90);
	rob.setPenColor(Color.green);
	rob.move(20);
	}
}
}
