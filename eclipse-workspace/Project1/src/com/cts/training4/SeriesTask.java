package com.cts.training4;

public class SeriesTask {
	
	/* Generate a series of first 10 number as follows
	  36,34,30,28,24,22,18,16,12,10 */
	

	public static void main(String[] args)
	{
	int num=36;
	int count=0;
	for (int i=num;i>=10;i--)
	{
	    count++;
		System.out.println(i);
		i--;
		if (count%2==0)
			i=i-2;
	}
}

}

