package com.cts.training3;
import java.util.Comparator;


	public class SortById implements Comparator<Employee>
	{
		@Override
		public int compare(Employee emp1,Employee emp2) 
		{
			if (emp1.id> emp2.id)
			{
				return 1;
			}
			else if(emp1.id==emp2.id)
			{
			return 0;
		    }
			else
			{
			return -1;
		
		    }
		}
	}

