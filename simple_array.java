import java.util.Scanner;

public class simple_array {

    public static void main(String[] args) {
        Scanner collect=new Scanner(System.in);
    
    
    String array[][]={
            {"Apple","Banana"},
            {"Mango","Rambutan"},
            {"Durian","Pineapple"}
        };    
    
    System.out.println("Pick your least liked fruit!");
    System.out.println();
    
    for(String menu[]:array){
        for(String menu1:menu){
            System.out.print(menu1+", ");
        }
        System.out.println();
    } 
    
    String tofind [][] = new String[1][1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
        
        System.out.print(": ");
        tofind [0][0] = collect.next();
        
            
            if (tofind[0][0].equals(array[i][j])) {
            System.out.printf("is found!");
            
            System.out.print("\nname a fruit that you want to replace it with!: ");
            array[i][j] = collect.next();
            
            break;
        } 
        
    }
        //to print updated version
                for(String menu[]:array){
                    for(String menu1:menu){
                        System.out.print(menu1+", ");
                    }
                    System.out.println();
                }
        }
      
    }
  
