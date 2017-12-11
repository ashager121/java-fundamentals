
import java.util.Scanner;

class apples {
    public static void main(String args[]) {
    	//this functions as a call from tuna.java and implements a string with name
    		Scanner input = new Scanner(System.in);
    		tuna tunaObject = new tuna ();
    		System.out.println("Enter name of gf here: ");
    		String temp = input.nextLine();
    		tunaObject.setName(temp);
    		tunaObject.saying();
    }
}