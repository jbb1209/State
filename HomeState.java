package state;

public class HomeState implements State {
	GameConsole gameconsole;
	public void pressHomeButton()
	{
		
		System.out.print("You are already on the home screen");
	}
	public void pressNintendoButton()
	{
		gameconsole.getNintendoState();
		System.out.print("Starting Nintendo...");
	}
	public void pressXBoxButton()
	{
		gameconsole.getxBoxState();
		System.out.print("Starting XBox...");
	}
	public void pressGameButton()
	{
		System.out.print("You have to pick a gaming system to play");
	}
	}

