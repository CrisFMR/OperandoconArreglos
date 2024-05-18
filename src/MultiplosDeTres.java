import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(33);
        numeros.add(21);
        numeros.add(8);
        numeros.add(2);
        numeros.add(61);
        suma(numeros);

    }
    public static void suma (ArrayList <Integer> lista) {
        int suma = 0 ;
        for (Integer i : lista) {
            if ( i%3 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("Para la entrada anterior la suma total de múltiplos de tres es: \n" + suma);

    }
}
