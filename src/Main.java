import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Persona p =new Persona();

    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        String sNombre = sc.nextLine();
        System.out.println("Ingrese altura");
        double dAltura = sc.nextDouble();
        System.out.println("Ingrese edad");
        int iEdad = sc.nextInt();
        System.out.println("Ingrese peso");
        double dPeso = sc.nextDouble();
        System.out.println("Ingrese Genero");
        char sSexo=sc.next().charAt(0);
        sSexo=sc.next().charAt((0));
        System.out.println(" ");
        System.out.println(" ");
        p.calcularIMC();
        p.esMayorDeEdad();
        p.comprobarSexo();

    }
}