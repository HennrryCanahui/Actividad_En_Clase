public class Electrodomestico extends DispositivoElectronico{
    private int peso;
    private boolean tieneAceroInoxidable;
    public Electrodomestico(int Precio, String Modelo, int Peso, boolean TieneAceroInoxidable) {
        super(Precio, Modelo);
        this.peso = Peso;
        this.tieneAceroInoxidable = TieneAceroInoxidable;
    }
}
