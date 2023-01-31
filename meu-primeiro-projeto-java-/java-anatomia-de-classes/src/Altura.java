import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite Sua Altura: ");
        int altura = scan.nextInt();
        if (altura <= 165)
            System.out.println("BAIXO");
        else if (altura >= 165)
            System.out.println("ALTO");

        scan.close();

    }
}
