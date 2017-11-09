package ec.edu.ister.modelo;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public class Cuenta {

    /**
     * @param aContadorCuentas the contadorCuentas to set
     */
    public static void setContadorCuentas(int aContadorCuentas) {
        contadorCuentas = aContadorCuentas;
    }

    private String id;
    private Double saldo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numeroChjuenta;
    private String tipocuenta;
    private static int contadorCuentas;

    public Cuenta() {
        ++contadorCuentas;
    }

    public Cuenta(String id) {
        this.id = id;
        this.saldo = 0.0;
        contadorCuentas++;
    }

    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    public static int getContadorCuentas() {

        return contadorCuentas;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipocuenta
     */
    public String getTipocuenta() {
        return tipocuenta;
    }

    /**
     * @param tipocuenta the tipocuenta to set
     */
    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

}
