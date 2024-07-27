public class Desktop  extends Computadora{
    private int tamaño;
    private int peso;

    public Desktop(int Precio, String Modelo, boolean TienenRgb, boolean EsGaming, int Tamaño, int Peso) {
        super(Precio, Modelo, TienenRgb, EsGaming);
        this.tamaño = Tamaño;
        this.peso = Peso;
    }

    public int getPeso() {
        return peso;
    }

    public int getTamaño() {
        return tamaño;
    }
}
