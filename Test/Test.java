package Test;

// Apesar de importar las clases de vehiculos, no podemos acceder a sus atributos
import Vehiculos.*;

class Test {
    public static void main(String []args){

        // Las clases y por tanto los atributos no son accesibles ya que se encuentran en otro paquete

        // Debido al modificador de acceso por defautl // Nos lanza error: MotorCycle cannot be resolved to a type
        MotorCycle mc = new MotorCycle("Honda", "2000", "V6", 4);

        // Debido al modificador de acceso por default // Nos lanza error: Vehicle cannot be resolved to a type
        Vehicle v = new Vehicle("Honda", "2000", "V6", 4);


        /**
         * Las clases y los atributos son accesibles si se encuntran en el mismo paquete que la clase principal
         * por lo que se nos arroja este error. 
         */

    }
}
