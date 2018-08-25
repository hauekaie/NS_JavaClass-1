package NS_FirstClass;
import java.util.ArrayList;

public class Main {

    //int[] x=new int[(int) (Math.random()*10 +1)];



    public static void main(String[] args) {
	// write your code here
        //System.out.println(x);
        int[] i = new int[10];


        for (int j = 0; j < 10; j++) {
            i[j] = 0;
        }
        imprimirArreglo(i);

        String nombre = "Haziel";
        String apellido = "Hernandez";
        System.out.println(nombre);
        agregarApellido(nombre, apellido);
        System.out.println(nombre);


    }

    public static void agregarApellido(String nombre, String apellido){
        nombre = nombre + apellido;
    }


    public static void imprimirArreglo(int[] arreglo){
        System.out.println("Valores del arreglo: ");
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("arreglo [" + j + "] =" + arreglo[j]);
        }
    }
}
