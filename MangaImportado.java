public class MangaImportado extends Comic {
    private String paisOrigen;
    private double impuestoAduana;

    public MangaImportado(String codigo, String nombre, double precioBase, int numeroTomo, String paisOrigen, double impuestoAduana) {
        super(codigo, nombre, precioBase, numeroTomo);
        this.paisOrigen = paisOrigen;
        this.impuestoAduana = impuestoAduana;
    }

    @Override
    public double calcularPrecioVenta() {
        return super.calcularPrecioVenta() + this.impuestoAduana;
    }

    public static void main(String[] args) {
        MangaImportado manga = new MangaImportado(
            "MAN-JP-01", "Akira Edición Coleccionista", 30000.0, 1, "Japón", 8500.0
        );

        System.out.println("Manga: " + manga.getNombre());
        System.out.println("País de origen: " + manga.paisOrigen);
        System.out.println("Precio final con aduana: $" + manga.calcularPrecioVenta());
    }
}