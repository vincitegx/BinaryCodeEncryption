package binarycodeencryption;
import java.util.Scanner;
public class BinaryCodeEncryption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int i,temp,x,y=1,binary=0,div,rem=0;
        System.out.println("Enter your message :");
        String str0 = input.nextLine();
        char[] ch = str0.toCharArray();
        
        System.out.println("the encrypted code is");
        // InputStream output = output.read(s);
        for (x = 0; x < ch.length; x++){
            temp = (int)ch[x];
             div = temp/2;
             // (char)i is not in text if counts[i] is 0
            //System.out.print((int)ch[x]+" ");
        for(i = temp; i < 1; i--){            
             rem = temp%2;             
            
        }
        for(int rev = 0;rev<temp;rev++){
                System.out.print(rem+" "); 
             }
        }
        /*
        y=1;binary=0;
        temp=ch[i];
        while(temp!=0){
        x=temp%2;
        binary += (x*y);
        temp /=2;
        y *= 10;
        }
            System.out.println((byte)binary);
        }
        i++;*/
    }
    
}
