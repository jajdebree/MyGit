import java.util.Scanner;

public class Lingo {
	private static String m_Word = "fiets";
	
	
	public static void main(String[] args)
	{		
		System.out.println("Guess the following word:");
		String t_Prompt = "";
		for(int i = 0; i < m_Word.length(); i++)
		{
			t_Prompt += "_";
		}
		System.out.println(t_Prompt);
		CheckForInput();
	}
	
	private static boolean CheckForInput()
	{
		Scanner t_Scanner = new Scanner(System.in);
		String t_Input = t_Scanner.nextLine();
		System.out.println(t_Input);
		if(ValidateInput(t_Input))
		{
			System.out.println("Game over!");
			return true;
		}
		else
		{
			return CheckForInput();
		}
	}
	
	private static boolean ValidateInput(String p_Input)
	{
		int t_Count = 0;
		String t_Output = "";
		for(int i = 0; i < p_Input.length(); i++)
		{
			if(p_Input.charAt(i) == m_Word.charAt(i))
			{
				t_Output += 2;
				t_Count++;
			}
			else if(m_Word.indexOf(p_Input.charAt(i)) >= 0)
			{
				t_Output += 1;
			}
			else
			{
				t_Output += 0;
			}
		}
		System.out.println(t_Output);
		if(t_Count == p_Input.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
