import java.util.Scanner;
public class nachole {
    public static void main(String[] args){
        System.out.print("Hola mundo");
        int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero (1)");
        n1 = sc.nextInt();
        System.out.println("Ingrese un numero (2)");
        n2 = sc.nextInt();
        System.out.println("La suma es"+ (n1 + n2));

    }

}
