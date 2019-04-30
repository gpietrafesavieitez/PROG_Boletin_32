package boletin_32_1;

public class Alumno {
    private String nombre;
    private int nota;
    private Enderezo enderezo;

    public Alumno() {
    }
    
    public Alumno(String nombre, int nota, Enderezo enderezo) {
        this.nombre = nombre;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
    
    public void cambiarNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota;
    }
    
    static class Enderezo {
        private int numero;
        private String rua;

        public Enderezo() {
        }

        public Enderezo(int numero, String rua) {
            this.numero = numero;
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public String getRua() {
            return rua;
        }

        @Override
        public String toString() {
            return ", numero=" + numero + ", rua=" + rua + "}";
        }
    }
        public void mostrar(){
            System.out.println(toString() + enderezo.toString());
        }
}