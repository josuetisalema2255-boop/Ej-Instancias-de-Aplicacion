public class Aplicacion {

    // Atributos privados
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    // Atributo static compartido
    private static int totalAplicaciones = 0;

    // Constructor requerido
    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        if (version != null && !version.trim().isEmpty()) {
            this.version = version;
        }
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    // Métodos solicitados
    public void iniciar() {
        this.ejecutando = true;
        System.out.println("La aplicación " + nombre + " ha sido iniciada.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println("La aplicación " + nombre + " ha sido cerrada.");
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id +
                "\nNombre: " + nombre +
                "\nVersión: " + version +
                "\nEjecutando: " + ejecutando);
    }
}