public class Refrigerador extends Electrodomestico{
    private String marca;
    private String tamaño;
    public Refrigerador(int Precio, String Modelo, int Peso, boolean TieneAceroInoxidable, String Marca, String Tamaño) {
        super(Precio, Modelo, Peso, TieneAceroInoxidable);
        this.marca = Marca;
        this.tamaño = Tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getMarca() {
        return marca;
    }
}
