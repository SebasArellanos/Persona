import java.util.Scanner;

class MainPersona {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String nombre, apellido;
        int edad;
        double altura;
        Persona x = new Persona();

        System.out.println("INGRESE SU NOMBRE: ");
        nombre = op.next();
        x.setNombre(nombre);
        System.out.println("INGRESE SU Apellido: ");
        apellido = op.next();
        x.setApellido(apellido);
        System.out.println("INGRESE SU EDAD: ");
        edad = op.nextInt();
        x.setEdad(edad);
        System.out.println("INGRESE SU ALTURA: ");
        altura = op.nextDouble();
        x.setAltura(altura);

        System.out.println(x);

    }
}