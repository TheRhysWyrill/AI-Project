// Not used in the end project due to not being able to successfully create an intelligent agent.

package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameState {

	public static ArrayList<Integer> towerA = new ArrayList<>();
	public static ArrayList<Integer> towerB = new ArrayList<>();
	public static ArrayList<Integer> towerC = new ArrayList<>();
	public static ArrayList<Integer> towerD = new ArrayList<>();
	public static ArrayList<Integer> towerDisks = new ArrayList<>();
	static int n, Step;

	public static void addDisks() {

		Random rand = new Random();
		
		int Selection;
		Selection = rand.nextInt(4) + 1;
		
		Step = 1;

		// For loop which counts down from 10 and for each time it counts down a value
		// it adds that value to the towerA ArrayList.
		for (int numOfDisks = 5; numOfDisks >= 1; numOfDisks--) {
			towerA.add(numOfDisks);
		}

		towerDisks = towerA;
		n = towerDisks.get(towerDisks.size() - 1);

		// Turn these into "if Tower(X) is empty then move disk from tower which
		// contains disks, need to do that for every tower.
		/*
		 * towerC.add(towerA.get(towerA.size() - n)); towerA.remove(towerA.size() - n);
		 * towerB.add(towerA.get(towerA.size() - n - 1)); towerA.remove(towerA.size() -
		 * n - 1); towerD.add(towerA.get(towerA.size() - n));
		 * towerA.remove(towerA.size() - n);
		 */
			
		printTowers();
		Step++;

			
	  do{
		  
		  	if (towerB.isEmpty()) {
				towerB.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);

				printTowers();
				Step++;
			}
	  		
	  		if (towerB.isEmpty()) {
				towerB.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);

				printTowers();
				Step++;
			}
			if (towerB.isEmpty()) {
				towerB.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);

				printTowers();
				Step++;
			}
			if (towerC.isEmpty()) {
				towerC.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);

				printTowers();
				Step++;
			}
			if (towerC.isEmpty()) {
				towerC.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);

				printTowers();
				Step++;
			}
			if (towerC.isEmpty()) {
				towerC.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);

				printTowers();
				Step++;
			}
			if (towerD.isEmpty()) {
				towerD.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);

				printTowers();
				Step++;
			}
			if (towerD.isEmpty()) {
				towerD.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);

				printTowers();
				Step++;
			}
			if (towerD.isEmpty()) {
				towerD.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);

				printTowers();
				Step++;
			}
			if (towerA.isEmpty()) {
				towerA.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);

				printTowers();
				Step++;
			}
			if (towerA.isEmpty()) {
				towerA.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);

				printTowers();
				Step++;
			}
			if (towerA.isEmpty()) {
				towerA.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);

				printTowers();
				Step++;
			}

			// Checks to see what the minimum value of Tower A and proceeds with adding that
			// value to another tower, assuming the min value for that tower is lower than
			// the towerA minimum value.
			
			if (towerB.isEmpty() || Collections.min(towerA) < Collections.min(towerB)) {
				towerB.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);
				printTowers();
				Step++;
			} else if (towerC.isEmpty() || Collections.min(towerA) < Collections.min(towerC)) {
				towerC.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);
				printTowers();
				Step++;
			} else if (towerD.isEmpty() || Collections.min(towerA) < Collections.min(towerD)) {
				towerD.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);
				printTowers();
				Step++;
			}
			
			if (towerA.isEmpty() || Collections.min(towerB) < Collections.min(towerA)) {
				towerA.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);
				printTowers();
				Step++;
			} else if (towerC.isEmpty() || Collections.min(towerB) < Collections.min(towerC)) {
				towerC.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);
				printTowers();
				Step++;
			} else if (towerD.isEmpty() || Collections.min(towerB) < Collections.min(towerD)) {
				towerD.add(towerB.get(towerB.size() - n));
				towerB.remove(towerB.size() - n);
				printTowers();
				Step++;
			}
			
			if (towerA.isEmpty() || Collections.min(towerC) < Collections.min(towerA)) {
				towerA.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);
				printTowers();
				Step++;
			} else	if (towerB.isEmpty() || Collections.min(towerC) < Collections.min(towerB)) {
				towerB.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);
				printTowers();
				Step++;
			} else if (towerD.isEmpty() || Collections.min(towerC) < Collections.min(towerD)) {
				towerD.add(towerC.get(towerC.size() - n));
				towerC.remove(towerC.size() - n);
				printTowers();
				Step++;
			}
			
			if (towerA.isEmpty() || Collections.min(towerD) < Collections.min(towerA)) {
				towerA.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);
				printTowers();
				Step++;
			} else if (towerB.isEmpty() || Collections.min(towerD) < Collections.min(towerB)) {
				towerB.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);
				printTowers();
				Step++;
			} else if (towerC.isEmpty() || Collections.min(towerD) < Collections.min(towerC)) {
				towerC.add(towerD.get(towerD.size() - n));
				towerD.remove(towerD.size() - n);
				printTowers();
				Step++;
			}
			
		} while (Step != 100);

		/* printTowers(); */

		/*
		 * if(Collections.min(towerC) < Collections.min(towerB)) {
		 * System.out.println("Illegal move.");
		 * 
		 * printTowers(); }
		 */

		// Used to return the highest value inside of one of the towers, used to test
		// whether it worked.
		// System.out.println("Max: " + Collections.max(towerA));
		// Used to return the lowest value inside of one of the towers, used to test
		// whether it worked.
		// System.out.println("Min: " + Collections.min(towerA));

		// if(Collections.min(towerB) > Collections.min(towerC)) {
		//
		// towerB.add(towerC.get(towerC.size() - n));
		// towerC.remove(towerC.size() - n);
		//
		// System.out.println("Tower A: " + towerA);
		// System.out.println("Tower B: " + towerB);
		// System.out.println("Tower C: " + towerC);
		// System.out.println("Tower D: " + towerD);
		// }

	}

	public GameState(ArrayList<Integer> towerA, ArrayList<Integer> towerB, ArrayList<Integer> towerC,
			ArrayList<Integer> towerD) {
		this.towerA = towerA;
		this.towerB = towerB;
		this.towerC = towerC;
		this.towerD = towerD;
	}

	public ArrayList<Actions> AvailableActions() {

		ArrayList<Actions> actions = new ArrayList<Actions>();

		if (towerB.isEmpty() || towerB.equals(towerDisks)) {
			actions.add(Actions.towerAtoB);
		} else if (towerC.isEmpty() || towerC.equals(towerDisks)) {
			actions.add(Actions.towerAtoC);
		} else if (towerD.isEmpty() || towerD.equals(towerDisks)) {
			actions.add(Actions.towerAtoD);
		} else if (towerA.isEmpty() || towerA.equals(towerDisks)) {
			actions.add(Actions.towerBtoA);
		} else if (towerC.isEmpty() || towerC.equals(towerDisks)) {
			actions.add(Actions.towerBtoC);
		} else if (towerD.isEmpty() || towerD.equals(towerDisks)) {
			actions.add(Actions.towerBtoD);
		} else if (towerA.isEmpty() || towerA.equals(towerDisks)) {
			actions.add(Actions.towerCtoA);
		} else if (towerB.isEmpty() || towerB.equals(towerDisks)) {
			actions.add(Actions.towerCtoB);
		} else if (towerD.isEmpty() || towerD.equals(towerDisks)) {
			actions.add(Actions.towerCtoD);
		} else if (towerA.isEmpty() || towerA.equals(towerDisks)) {
			actions.add(Actions.towerDtoA);
		} else if (towerB.isEmpty() || towerB.equals(towerDisks)) {
			actions.add(Actions.towerDtoB);
		} else if (towerC.isEmpty() || towerC.equals(towerDisks)) {
			actions.add(Actions.towerDtoC);
		}

		return actions;

	}

	public static GameState Apply(Actions a) {

		GameState newState = new GameState(towerA, towerB, towerC, towerD);

		if (a == Actions.towerAtoB) {

			if (Collections.min(towerA) < Collections.min(towerB)) {
				towerB.add(towerA.get(towerA.size() - n));
				towerA.remove(towerA.size() - n);

				printTowers();
			} else if (towerA.contains(Collections.max(towerA))) {
				System.out.println("Illegal move.");
			}

		}

		return newState;
	}

	public static void printTowers() {
		System.out.println("Step: " + Step);
		System.out.println("Tower A: " + towerA);
		System.out.println("Tower B: " + towerB);
		System.out.println("Tower C: " + towerC);
		System.out.println("Tower D: " + towerD);
	}

}
