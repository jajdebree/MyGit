import java.util.Arrays;

// Number 4 - Advanced
public class CustomSort {
	static private int[] m_Numbers = new int[10];
	
	public static void main(String[] args)
	{
		for(int i = 0; i < m_Numbers.length; i++)
		{
			m_Numbers[i] = (int) (Math.random() * 100);
			System.out.println(m_Numbers[i]);
		}
		m_Numbers = SortArray(m_Numbers, true);
		for(int i = 0; i < m_Numbers.length; i++)
		{
			System.out.println(m_Numbers[i]);
		}
	}
	
	private static int[] SortArray(int[] p_Array)
	{
		int[] t_Result = p_Array;
		boolean t_Resolve = true;
		for(int i = 0; i < p_Array.length - 1; i++)
		{
			if(CompareValues(p_Array[i], p_Array[i+1]))
			{
				int A = p_Array[i+1];
				int B = p_Array[i];
				System.out.println(A + " is smaller than " + B);
				t_Result[i] = A;
				t_Result[i+1] = B;
				t_Resolve = false;
			}
		}
		if(t_Resolve)
		{
			return t_Result;
		}
		else
		{
			return SortArray(t_Result);
		}
	}
	
	private static int[] SortArray(int[] p_Array, boolean p_Descending)
	{
		int[] t_Result = p_Array;
		boolean t_Resolve = true;
		for(int i = 0; i < p_Array.length - 1; i++)
		{
			if(!CompareValues(p_Array[i], p_Array[i+1]) && p_Descending)
			{
				int A = p_Array[i+1];
				int B = p_Array[i];
				System.out.println(A + " is smaller than " + B);
				t_Result[i] = A;
				t_Result[i+1] = B;
				t_Resolve = false;
			}
			else if (CompareValues(p_Array[i], p_Array[i+1]) && !p_Descending)
			{
				int A = p_Array[i+1];
				int B = p_Array[i];
				System.out.println(A + " is smaller than " + B);
				t_Result[i] = A;
				t_Result[i+1] = B;
				t_Resolve = false;
			}
		}
		if(t_Resolve)
		{
			return t_Result;
		}
		else
		{
			return SortArray(t_Result, p_Descending);
		}
	}
	
	private static boolean CompareValues(int A, int B)
	{
		if(A > B)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
