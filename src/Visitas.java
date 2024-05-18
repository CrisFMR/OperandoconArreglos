import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
        promedio();
    }

    public static void promedio() {

        ArrayList<Integer> visitas = new ArrayList<Integer>();
        visitas.add(3001);
        visitas.add(1402);
        visitas.add(1304);
        visitas.add(1505);

        int suma = 0;

        for (int i : visitas) {

           suma = suma + i;
        }
        System.out.println("Para la entrada anterior, el resultado es " + suma / visitas.size());
    }
}