import java.util.Scanner;

public class Fakultet {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Skriv inn en positiv heltall: "); 
        int n = input.nextInt();
        
        int fakultet = 1; 
        for (int i = 1; i <= n; i++) { 
            fakultet = fakultet * i; 
        }
        
        System.out.println(n + "! = " + fakultet);
    }
}