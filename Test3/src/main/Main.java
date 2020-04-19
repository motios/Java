package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Main {

	private int zzz;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * String k =""; System.out.println(k); InputStream res =
		 * Main.class.getResourceAsStream("/tau-idm-project-ae0e1d3ce206.json");
		 * BufferedReader reader = new BufferedReader(new InputStreamReader(res));
		 * String line = null; while ((line = reader.readLine()) != null) {
		 * System.out.println(line); } reader.close();
		 */

		/*
		 * int k; int j; k=5; j=k; System.out.println(equals(k,j)); k=7;
		 * System.out.println(j); System.out.print(k); System.out.println(" "+j);
		 */
		
		Test t1= new Test("kuku", 20);
		Test t2= t1;
		t1 = new Test("fff", 50);
		t1.equals(t2);
	}

	private static boolean equals(int k, int j) {
		boolean bool = k==j;
		
		return bool;
		
	}
}
