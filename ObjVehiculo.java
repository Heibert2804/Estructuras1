public class ObjVehiculo {
    private String marca;
    private String Tipo;
    private int Cilindraje;
    private int NumeroCelda;
    private double PagoAnterior;
    private double PagoActual;

    //Source Action, creacion de el constructor y creacion de Getter y Setter
    public ObjVehiculo(String marca, String tipo, int cilindraje, int numeroCelda, double pagoAnterior,
            double pagoActual) {
        this.marca = marca; //Si se escribe arriba en minusculas la primera letra, aca se colocaria this.variable
        Tipo = tipo;
        Cilindraje = cilindraje;
        NumeroCelda = numeroCelda;
        PagoAnterior = pagoAnterior;
        PagoActual = pagoActual;
    }
    public ObjVehiculo() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public int getNumeroCelda() {
        return NumeroCelda;
    }
    public void setNumeroCelda(int numeroCelda) {
        NumeroCelda = numeroCelda;
    }
    public double getPagoAnterior() {
        return PagoAnterior;
    }
    public void setPagoAnterior(double pagoAnterior) {
        PagoAnterior = pagoAnterior;
    }
    public double getPagoActual() {
        return PagoActual;
    }
    public void setPagoActual(double pagoActual) {
        PagoActual = pagoActual;
    }
    


}
