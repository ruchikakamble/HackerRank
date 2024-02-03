package com.hackerrank.JavaLoops_I;

	import java.io.*;

	public class Multiple_of_N_Numbers {

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        int i=1;
	        	while(i<=10)
	        		{
	        		int result=  i * N;
	        		System.out.println(N +" x "+ i+" = "+result);
	       
	        		i++;
	        		}
	         
	        bufferedReader.close();
	    }
	}
