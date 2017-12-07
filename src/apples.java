//switch basics
import java.util.Scanner;

class apples {
    public static void main(String args[]) {
    		int age;
    		age = 3;
    		
    		switch (age) {
    		case 1: 
    			System.out.println("You can crawl");
    			break;
    		case 2:
    			System.out.println("You can talk");
    			break;
    		case 3:
			System.out.println("You can get in trouble");
			break;
			
    		case 4:
    			System.out.println("You are dead");
    		}
    }
}

//switches are used for referencing multiple statements
//and returning if they are true or false