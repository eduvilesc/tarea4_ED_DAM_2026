package cuentas;

/**
 * Clase CCuenta, para gestionar cuentas bancarias.
 * Permite ingresar y retirar dinero, así como consultar el saldo actual.
 * @author Eduardo Villacampa
 * @version 1.0
 * @since 06-apr-2026 17:28:00
 */
public class CCuenta {

/** Nombre del titular de la cuenta */
    private String nombre;
/** Número de cuenta bancaria */
    private String cuenta;
/** Saldo actual de la cuenta */
    private double saldo;
/** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

/** Constructor por defecto */
    public CCuenta()
    {
    }

/** Constructor con parámetros para inicializar la cuenta 
 * @param nom Nombre del titular de la cuenta
 * @param cue Número de cuenta bancaria
 * @param sal Saldo inicial de la cuenta
 * @param tipo Tipo de interés aplicado a la cuenta
*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre =nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

/** Método para consultar el saldo actual de la cuenta
 * @return El saldo actual de la cuenta
 */
    public double estado()
    {
        return saldo;
    }


/** Método para ingresar dinero en la cuenta
 * @param cantidad La cantidad de dinero a ingresar
 * @throws Exception Si la cantidad a ingresar es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }


/** Método para retirar dinero de la cuenta
 * @param cantidad La cantidad de dinero a retirar
 * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo en la
 * cuenta
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /* Getters y Setters para los atributos de la clase */

/** Método para obtener el nombre del titular de la cuenta
 *  @return El nombre del titular de la cuenta 
*/
    public String getNombre() {
        return nombre;
    }

/** Método para establecer el nombre del titular de la cuenta
 * @param nombre El nombre del titular de la cuenta a establecer 
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

/** Método para obtener el número de cuenta bancaria
 * @return El número de cuenta bancaria 
*/    
    public String getCuenta() {
        return cuenta;
    }

/** Método para establecer el número de cuenta bancaria
 * @param cuenta El número de cuenta bancaria a establecer 
*/
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

/** Método para obtener el saldo actual de la cuenta
 * @return El saldo actual de la cuenta 
*/    
    public double getSaldo() {
        return saldo;
    }

/** Método para establecer el saldo actual de la cuenta
 * @param saldo El saldo actual de la cuenta a establecer 
*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

/** Método para obtener el tipo de interés aplicado a la cuenta
 * @return El tipo de interés aplicado a la cuenta 
*/
    public double getTipoInterés() {
        return tipoInterés;
    }

/** Método para establecer el tipo de interés aplicado a la cuenta
 * @param tipoInterés El tipo de interés aplicado a la cuenta a establecer 
*/
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }    
}
