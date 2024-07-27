public class Smartphone extends DispositivoMovil{
    private int peso;
    private boolean estaEncendido;
    public Smartphone(int Precio, String Modelo, int TamañoDePantalla, int CantidadCamaras, int Peso, boolean EstaEncendido) {
        super(Precio, Modelo, TamañoDePantalla, CantidadCamaras);
        this.estaEncendido = EstaEncendido;
        this.peso = Peso;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public int getPeso() {
        return peso;
    }
}
