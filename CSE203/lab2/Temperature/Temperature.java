package CSE203.lab2.Temperature;

public class Temperature {
    private double ftemp;
    public Temperature() {

    }

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }
    public double getFtemp() {
        return this.ftemp;
    }

    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        return (double)5/9*(ftemp-32);
    }

    public double getKelvin() {
        return ((double)5/9*(ftemp-32))+ 273;
    }
    
}
