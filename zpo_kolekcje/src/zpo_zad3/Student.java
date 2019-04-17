package zpo_zad3;
//rozszerzone o zadanie 4

import java.util.ArrayList;

public class Student {
	
	private int numerAlbumu;
	private String imie;
	private String nazwisko;
	private ArrayList<Float>oceny;
	private ArrayList<Student>studenci_zaprzyjaznieni;
	
	Student(int numerAlbumu, String imie, String nazwisko){  
		 this.numerAlbumu=numerAlbumu;  
		 this.imie=imie;  
		 this.nazwisko=nazwisko;
		 this.oceny = new ArrayList<Float>();
		 this.studenci_zaprzyjaznieni = new ArrayList<Student>();
		 } 
	
	@Override
	public String toString() {
		
		String string = "Numer albumu: "+this.numerAlbumu + "\tImie i Nazwisko: " + this.imie + " " + this.nazwisko + "\t";
        
		if (!this.oceny.isEmpty())
        	string = string + "Oceny: " + this.oceny;
        
		if(!this.studenci_zaprzyjaznieni.isEmpty()) {        	
        	string += "\tPrzyjaciele: ";
        	
        	for(Student student: this.studenci_zaprzyjaznieni){
        		string = string + " " + student.imie + " " + student.nazwisko;
        	}
        }
        return string;
	}
	
	
	public void dodajOcene(float ocena) {		
		this.oceny.add(ocena);		
	}
	
	public double liczSrednia(ArrayList<Float>oceny){
		
		double srednia;
		float suma = 0;
		
		for(int i=0; i<oceny.size(); i++)
			suma+=oceny.get(i);
		srednia=suma/oceny.size();
			
		return srednia;
	}
	
	public void dodajPrzyjaciela(Student przyjaciel){
        this.studenci_zaprzyjaznieni.add(przyjaciel);
        przyjaciel.studenci_zaprzyjaznieni.add(this);
	}
	

	public int getNumerAlbumu() {
		return numerAlbumu;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public String getImie() {
		return imie;
	}
	
	public ArrayList<Float> getOceny() {
		return oceny;
	}
	
	
}
