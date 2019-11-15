package com.Bridgelabz.DataStructure;

public class DprimeNUmber {
	public boolean checkPrime()
	{
		int count=0;
		int num=1000;
		for(int i=1;i<num;i++)
		{
			for(int j=i;j>1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
