 package com.in28minutes.myfirstwebapp;

import com.fasterxml.jackson.core.PrettyPrinter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
 @SpringBootTest
class MyfirstwebappApplicationTests {

	@Test
	void contextLoads() {
	}

}
class Stack{
	Deque<Integer> q = new ArrayDeque<>();

	void add(int v)
	{
		q.offer(v);
	}
	int pop()
	{
		return q.pollLast();
	}
	int top()
	{
		return q.peekLast();

	}

}

class Main{
	static int count = 0;

	static int reverse(int a)
	{
		int rev = 0;
		if(a==10)
		{
			return 1;
		}
		while(a>0)
		{
			int rem = a%10;
			rev = rev*10 + rem;
			a = a/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1, 13, 10, 12, 31};
		Set<Integer> s = new HashSet<>();

		for(int x : nums)
		{
			s.add(reverse(x));
		}
		System.out.println(s.size());
	}

	private static void combinationSum(int i, int target, int[] a,
									   List<List<Integer>> ans,
									   List<Integer> temp)
	{
		if(i==a.length)
		{
			if(target==0){
				ans.add(new ArrayList<>(temp));
			}
			return;
		}
		if(a[i] <=target)
		{
			temp.add(a[i]);
			combinationSum(i,target-a[i],a,ans,temp);
			temp.remove(temp.size()-1);
		}
		combinationSum(i+1,target,a,ans,temp);

	}


	private static void sol(String s, String s1) {
		if(s.isEmpty())
		{
			System.out.print(s1);
			return;
		}
		sol(s.substring(1,s.length()) ,s1+s.charAt(0));
		sol(s.substring(1,s.length()) ,s1);
	}

}

