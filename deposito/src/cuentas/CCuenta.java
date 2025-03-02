/**
 * @author David Arlanzón Lomas
 * @version 1
 * @return Realización de la tarea obligatoria unidad 4
 * @see Clase principal Main
 */

package cuentas;
public class CCuenta {

	/**
	 * Variables privadas
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * Getters y setters
     * @return
     */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Constructor inicializado
	 */
	public CCuenta()
    {
    }

	/**
	 * Constructor con variables
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el estado de la cuenta
     * @return el saldo restante
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Ingresa un cantidad
     * @param cantidad
     * @throws Exception no es posible ingresar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad
     * @param cantidad
     * @throws Exception cantidad valor negativo o saldo insuficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
