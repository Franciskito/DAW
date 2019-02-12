package hotel;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {
        char[] codigosHabitacion = new char[20];
        int[] capacitats = new int[20];
        int[] plantas = new int[20];
        boolean[] ocupadas = new boolean[20];
        char codigoHabitacion = 'a';
        int capacitat=0;
        boolean ocupada = false;
        codigosHabitacion = añadirCodigosHabitacion(codigosHabitacion, codigoHabitacion);
        plantas = añadirCodigo(plantas);
        capacitats = añadirCodigo(capacitats);
        ocupadas = añadirOcupacion(ocupadas);
        obtenerHabitacionesPorPlanta(codigosHabitacion, plantas);
        obtenerHabitacionesPorCapacitat(codigosHabitacion, capacitats);
        obtenerHabitacionesDisponiblesPorCapacitat(codigosHabitacion,capacitats,ocupadas);
    }

    private static void obtenerHabitacionesPorPlanta(char[] codigosHabitacion, int[] plantas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la planta de donde quieras saber las habitaciones: ");
        int planta = sc.nextInt();
        for (int i = 0; i < plantas.length; i++) {
            if (planta == plantas[i]){
                System.out.print(codigosHabitacion[i] + " ");
            }
        }
        System.out.println();
    }

    private static void obtenerHabitacionesPorCapacitat(char[] codigosHabitacion, int[] capacitats) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la capacitat de donde quieras saber las habitaciones: ");
        int planta = sc.nextInt();
        for (int i = 0; i < capacitats.length; i++) {
            if (planta == capacitats[i]){
                System.out.print(codigosHabitacion[i] + " ");
            }
        }
        System.out.println();
    }

    private static void obtenerHabitacionesDisponiblesPorCapacitat(char[] codigosHabitacion, int[] capacitats, boolean[] ocupadas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la capidad deseada: ");
        int planta = sc.nextInt();
        for (int i = 0; i < capacitats.length; i++) {
            if (planta == capacitats[i] && !ocupadas[i]){
                System.out.print(codigosHabitacion[i] + " ");
            }
        }
        System.out.println();
    }

    private static boolean[] añadirOcupacion(boolean[] ocupadas) {
        for (int i = 0; i < ocupadas.length ; i++) {
            if (i % 2 == 0){
                ocupadas[i]=true;
            }
        }
        System.out.println(Arrays.toString(ocupadas));
        return ocupadas;
    }

    private static int[] añadirCodigo(int[] plantas) {
        for (int i = 0; i < plantas.length ; i++) {
            plantas[i] = 1 + (int) (Math.random() * (3 - 1 + 1));
        }
        System.out.println(Arrays.toString(plantas));
        return plantas;
    }

    private static char[] añadirCodigosHabitacion(char[] codigos, char codigoHabitacion) {
        for (int i = 0; i < codigos.length; i++) {
            codigos[i] = codigoHabitacion;
            codigoHabitacion += 1;
        }
        System.out.println(Arrays.toString(codigos));
        return codigos;
    }
}
