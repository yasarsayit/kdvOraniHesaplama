package proje;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double tutar, kdvOran= 0.18, kdvTutar, kdvliTutar;
	
       Scanner input = new Scanner(System.in);
		
    	   System.out.print("ücret tutarı giriniz : "); 
		tutar = input.nextDouble();

	kdvTutar = tutar * kdvOran;
	kdvliTutar = tutar + kdvTutar;
	
	System.out.println("KDV'siz Tutar :" + tutar);
	System.out.println("KDV Oranı :" +kdvOran);
	System.out.println("KDV Tutarı :" + kdvTutar);
	System.out.println("KDV'li Tutarı :" + kdvliTutar);
	
       }
	}