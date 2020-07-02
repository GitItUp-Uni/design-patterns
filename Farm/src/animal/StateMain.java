package animal;

public class StateMain {

	public static void main(String[] args) {

		Context horse = new Context("Hecarim");
		Context cow = new Context("Alistar");
		
		EatingState eatingState = new EatingState();
		SleepingState sleepingState = new SleepingState();
		IdleState idleState = new IdleState();
		
		eatingState.applyState(horse);
		sleepingState.applyState(horse);
		idleState.applyState(horse);
		eatingState.applyState(cow);
		sleepingState.applyState(cow);
		idleState.applyState(cow);
		
		State animalState = horse.getState();
		State animal2State = cow.getState();
		String currentState = animalState.getStateName();
		System.out.println("currentState: " + currentState);
			
	}

}
