package com.pack1;
import java.util.Arrays;
import java.util.Scanner;

public class FindNear 
{
	public void nearLeast(int arr[],int n)
	{
		int temp=arr[0],c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=n) 
				{
				temp=arr[i];
				c++;
				}
		}
		if(c!=0)System.out.println(temp+" is the nearest least element to "+n);
		else System.out.println("No elements of the array are least compared with "+n);
	}
	public void nearMost(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=n) 
				{
				System.out.println(arr[i]+" is the nearest bigger element to "+n);
				return;
				}
		}
		System.out.println("No elements of the array are bigger compared with "+n);
	}
	public static void main(String[] args) 
	{
		FindNear obj=new FindNear();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements into the array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the number to search: ");
		int x=sc.nextInt();
		obj.nearLeast(arr, x);
		obj.nearMost(arr, x);
		sc.close();
	}
}
