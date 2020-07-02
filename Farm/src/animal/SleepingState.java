package animal;

public class SleepingState implements State {

	private String stateName = "Sleeping_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}
