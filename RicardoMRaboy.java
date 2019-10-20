import java.util.*;
public class RicardoMRaboy {


     public static void main(String[] args) {    
		Scanner scanner = new Scanner(System.in);       
		int zero =0;                 
		System.out.println("Type a zero between 0 and 1000"); // Inputs a zero
		zero = scanner.nextInt();	          
												
		if(zero >= 0 && zero <= 1000){    //0-1000
		
		if(zero == 0){    //Default 
		System.out.println("Converted zero is = ZERO");
		}
		
	     if (zero == 1000) {  // Max num
			System.out.println("Converted zero is = ONE THOUSAND");
			} 
				else { //Hundreds
					System.out.print("Converted zero is =");
					zeroToWord(((zero / 100) % 10), " HUNDRED");
                    zeroToWord((zero % 100), " ");
                  
				}
			}else {     //1000+
				System.out.println("zero Out of Bounds");
			}
			   
 }
 public static void zeroToWord(int num, String conv) {  //converter
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", 
            	" EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", 
            	" SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"        // 1 to 19
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            if (num > 19) {  // tens
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else { // ones
                System.out.print(ones[num]);
            }
            if (num > 0) {  //conv
                System.out.print(conv);
    }
        }
}