package state;

public class xBoxState implements State{
	GameConsole gameconsole;
	public void pressHomeButton()
	{
		gameconsole.getHomeState();
		System.out.print("Display Home Screen");
	}
	public void pressNintendoButton()
	{
		gameconsole.getNintendoState();
		System.out.print("Starting Nintendo...");
	}
	public void pressXBoxButton()
	{
		
		System.out.print("You are already viewing XBox");
	}
	public void pressGameButton()
	{
		System.out.print("Halo \nRyse: Son of Rome \nCrackDown \nSea of Thieves \nGears of War 4 ");
	}
	}

