public class Banco {
    String Nombre;
    String DNI;
    double saldo;

    public Banco(){
        Nombre="Pablo Uchuari";
        DNI="1236547896";
        saldo=0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}