package DesignPattern.AdapterDesignPatttern;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        int[] a = {1,3,2,3,1,3,99,9,5,100,987,16,5,98,5,27,5};
        int k = 3;
        int n = a.length;

        for(int x : a)
        {
            System.out.print(x+",");

        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int x : a)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            int v = m.getValue();
            int key =m.getKey();
            if(n-v >= k)
            {
                ans = Math.max(v,ans);
            }
        }

    }
}
