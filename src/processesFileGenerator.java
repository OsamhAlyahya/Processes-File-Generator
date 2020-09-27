import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class processesFileGenerator {

	public static void main(String[] args) {
	
		 List<Integer> listN = new ArrayList<>(); 
		 List<String> listL = new ArrayList<>(); 
	        
	        listN.add(1); 
	        listN.add(2); 
	        listN.add(3); 
	        listN.add(4); 
	        listN.add(5); 
	        listN.add(6);
	        
	        listL.add("A");
	        listL.add("B");
	        listL.add("C");
	        listL.add("D");
	        listL.add("E");
	        listL.add("F");
	        listL.add("G");
	        listL.add("H");
	        listL.add("I");
	        listL.add("J");
	        listL.add("K");
	        listL.add("L");
	        listL.add("M");
	        listL.add("N");
	        listL.add("O");
	        listL.add("P");
	        listL.add("Q");
	        listL.add("R");
	        listL.add("S");
	        listL.add("T");
	        listL.add("U");
	        listL.add("V");
	        listL.add("W");
	        listL.add("X");
	        listL.add("Y");
	        listL.add("Z");
	        
	        
	        main m = new main(); 
	        
	        try {
				PrintWriter outputStream = new PrintWriter("/Users/dmc/Desktop/ProcessesFile/input.txt");
				
				
	        for(int i = 1; i<=3000 ; i++) {
	        	
	        	int cycles = m.getRandomNumber(listN);
	        	
	        	String Name = ""+m.getRandomLetter(listL)+""+m.getRandomLetter(listL)+""+m.getRandomLetter(listL)+""+m.getRandomLetter(listL)+""+m.getRandomLetter(listL)+"";
	        	
					if(cycles == 1) {
						
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+IoGen()+","+-1);
					}
						        		      	
					if(cycles == 2) {
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+-1);		
					}
					
					if(cycles == 3) {
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+-1);	
					}
					
					if(cycles == 4) {
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+ IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+-1);	
					}
					
					if(cycles == 5) {
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+-1);	
					}
					
					if(cycles == 6) {
						outputStream.println(i+","+Name+","+cpuGen()+","+firstMemoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+cpuGen()+","+memoryGen()+","+IoGen()+","+-1);					
					}
	        	
	        }
			outputStream.close();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
}
	
	
public int getRandomNumber(List<Integer> list){
	    
	        Random rand = new Random(); 
	        return list.get(rand.nextInt(list.size())); 
	    } 

public String getRandomLetter(List<String> list){
    
    Random rand = new Random(); 
    return list.get(rand.nextInt(list.size())); 
} 
	
public static int memoryGen() {
	
	return (int) (Math.random() * (16384 - -2500)) + -2500;
	
}

public static int firstMemoryGen() {
	
	return (int) (Math.random() * (16384 - 16)) + 16;
	
}

public static int IoGen(){
	
	return (int) (Math.random() * (8 - 0));
}

public static int cpuGen(){
	
	return (int) (Math.random() * (85 - 16)) +16;
	
}
}