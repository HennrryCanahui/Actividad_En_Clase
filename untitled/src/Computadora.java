public class Computadora extends DispositivoElectronico{
    private boolean tieneRgb;
    private boolean esGaming;

    public Computadora(int Precio, String Modelo, boolean TienenRgb, boolean EsGaming) {
        super(Precio, Modelo);
        this.tieneRgb =TienenRgb;
        this.esGaming = EsGaming;
    }

    public boolean isEsGaming() {
        return esGaming;
    }

    public boolean isTieneRgb() {
        return tieneRgb;
    }
}
