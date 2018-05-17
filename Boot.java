package data;

import java.util.Scanner;

public class Boot {
	
	// This is created for the sole purpose of counting how many steps it takes for the puzzle to be solves 
	static int numberofSteps = 0;
	public static void TowerofHanoi(int disk, char source, char spare, char goal) {
		
		// If the number of disks is equal to 1 then do the following which essentially just moves the source disk to goal.
		if(disk == 1) {
			System.out.println("Disk 1 from tower " + source + " to tower " + goal);
			numberofSteps++;
		} else {
			// If the number of disks is more than 1 then it creates another instance of the TowerofHanoi method within we we declare the disk and the 3 towers.
			TowerofHanoi(disk - 1, source, goal, spare);
			System.out.println("Disk " + disk + " from tower " + source + " to tower " + goal);
			TowerofHanoi(disk - 1, spare, source, goal);
			numberofSteps++;
		}
	}	
	
	public static void main(String args[]) {
		
		int disk;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many disks would like to use? (The higher the number the longer it will take.)");
		disk = scan.nextInt();
		scan.close();
		TowerofHanoi(disk, 'A', 'B', 'C');
		System.out.println("Tower of Hanoi solved in " + numberofSteps + " moves.");

//		GameState.addDisks();
//		System.out.println("Tower B has " + game.towerB);
//		System.out.println("Tower C has " + game.towerC);
//		System.out.println("Tower D has " + game.towerD);
	
	}
	
}
