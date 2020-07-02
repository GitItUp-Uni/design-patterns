package animal;

public class EatingState implements State {

	private String stateName = "EATING_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}
