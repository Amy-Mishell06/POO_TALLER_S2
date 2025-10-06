import java.util.Scanner;

public class Empresa {
    String nombre;
    String cargo;
    double salario;
    int dia;
    int mes;
    int ano;

    public Empresa(String nombre, String cargo, double salario, int dia, int mes, int ano) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println(" --- EMPRESA --- ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de ingreso: " + dia +  mes +  ano);

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el cargo: ");
        String cargo = sc.nextLine();
        System.out.println("Ingrese el salario: ");
        double salario = sc.nextDouble();
        System.out.println("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int ano = sc.nextInt();

        Empresa empresa = new Empresa(nombre, cargo, salario, dia, mes, ano);
        empresa.imprimir();

        Empresa empresa1 = new Empresa("Karen", "Contador", 10000, 12, 05, 2022);
        empresa1.imprimir();

        Empresa empresa2 = new Empresa("Luca", "Director", 50000, 22, 06, 2023);
        empresa2.imprimir();



    }

}
