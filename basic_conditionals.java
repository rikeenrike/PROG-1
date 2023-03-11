import java.util.Scanner;

public class basic_conditionals {
    public static void main(String[] args) {
        System.out.print("MENU:\nCategory 1\n A.SQUARE OR RECTANGLE IDENTIFIER\n B.POSITIVE OR NEGATIVE\nCatergory 2\n A.MONDAY - SUNDAY\n B.SUM & AVERAGE\n \nINPUT CATEGORY: ");
        Scanner collect = new Scanner(System.in);
        int catecol = collect.nextInt();

        switch(catecol){
            case 1:
                System.out.print("------------------------------\nA.SQUARE OR RECTANGLE IDENTIFIER\nB.POSITIVE OR NEGATIVE \n \nSelect: ");
                    char cate1 = collect.next().charAt(0);
                    
                    switch(cate1){
                        case 'A':
                        case 'a':
                            System.out.print("-----Selected A-----\n[SQAURE OR RECTANGLE?]");
                            System.out.print("\nInput Width: ");
                                int lngth = collect.nextInt();
                            System.out.print("Input Length: ");
                                int lngth1 = collect.nextInt();
                                    if(lngth == lngth1){System.out.print("\nGiven Dimensions is a Square!");
                                }else{System.out.print("\n Given Dimensions is a Rectangle!");}
                        break;
                        case 'B':
                        case 'b':
                            System.out.print("-----Selected B-----\n[POSITIVE OR NEGATIVE]");
                            System.out.print("\nInput Integer: ");
                                int num = collect.nextInt();
                                    if(num<= 100000000 && num>=0){
                                        System.out.print("Given Number is Positive!");
                                    }else if  (num>= -100000000 && num<=-1){
                                        System.out.print("Given Number is Negative!");
                                    }else{
                                        System.out.print("Given Number  is not within the scope");
                                    }
                        break;
                        default:
                            System.out.println("Please Try again. Input not found");
                    }
        break;
        case 2:
            System.out.print("------------------------------\nA.MONDAY - SUNDAY\nB.SUM & AVERAGE\n \nSelect: ");
                char cate2 = collect.next().charAt(0);
                switch(cate2){
                    case 'A':
                    case 'a':
                        System.out.println("-----Selected A-----\n[MONDAY - SUNDAY]");
                        System.out.print("Input Desired number: ");
                        int daycol = collect.nextInt();
                        switch (daycol){
                            case 1: System.out.println("It's Monday!");break;                               
                            case 2: System.out.println("It's Tuesday!");break;                               
                            case 3: System.out.println("It's Wednesday!");break; 
                            case 4: System.out.println("It's Thursday!");break;
                            case 5: System.out.println("It's Friday!");break;                               
                            case 6: System.out.println("It's Saturday!");break;                               
                            case 7: System.out.println("It's Sunday!");break; 
                            default: System.out.println("Given number is not within the scope");
                            }
                        break;
                        case 'B':
                        case 'b':
                            System.out.println("-----Selected B-----\n[SUM & AVERAGE OF 3 GIVEN INTEGERS]");
                            System.out.print("Input #1: ");
                                int num1 = collect.nextInt();
                            System.out.print("Input #2: ");
                                int num2 = collect.nextInt();  
                            System.out.print("Input #3: ");
                                int num3 = collect.nextInt();   
                                int sum, avg; 
                            System.out.println("The sum is: "+ (sum= num1 + num2 + num3) + "\nThe Average is: " + (sum/3));
                    }
        break;
        default:
            System.out.println("\nPlease retry. Input not available");
        }
    }           
}
