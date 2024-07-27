public class Laptop extends Computadora{
    private int tamaño;
    private int peso;

    public Laptop(int Precio, String Modelo, boolean TienenRgb, boolean EsGaming, int Tamaño, int Peso) {
        super(Precio, Modelo, TienenRgb, EsGaming);
        this.tamaño = Tamaño;
        this.peso = Peso;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
