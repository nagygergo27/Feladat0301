import java.util.Scanner;

public class Pyramid {
    public void startcalc() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Oldal: ");
        String sideStr = sc.nextLine();
        Double side = Double.parseDouble(sideStr);
        
        System.out.print("Magasság: ");
        String heightStr = sc.nextLine();
        Double height = Double.parseDouble(heightStr);

        Double volume = 1.0/3.0* Math.pow(side, 2)*height;
        System.out.printf("Térfogat: %f\n", volume);

    }
    
}
