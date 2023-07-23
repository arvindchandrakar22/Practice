package com.codePractice.hackerrank.mountblue;

import java.util.ArrayList;
import java.util.List;


public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = superReducedString("aaabccddd");
		System.out.println(result);
	}

	private static String superReducedString(String s) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            list.add(ch);
        }
        
        for(int i=0; i<list.size()-1; i++)
        {
            if(list.get(i)==list.get(i+1))
            {
                list.remove(i);
                list.remove(i);
                i=-1;
            }
        }
        if(list.isEmpty())
        {
            return "Empty String";
        }
        else
        {
            StringBuffer sb = new StringBuffer();
            for(char c : list)
            {
                sb.append(c);
            }
            String str = sb.toString();
            return str;
        }
    }
}
