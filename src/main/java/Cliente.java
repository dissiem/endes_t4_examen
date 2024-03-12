
import java.util.ArrayList;
import java.util.List;

/**
 * Clase cliente
 * @author Daniel Suarez Moran 12-03-2024
 * @version 1.0
 *
 */
public class Cliente {


    /**
     * Nombre del cliente
     */
        private String nombre;
    /**
     * Apellidos del cliente
     */
    private String apellido;
    /**
     * Identificador del cliente
     */
        private String id;
    /**
     * Listado de cuentas
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor que genera un nuevo cliente
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param id Identificador del cliente
     */
        public Cliente(String nombre, String apellido, String id) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.id = id;
            this.cuentas = new ArrayList<>();
        }

    /**
     * Getter que recoge el nombre del Cliente
     * @return Devuelve el nombre del cliente
     */
        public String getNombre() {
            return nombre;
        }

    /**
     * Setter del nombre del cliente
     * @param  nombre Nombre del cliente
     */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    /**
     * Getter que recoge el apellido del cliente
     * @return devuelve el apellido del cliente
     */
        public String getApellido() {
            return apellido;
        }

    /**
     * setter del apellido del cliente
     * @param apellido Apellido del cliente
     */
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    /**
     * getter que recoge el identificador del cliente
     * @return Devuelve el identificador del cliente
     */
        public String getId() {
            return id;
        }

    /**
     * setter del identificador del cliente
     * @param id Identificador del cliente
     */
        public void setId(String id) {
            this.id = id;
        }

    /**
     * Listado que recoge cuentas bancarias
     * @return Cuentas bancarias
     */
        public List<CuentaBancaria> getCuentas() {
            return new ArrayList<>(cuentas);
        }

    /**
     * Metodo que agrega nuevas cuentas bancarias
     * @param cuenta nueva cuenta bancaria
     */
        public void agregarCuenta(CuentaBancaria cuenta) {
            cuentas.add(cuenta);
        }

    /**
     * metodo para cerrar cuentas bancarias
     * @param numeroCuenta numero de cuenta del cliente
     * @return borra la cuenta
     */
        public boolean cerrarCuenta(String numeroCuenta) {
            return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
        }

    /**
     * metodo toString que muestra la informacion del cliente y su cuenta
     * @return informacion del cliente y su cuenta
     */
        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", id='" + id + '\'' +
                    ", cuentas=" + cuentas +
                    '}';
        }
    }

