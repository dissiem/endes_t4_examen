/**
 * Clase cuenta bancaria
 * @author Daniel Suarez Moran 12-03-2024
 * @version 1.0
 */

    public class CuentaBancaria {
    /**
     * Numero de cuenta
     */
    private String numeroCuenta;
    /**
     * Saldo de la cuenta
     */
        private double saldo;
    /**
     * Cliente propietario de la cuenta
     */
    private Cliente propietario;

    /**
     * Constructor de la cuenta bancaria
     * @param numeroCuenta Numero de cuenta del cliente
     * @param saldo Saldo disponible en la cuenta
     * @param propietario Cliente propietario de la cuenta
     */

        public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.propietario = propietario;
        }

    /**
     * getter que recoge el numero de cuenta
     * @return devuelve el numero de cuenta
     */
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

    /**
     * setter del numero de cuenta
     * @param numeroCuenta numero de cuenta
     */
        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

    /**
     * getter que recoge el saldo de la cuenta bancaria
     * @return devuelve el saldo disponible
     */
        public double getSaldo() {
            return saldo;
        }

    /**
     * setter del saldo de la cuenta
     * @param saldo saldo de la cuenta
     */
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

    /**
     * getter que recoge el propietario de la cuenta
     * @return devuelve el propietario de la cuenta
     */
        public Cliente getPropietario() {
            return propietario;
        }

    /**
     * setter del propietario de la cuenta
     * @param propietario propietario de la cuenta
     */
        public void setPropietario(Cliente propietario) {
            this.propietario = propietario;
        }

    /**
     * metodo para depositar una cantidad en la cuenta
     * @param cantidad cantidad depositada
     */
        public void depositar(double cantidad) {
            saldo += cantidad;
        }

    /**
     * metodo para retirar una cantidad de la cuenta
     * @param cantidad cantidad a retirar
     * @return devuelve si se puede retirar dicha cantidad
     */
        public boolean retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                return true;
            }
            return false;
        }

    /**
     * metodo toString que muestra la informacion de la cuenta bancaria
     * @return informacion de la cuenta
     */
        @Override
        public String toString() {
            return "CuentaBancaria{" +
                    "numeroCuenta='" + numeroCuenta + '\'' +
                    ", saldo=" + saldo +
                    ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                    '}';
        }
}
