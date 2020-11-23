package state;

public class NintendoState implements State {
GameConsole gameconsole;
public void pressHomeButton()
{
	gameconsole.getHomeState();
	System.out.print("Display Home Screen");
}
public void pressNintendoButton()
{
	
	System.out.print("You are already viewing Nintendo");
}
public void pressXBoxButton()
{
	gameconsole.getxBoxState();
	System.out.print("Starting XBox...");
}
public void pressGameButton()
{
	System.out.print("Zelda \nAnimal Crossing \nBravely Default II \nNinjala \nXenoblade Chronicles ");
}
}
