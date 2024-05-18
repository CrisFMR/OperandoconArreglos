import java.util.ArrayList;

public class MultiplosDeTresPromedio {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(33);
        valores.add(21);
        valores.add(8);
        valores.add(2);
        valores.add(61);
        suma(valores);

        promedio(valores);

    }
    public static void suma (ArrayList <Integer> listA) {
        int suma = 0 ;
        for (Integer i : listA) {
            if ( i%3 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("Para la entrada anterior la suma total de múltiplos de tres es: \n" + suma);

    }
    //Desarrollo ejercicio 4
    public static void promedio (ArrayList <Integer> listB) {
        int suma = 0;
        int i = 0;
        for (Integer e : listB) {
            if ( e%3 == 0) {
                suma = suma + e;
                i++;
            }
        }
        System.out.println("Para la entrada anterior el promedio entre multiplos de tres, es: \n" + suma/ i);

    }
}
