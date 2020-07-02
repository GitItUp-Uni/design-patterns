package animal;

public class IdleState implements State {

	private String stateName = "IDLE_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}
