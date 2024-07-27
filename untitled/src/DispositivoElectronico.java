abstract class DispositivoElectronico {
    private int precio;
    private String modelo;

    public DispositivoElectronico(int Precio, String Modelo) {
    this.precio = Precio;
    this.modelo = Modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }
}
