package zpo_zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Zad2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> zbior = new ArrayList<>();
        for(int i = 1; i < 50; ++i) {
            zbior.add(i);
        }
 
        Collections.shuffle(zbior);
        
        ArrayList<Integer> zbiorSort = new ArrayList<>();
 
        for(int i = 0; i < 6; ++i) {
            zbiorSort.add( zbior.get(i) );
        }
        
        Collections.sort(zbiorSort);
        System.out.printf("Zbior: "+zbiorSort);
        
        //////////////////
        
        /*  
		java.util.Random generator = new java.util.Random();
		ArrayList<Integer> zbior = new ArrayList<>();
							
		while (zbior.size() < 6) {
			
			zbior.add( (generator.nextInt(49)+1)  );			
		}
		
		Collections.sort(zbior);		
		System.out.printf("Zbior: "+zbior);
		*/	
        
	}

}

/*
import java.util.Random;
import java.util.stream.Stream;

public class Zad2 {
    public Stream<Integer> Generator() {
        return Stream.generate(() -> new Random().nextInt(48)+1).distinct().limit(6).sorted();
    }
} 
 
 */
