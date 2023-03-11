import java.util.Scanner;

public class Problem4_Simple_Decimal_to_Roman_Conversion {
    public static void main(String[] args) 
    {
    Scanner collect = new Scanner(System.in);
    
    int inputUser = collect.nextInt();   
    
    long [] numofInputs = new long[inputUser];   
    
    if(inputUser <= 0 || inputUser > 20){
        System.out.println("OUT OF RANGE!");
    
    }else{
        
    for(int i = 0; i < numofInputs.length ;  i++)
        numofInputs[i] = collect.nextInt();

        //DECIMAL TO ROMAN NUMERAL NESTED 1LOOP
    }  
        for(int indx = 0; indx < numofInputs.length; indx++) { 
            while(numofInputs[indx] >= 1000) {
            System.out.print("M");
            numofInputs[indx]  = numofInputs[indx]  - 1000;
            }
            while(numofInputs[indx]  >= 900){
            System.out.print("CM");
            numofInputs[indx]  = numofInputs[indx]  - 900;
            }
            while(numofInputs[indx]  >= 500){
            System.out.print("D");
            numofInputs[indx]  = numofInputs[indx]  - 500;
            }
            while(numofInputs[indx]  >= 400){
            System.out.print("CD");
            numofInputs[indx]  = numofInputs[indx]  - 400;
            }
            while(numofInputs[indx]  >= 100){
            System.out.print("C");
            numofInputs[indx]  = numofInputs[indx]  - 100;
            }
            while(numofInputs[indx]  >= 90){
            System.out.print("XC");
            numofInputs[indx]  = numofInputs[indx]  - 90;
            }
            while(numofInputs[indx]  >= 50){
            System.out.print("L");
            numofInputs[indx]  = numofInputs[indx]  - 50;
            }
            while(numofInputs[indx]  >= 40){
            System.out.print("XL");
            numofInputs[indx]  = numofInputs[indx]  - 40;
            }
            while(numofInputs[indx]  >= 10){
            System.out.print("X");
            numofInputs[indx]  = numofInputs[indx]  - 10;
            }
            while(numofInputs[indx]  >= 9){
            System.out.print("IX");
            numofInputs[indx]  = numofInputs[indx]  - 9;
            }
            while(numofInputs[indx]  >= 5) {
            System.out.print("V");
            numofInputs[indx]  = numofInputs[indx]  - 5;
            }
            while(numofInputs[indx]  >= 4) {
            System.out.print("IV");
            numofInputs[indx]  = numofInputs[indx]  - 4;  
            }
            while(numofInputs[indx]  >= 1) {
            System.out.print("I");
            numofInputs[indx]  = numofInputs[indx]  - 1;  
            }
            System.out.println("");
            
        }
    } 
}  