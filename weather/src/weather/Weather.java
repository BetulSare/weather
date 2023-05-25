
package weather;
import java.util.Scanner;
public class Weather {
     
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("enter the temperature: ");
        int temperature=scan.nextInt();
        if(temperature<5){
            System.out.println("you can ski");
        }else if(temperature<15){
            System.out.println("you can go to the cinema");
        }else if(temperature<25){
            System.out.println("you can picnic");
        }else{
            System.out.println("you can swim");   
        }
    }
    
}
