package com.brizlabs.Exception;


import java.util.Scanner;

public class MoodAnalyser
{
		public void analyseMood()
		{
			String mood1="happy";
			String mood2="sad";
			Scanner sc=new Scanner(System.in);
			System.out.println("Express your behavior happy or sad:");
			String mood=sc.next();
			try
			{
				
			
			if(mood.equals(mood1))
			{
				System.out.println("Happy Mood..");
			}else if(mood.equals(mood2))
			{
				System.out.println("Sad Mood..");
			}
			}catch(NullPointerException e) 
			{
				System.out.println("Happy");
			}
		}
		public static void main(String[] args) {
			MoodAnalyser md=new MoodAnalyser();
			md.analyseMood();
		}

	}