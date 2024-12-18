package org.tnsif.capgemini.c2tc.Arrays;

public class JaggedArray
{
	public static void main(String args[])
	{
		int[][] StudentInGrade=new int[3][];
		StudentInGrade[0]=new int[2];
		StudentInGrade[1]=new int[3];
		StudentInGrade[2]=new int[1];
		
		StudentInGrade[0][0]=10;
		StudentInGrade[0][1]=20;
		
		StudentInGrade[1][0]=30;
		StudentInGrade[0][1]=40;
		StudentInGrade[0][1]=50;
		StudentInGrade[0][1]=60;
		
		for(int i=0;i<StudentInGrade.length;i++)
		{
			for(int j=0;j<StudentInGrade[i].length;j++)
			{
				System.out.println("Grade "+(i+1) +" Student "+(j+1)+":" +StudentInGrade[i][j]);
			}
		}
		
		
		
		
	}
}
