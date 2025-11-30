package practica_pc_componentes;

public class PlacaBase {
    String marca;
    String modelo;
    String tipoSocket;
    String factorForma;
    double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoSocket() {
        return tipoSocket;
    }

    public void setTipoSocket(String tipoSocket) {
        this.tipoSocket = tipoSocket;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
