import java.util.ArrayList;
import java.util.Scanner;
public class Calificacion_Alumno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> Listacalificaciones = new ArrayList<>();
        //Scanner Lector = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        double promedio;
        String nombre;

        System.out.println("Ingresa el nombre del alumno: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la primer calificación");
        n1 = entrada.nextDouble();
        System.out.println("Ingresa la segunda calificación");
        n2 = entrada.nextDouble();
        System.out.println("Ingresa la tercer calificación");
        n3 = entrada.nextDouble();
        System.out.println("Ingresa la cuarta calificación");
        n4 = entrada.nextDouble();
        System.out.println("Ingresa la quinta calificación");
        n5 = entrada.nextDouble();

        Listacalificaciones.add(n1);
        Listacalificaciones.add(n2);
        Listacalificaciones.add(n3);
        Listacalificaciones.add(n4);
        Listacalificaciones.add(n5);

        for (Double calificaciones : Listacalificaciones) {
            if (calificaciones.equals(+n1)) {
                System.out.println("calificación 1: " + n1);
                System.out.println("calificación 2: " + n2);
                System.out.println("calificación 3: " + n3);
                System.out.println("calificación 4: " + n4);
                System.out.println("calificación 5: " + n5);

                promedio = ((n1 + n2 + n3 + n4 + n5) / 5);
                System.out.println("El promedio de " + nombre + " es: " + promedio);


                if (promedio <= 50) {
                    System.out.println("Tu calificación es : F");
                } else if (promedio >= 51 && promedio <= 60) {
                    System.out.println("Tu calificación es : E");
                } else if (promedio >= 61 && promedio <=70){
                    System.out.println("Tu calificación es : D");
                }else if(promedio >=71 && promedio <=80){
                    System.out.println("Tu calificación es : C");
                }else if(promedio >=81 && promedio <=90){
                    System.out.println("Tu calificación es : B");
                }else if (promedio >= 91 && promedio <=100){
                    System.out.println("Su calificación es : A");
                }

            }
    }

    }
}
