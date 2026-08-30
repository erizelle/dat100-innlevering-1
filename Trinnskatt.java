import java.util.Scanner;

public class Trinnskatt {
  public static void main(String args[]) {
    
    System.out.print("Bruttolønn: ");
    
    Scanner input = new Scanner(System.in);
    double inntekt = input.nextDouble();
    
    double skatt = 0;
    
    if (inntekt > 1467200) {
        skatt += (inntekt - 1467200) * 0.178;
        inntekt = 1467200;
    }
    
    if (inntekt > 980100) {
        skatt += (inntekt - 980100) * 0.168;
        inntekt = 980100;
    }
    
    if (inntekt > 725050) {
        skatt += (inntekt - 725050) * 0.137;
        inntekt = 725050;
    }
    
    if (inntekt > 318300) {
        skatt += (inntekt - 318300) * 0.04;
        inntekt = 318300;
    }
    
    if (inntekt > 226100) {
        skatt += (inntekt - 226100) * 0.017;
    }
    
    System.out.println("Trinnskatt: " + skatt + " kr");
    
  }
}