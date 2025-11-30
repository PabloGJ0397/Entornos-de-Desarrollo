package practica_pc_componentes;

public class CPU {
    String marca;
    String modelo;
    String tipoSocket;
    String generacion;
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

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
