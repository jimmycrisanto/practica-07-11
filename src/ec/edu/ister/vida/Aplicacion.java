package ec.edu.ister.vida;

import ec.edu.ister.modelo.Cuenta;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public class Aplicacion {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        Cuenta cuenta1 =new Cuenta("c002");
  
        System.out.println("el numero d cuentas creadas son:   "+Cuenta.getContadorCuentas());
    }
}
