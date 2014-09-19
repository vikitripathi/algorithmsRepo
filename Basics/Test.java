import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * This line will create a new BufferedReader object, which reads from System.in (standard input). 
 * The InputStreamReader part is used to convert System.in (which is an InputStream) to a Reader object 
 * (which can be used by BufferedReader). 
 */
public class Test {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        String s = br.readLine();
        /*
         * The line above will allow the user to type in anything they want,
         *  press the <Enter> button, and have what they typed in stored in input. 
         */
        int i=0;//local variable need to be initialized
        System.out.print("Enter Integer: ");
        try{
             i = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        System.out.println("you entered "+s+" and "+i);
    }
}	