import java.util.Scanner;
public class Venta1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float precio1, precio2, precio3;
    double total;

    System.out.println("COMPRA DE ARTICULOS");
    System.out.println("===================\n");
    System.out.print("Ingrese el precio del artículo 1: ");
    precio1 = sc.nextFloat();
    System.out.print("Ingrese el precio del artículo 2: ");
    precio2 = sc.nextFloat();
    System.out.print("Ingrese el precio del artículo 3: ");
    precio3 = sc.nextFloat();

    total = (precio1 + precio2 + precio3) * 1.12;

    System.out.println("\nGracias por su compra!");
    System.out.println("El total a pagar incluido el IVA es: USD " + total);

  }
}