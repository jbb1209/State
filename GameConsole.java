package state;

public class GameConsole {
	State HomeState;
	State NintendoState;
	State xBoxState;
	State state;
	public State getHomeState() {
		return HomeState;
	}
	public void setHomeState(State homeState) {
		HomeState = homeState;
	}
	public State getNintendoState() {
		return NintendoState;
	}
	public void setNintendoState(State nintendoState) {
		NintendoState = nintendoState;
	}
	public State getxBoxState() {
		return xBoxState;
	}
	public void setxBoxState(State xBoxState) {
		this.xBoxState = xBoxState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	GameConsole()
	{
		
	}
public void pressHomeButton()
{
	state.pressHomeButton();
}
public void pressXBoxButton()
{
	state.pressXBoxButton();
}
public void pressNintendoButton()
{
	state.pressNintendoButton();
}
public void pressGameButton()
{
	state.pressGameButton();
}

}
