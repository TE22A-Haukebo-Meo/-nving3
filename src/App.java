import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*hello32();
        int bongus = 65;
        coolers(bongus);*/
        double uno = 4.3;
        double dos = 5.7;
        /*double quattro = multi(uno, dos);
        System.out.println(quattro);*/
        /*double cinco = RightTriangleArea(uno, dos);
        System.out.println(cinco);*/
        /*double siete = CircleArea(dos);
        System.out.println(siete);
        System.out.println(GetNumberInput());*/
        String skibidi = "skibidi";
        String sigma = "sigma";
        String rizz = "rizz";
        GetChoice(skibidi, sigma, rizz);
    }

    public static void hello32(){
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, world");
        }
    }

    public static void coolers(int bongus){
        System.out.println(bongus*bongus);
    }

    public static double multi(double uno, double dos){
        double tres = uno*dos;
        return tres;
    }

    public static double RightTriangleArea(double uno, double dos){
        double seis = uno*uno+dos*dos;
        return Math.sqrt(seis);
    }

    public static double CircleArea(double dos){
        double ocho = dos*dos*Math.PI;
        return ocho;
    }

    public static int GetNumberInput(){
        Scanner tb = new Scanner(System.in);
        boolean beans = true;
        int feeeeem = 0;
        while (beans) {
            try {
                System.out.println("Skriv ett tal");
                feeeeem = tb.nextInt();
                beans = false;
            } catch (Exception e) {
                System.out.println("foonka inte");
                tb.next();
            }
        }
        return feeeeem;
    }

    public static int GetChoice(String skibidi, String sigma, String rizz){
        Scanner tb = new Scanner(System.in);
        System.out.println("1. "+skibidi);
        System.out.println("2. "+sigma);
        System.out.println("3. "+rizz);
        int choice = 0;
        boolean cool = true;
        while (cool) {
            try {
                System.out.println("Välj ett av orden");
                choice = tb.nextInt();
                while (choice>3 || choice<1) {
                    System.out.println("Snela tal mellan 1-3");
                    choice = tb.nextInt();
                }
                cool = false;
            } catch (Exception e) {
                System.out.println("foonka inte");
                tb.next();
            }
        }
        return choice;
    }
}
