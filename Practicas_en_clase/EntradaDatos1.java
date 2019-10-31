import java.util.Scanner;

public class EntradaDatos1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nombres, apellidos;
    byte edad;
    int km_viajados;
    float estatura;

    System.out.print("¿Cuáles son sus nombres? ");
    nombres = System.console().readLine();
    System.out.print("¿Cuáles son sus apellidos? ");
    apellidos = s.nextLine();
    System.out.print("¿Cuántos años tiene?: ");
    edad = s.nextByte();
    System.out.print("¿Cuántos Km a viajado?: ");
    km_viajados = s.nextInt();
    System.out.print("¿Cuál es su estatura en metros?: ");
    estatura = s.nextFloat();

    System.out.println("\nAgradecemos sus respuestas\n");
    System.out.print("Su nombre es " + nombres + " " + apellidos + ", ");
    System.out.print("tiene " + edad + " años, mide " + estatura + "m ");
    System.out.println("y ha viajado " + km_viajados + "Km.");
  }
}