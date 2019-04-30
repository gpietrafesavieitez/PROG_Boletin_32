package boletin_32_1;

public class Boletin_32_1 {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("pepe", 10, new Alumno.Enderezo(6, "Zamora"));
        a1.mostrar();
        a1.cambiarNota(9);
        a1.mostrar();
    }
}