
public class Main {
    public static void main(String[] args) {

        System.out.printf("=== 3.8 Parametry Programu ===\n");

        System.out.println("Liczba parametrów: " + args.length);

        //Wyświetlenie wszystkich przekazanych parametórw
        System.out.print("Przekazane parametry: ");
        for(int i=0; i < args.length; i++)
        {
            System.out.print(args[i] + "\t");
        }

        System.out.println("\n\n");
    }

}