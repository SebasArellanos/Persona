import java.util.Scanner;
class MainPersona{
    public static void main(String[] args) {
    Scanner op= new Scanner(System.in);
    String nombre;
    int edad;
    double altura;
    Persona x= new Persona();
    
    System.out.println("INGRESE SU NOMBRE: ");
    nombre=op.next();
    x.nombre= nombre;
    System.out.println("INGRESE SU EDAD: ");
    edad=op.nextInt();
    x.edad= edad;
    System.out.println("INGRESE SU ALTURA: ");
    altura=op.nextDouble();
    x.altura= altura;
    
    x.mostrarNombre();
    x.mostrarEdad();
    x.mostrarAltura();

    }
}