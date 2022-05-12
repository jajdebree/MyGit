/*Maak een programma dat werkt als het bekende "Ik ga op vakantie en neem mee...".

Je voert een item in: bijvoorbeeld "tandenborstel".
Daarna moet de volgende invoer met de laatste letter van tandenborstel beginnen, een "l":

"Lepel" wordt geaccepteerd. "Vork" niet.
Als iemand "Lasdoos" invult, dan toont het programma:
Gezegd is: Tandenborstel, Lasdoos

Voer het volgende item in:
Het volgende item dient dan weer met een s te beginnen. Andere invoer wordt niet geaccepteerd.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VacationGame {
	private static List<String> m_Words = new ArrayList<>();
	
	public static void main(String[] args)
	{		
		System.out.println("Ik ga op vakantie en neem mee...");
		PromptForInput();
	}
	
	private static void PromptForInput()
	{
		Scanner t_Scanner = new Scanner(System.in);
		String t_Input = t_Scanner.nextLine();
		System.out.println(t_Input);
		PromptForInput(t_Input.charAt(t_Input.length() - 1));
	}
	
	private static void PromptForInput(char t_Letter)
	{
		System.out.println(t_Letter + "...");
		Scanner t_Scanner = new Scanner(System.in);
		String t_Input = t_Scanner.nextLine();
		System.out.println(t_Input);
		if(t_Input.charAt(0) == t_Letter)
		{
			m_Words.add(t_Input);
			System.out.println("Gezegd is: " + m_Words.toString());
			PromptForInput(t_Input.charAt(t_Input.length() - 1));
		}
		else
		{
			System.out.println("Mag niet! Probeer opnieuw...");
			PromptForInput(t_Letter);
		}
	}
}
