public class Tablet extends DispositivoMovil{
    private int peso;
    private boolean estaEncendido;
    public Tablet(int Precio, String Modelo, int TamañoDePantalla, int CantidadCamaras, int Peso, boolean EstaEncendido) {
        super(Precio, Modelo, TamañoDePantalla, CantidadCamaras);
        this.estaEncendido = EstaEncendido;
        this.peso = Peso;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }
}
