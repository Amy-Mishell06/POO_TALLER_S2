import java.util.Scanner;

public class EquipoFutbol {
    String nombre;
    String posicion;
    int edad;
    int camiseta;

    public EquipoFutbol(String nombre, String posicion, int edad, int camiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.camiseta = camiseta;
    }

    void imprimir(){
        System.out.println("--- Jugadores --- \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: " +  edad);
        System.out.println("Camiseta: " + camiseta);
        System.out.println();
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el posicion: ");
        String posicion = sc.nextLine();
        System.out.println("Introduzca el edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduzca el camiseta: ");
        int camiseta = sc.nextInt();

        EquipoFutbol player1 = new EquipoFutbol("Luca","Delantero",20,6);
        player1.imprimir();

        EquipoFutbol player2 = new EquipoFutbol(nombre,posicion,edad,camiseta);
        player2.imprimir();

        EquipoFutbol player3 = new EquipoFutbol("Saul","Arquero", 21, 12);
        player3.imprimir();
    }

}
