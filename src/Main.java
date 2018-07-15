import java.util.*;
import java.util.Scanner;
class Main{
public static void main(String [] ZZZ){

    Scanner input = new Scanner(System.in);
    System.out.print("Input Number : " );
    String str = input.nextLine();
    int i = str.length()-1;
    while(i >= 0){
    System.out.print(str.charAt(i));
        i = i - 1;
    }
    
}

}
