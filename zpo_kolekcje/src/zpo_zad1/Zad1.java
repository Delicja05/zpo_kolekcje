package zpo_zad1;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Scanner;

public class Zad1 {
	
	public static int liczba;
	public static String slowo="";
	public static Map<Integer,String> slownik;
	
	public static void main(String[] args) throws myException{
		
		try{
			slownik = new HashMap<>();
	    	
			slownik.put(0, "zero");
	    	slownik.put(1, "jeden");
	    	slownik.put(2, "dwa");
	    	slownik.put(3, "trzy");
	    	slownik.put(4, "cztery");
	    	slownik.put(5, "piec");
	    	slownik.put(6, "szesc");
	    	slownik.put(7, "siedem");
	    	slownik.put(8, "osiem");
	    	slownik.put(9, "dziewiec");
	    	slownik.put(10, "dziesiec");
	    	slownik.put(11, "jedenascie");
	    	slownik.put(12, "dwanascie");
	    	slownik.put(13, "trzynascie");
	    	slownik.put(14, "czternascie");
	    	slownik.put(15, "pietnascie");
	    	slownik.put(16, "szesnascie");
	    	slownik.put(17, "siedemnascie");
	    	slownik.put(18, "osiemnascie");
	    	slownik.put(19, "dziewietnascie");
	    	slownik.put(20, "dwadziescia");
	    	slownik.put(30, "trzydziesci");
	    	slownik.put(40, "czterdziesci");
	    	slownik.put(50, "piecdziesiat");
	    	slownik.put(60, "szescdziesiat");
	    	slownik.put(70, "siedemdziesiat");
	    	slownik.put(80, "osiemdziesiat");
	    	slownik.put(90, "dziewiecdziesiat");
	    	slownik.put(100, "sto");
	    	slownik.put(200, "dwiescie");
	    	slownik.put(300, "trzysta");
	    	slownik.put(400, "cztersta");
	    	slownik.put(500, "piecset");
	    	slownik.put(600, "szescset");
	    	slownik.put(700, "siedemset");
	    	slownik.put(800, "osiemset");
	    	slownik.put(900, "dziwiecset");
	    	
	    	
	    	Scanner pobierz = new Scanner(System.in);
	        System.out.println("Podaj liczbe: ");    	
	        liczba = pobierz.nextInt();
	    	pobierz.close();    	
	    	System.out.println(); 
	    	
	    	if(liczba<0 || liczba>999)
	    		throw new myException("Poza zakresem");
	    	
	    	zamienLiczbe();	    	
	    	System.out.printf(slowo);
    	
		}catch(myException e) {
    		System.out.printf("Blad: " + e);    		
    	}    	
	}
	
	
	public static void zamienLiczbe() throws myException{		
    	
    	if((liczba>=0 && liczba<21) || liczba == 30 || liczba == 40 || liczba == 50 ||
    			liczba == 60 || liczba == 70 || liczba == 80 || liczba == 90 || 
    			liczba == 100 || liczba == 200 || liczba == 300 || liczba == 400 || 
    			liczba == 500 || liczba == 600 || liczba == 700 || liczba == 800 || 
    			liczba == 900) {
    		/*
    		for (Entry<Integer,String> entry : slownik.entrySet()) {
    		    int key = entry.getKey();    
    		    String value = entry.getValue();
    		    if(key==liczba) {
    		    	slowo=value;
    		    	break;
    		    }
    		}
    		*/
    		slowo=slownik.get(liczba);
    		
    		
    	}else if(liczba>20 && liczba<100) {
    		
    		/*
    		int jednosci = liczba%10;
    		int dziesiatki = (liczba/10)*10;
    		String jed="";
    		String dzies="";
    		
    		for (Entry<Integer,String> entry : slownik.entrySet()) {
    		    int key = entry.getKey();    
    		    String value = entry.getValue();
    		    if(key==jednosci)
    		    	jed=value;
    		    if(key==dziesiatki)
    		    	dzies=value;    		     		    
    		}
    		*/
    		slowo=slownik.get((liczba/10)*10)+" "+slownik.get(liczba%10);  
    		
    	}else if((liczba%100)>10 && (liczba%100)<20){
    		/*
    		dziesiatki = liczba%100;
    			
    			for (Entry<Integer,String> entry : slownik.entrySet()) {
	    		    int key = entry.getKey();    
	    		    String value = entry.getValue();
	    		    if(key==dziesiatki)
	    		    	dzies=value;   		    
	    		    if(key==setki)
	    		    	set=value;
	    		}
    			*/
    			
    			slowo=slownik.get((liczba/100)*100)+" "+slownik.get(liczba%100);    			
    			
    	}else{
    			//int jednosci = (liczba%100)%10;
        		//int dziesiatki = ((liczba%100)/10)*10;
        		//int setki = (liczba/100)*100;
        		String jed=slownik.get((liczba%100)%10);
        		String dzies=slownik.get(((liczba%100)/10)*10);
        		//String set="";
        		/*
	    		for (Entry<Integer,String> entry : slownik.entrySet()) {
	    		    int key = entry.getKey();    
	    		    String value = entry.getValue();
	    		    if(key==jednosci)
	    		    	jed=value;
	    		    if(key==dziesiatki)
	    		    	dzies=value;   		    
	    		    if(key==setki)
	    		    	set=value;
	    		}
	    		*/
	    		if(dzies=="zero")
	    			dzies="";
	    		else
	    			dzies=dzies+" ";
	    		if(jed=="zero")
	    			jed="";
	    		
	    		slowo=slownik.get((liczba/100)*100)+" "+dzies+jed;  
    		
    	}
    }
	
	
	    
}