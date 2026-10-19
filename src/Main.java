void main() {
    Aplicacion a1 = new Aplicacion("SistemaVentas", "1.0");
    Aplicacion a2 = new Aplicacion("GestionInventario", "2.1");

    a1.mostrarInformacion();
    System.out.println("-------------------");

    a1.iniciar();
    System.out.println("-------------------");
    a1.mostrarInformacion();

    System.out.println("-------------------");
    System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
}