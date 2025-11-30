import practica_pc_componentes.*;

public class Main {
    public static void main(String[] args) {

        CPU cpu1 = new CPU();

        cpu1.setMarca("AMD");
        cpu1.setModelo("Ryzen 7 9800X3D");
        cpu1.setTipoSocket("AM5");
        cpu1.setGeneracion("7");
        cpu1.setPrecio(657.85);

        PlacaBase placaBase1 = new PlacaBase();

        placaBase1.setMarca("ASUS");
        placaBase1.setModelo("UF GAMING B650-PLUS");
        placaBase1.setTipoSocket("AM5");
        placaBase1.setFactorForma("ATX");
        placaBase1.setPrecio(170.99);

        RAM ram1 = new RAM();

        ram1.setMarca("Forgeon");
        ram1.setModelo("Forgeon Cyclone PLUS V2");
        ram1.setTipoMemoria("DDR4");
        ram1.setAlmacenamiento("2 x 16 GB");
        ram1.setPrecio(189.95);

        DiscoDuro discoDuro1 = new DiscoDuro();

        discoDuro1.setMarca("Forgeon");
        discoDuro1.setModelo("Forgeon Nimbus PLUS");
        discoDuro1.setTipoDisco("SSD");
        discoDuro1.setAlmacenamiento("1 TB");
        discoDuro1.setPrecio(84.95);


        TarjetaGrafica tarjetaGrafica1= new TarjetaGrafica();

        tarjetaGrafica1.setMarca("ASUS");
        tarjetaGrafica1.setTipoGrafica("Nvidia");
        tarjetaGrafica1.setTipoMemoria("GDDR5");
        tarjetaGrafica1.setTamanyoMemoria ("12 GB");
        tarjetaGrafica1.setPrecio(589.90);

        String marcaCpu = cpu1.getMarca();

    }
}
