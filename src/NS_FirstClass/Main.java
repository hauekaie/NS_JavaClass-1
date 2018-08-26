package NS_FirstClass;
import java.lang.reflect.Type;
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

        StringBuilder nombre = new StringBuilder("Haziel"); //
        String apellido = "Hernandez";
        System.out.println(nombre.toString());

        agregarApellido(nombre, apellido);
        System.out.println(nombre.toString());


        Car carro, carro2, carro3;
        carro = new Car();
        //CARRO NUMERO UNO
        carro.setPlates("Las placas son: ASFGT");
        //String x = carro;
        carro.setType("El carro es un Sentra");
        carro2 = new Car();
        //CARRO NUMERO DOS
        carro2.setPlates("Las placas son: ASEFT");
        carro2.setType("El carro es un Ibiza");
        carro3 = new Car();
        //CARRO NUMERO TRES
        carro.setPlates("Las Placas son: TEGYS");
        carro.setType("El carro es un Jetta");

        //ASIGNACIÓN DEL LUGAR PARA ESTACIONARSE
        Spot lugar1, lugar2, lugar3;
        lugar1 = new Spot();
        //LUGAR NUMERO UNO
        lugar1.setNumber_of_Spot(1);
        lugar1.setCar(carro.getPlates());
        System.out.println(lugar1);





    }

    public static void agregarApellido(StringBuilder nombre, String apellido){
        nombre.append(apellido); //= nombre + apellido;
        System.out.println(nombre.toString());
    }


    public static void imprimirArreglo(int[] arreglo){
        System.out.println("Valores del arreglo: ");
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("arreglo [" + j + "] =" + arreglo[j]);
        }
    }

}
