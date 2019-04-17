package zpo_zad3;
//rozszerzone o zadanie 4

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Zad3 {
	
	public static void main(String[] args) {
		
		Zad3 main = new Zad3();
		main.program();
	}
	
	private void program() {
		
		ArrayList<Student> studenci = new ArrayList<Student>();
		
		studenci.add( new Student(909296, "Alicja", "Nowak"));		
		
		studenci.get(0).dodajOcene((float) 5.0);
		studenci.get(0).dodajOcene((float) 4.5);
		studenci.get(0).dodajOcene((float) 3.5);
		
		studenci.add( new Student(123658, "Jan", "Kowalski"));
		
		studenci.get(1).dodajOcene((float) 3.0);
		studenci.get(1).dodajOcene((float) 3.5);
		studenci.get(1).dodajOcene((float) 3.5);
		
		studenci.add( new Student(789654, "Anna", "Nowak"));
		
		studenci.get(2).dodajOcene((float) 4.5);
		studenci.get(2).dodajOcene((float) 4.5);
		studenci.get(2).dodajOcene((float) 2);
		
		Student student1 = studenci.get(0);
        Student student2 = studenci.get(1);
        Student student3 = studenci.get(2);		
		
		
		for(Student student : studenci) {
			System.out.println(student);
		}
        
		Collections.sort(studenci, new KomparatorNumerAlbumu());
        
        System.out.println("\nPo albumie: \n");
		for(Student student : studenci) {
			System.out.println(student);
		}
		
		Collections.sort(studenci, new KomparatorNazwisko());
        
        System.out.println("\nPo nazwisku: \n");
		for(Student student : studenci) {
			System.out.println(student);
		}
		
		Collections.sort(studenci, new KomparatorOceny());
        
        System.out.println("\nPo sredniej: \n");
		for(Student student : studenci) {
			System.out.println(student);
		}
		
		
		student1.dodajPrzyjaciela(student2);
		student1.dodajPrzyjaciela(student3);
		
		
		System.out.println("\nZ przyjaciolmi: \n");		
		for(Student student : studenci) {
			System.out.println(student);
		}
        
	
	}
	
	private class KomparatorNumerAlbumu implements Comparator<Student> {

		public int compare(Student std1, Student std2) {
			int album =  std1.getNumerAlbumu() - std2.getNumerAlbumu();
			return album;
		}

	}
	
	private class KomparatorNazwisko implements Comparator<Student> {

		public int compare(Student std1, Student std2) {
			
			int porownaneNazwiska = std1.getNazwisko().compareTo(std2.getNazwisko());
			if(porownaneNazwiska == 0) {
				return std1.getImie().compareTo(std2.getImie());
			}
			else {
				return porownaneNazwiska;
			}			
		}
	}
	
	private class KomparatorOceny implements Comparator<Student> {

		public int compare(Student std1, Student std2) {
			
			double srednia1=std1.liczSrednia(std1.getOceny());
			double srednia2=std2.liczSrednia(std2.getOceny());
			
			if(srednia1>srednia2)
				return 1;
			else if (srednia1<srednia2)
				return -1;
			else 
				return 0;
		}

	}
	
	

}
