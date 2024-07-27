public class DispositivoMovil extends DispositivoElectronico {
     private int tamañoDePantalla;
     private int  cantidadCamaras;

    public DispositivoMovil(int Precio, String Modelo, int TamañoDePantalla, int CantidadCamaras) {
        super(Precio, Modelo);
        this.tamañoDePantalla = TamañoDePantalla;
        this.cantidadCamaras = CantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }

    public void setTamañoDePantalla(int tamañoDePantalla) {
        this.tamañoDePantalla = tamañoDePantalla;
    }
}
