import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {

        ArrayList<Integer> Pasos = new ArrayList<Integer>();
        Pasos.add(300);
        Pasos.add(405);
        Pasos.add(403);
        Pasos.add(506);
        Pasos.add(100020040);
        Pasos.add(45006);
        Pasos.add(-1044);
        clearSteps(Pasos);
        System.out.println("Los Registros válidos son:\n "+ Pasos);
        promedio(clearSteps(Pasos));
    }

    public static ArrayList<Integer> clearSteps(ArrayList <Integer> listA) {
        for (int i = 0; i < listA.size(); i++)
            if(listA.get(i) < 200 || listA.get(i) > 100000) {
                listA.remove(i);
            }
        return listA;
    }
    public static void promedio(ArrayList <Integer> listB) {

        int Suma = 0 ;
        for (Integer i : listB) {
            Suma = Suma + i;
        }
        System.out.println("El promedio de pasos para los registros anteriores, es de: \n" + Suma / listB.size() + " pasos");
    }

}
