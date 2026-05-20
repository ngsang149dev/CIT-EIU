package Problem4;

public class FuelGauge {
    private int gallon;

    public FuelGauge(int gallon) {
        this.gallon = gallon;
    }

    public int getGallon() {
        return gallon;
    }

    public void increaseGallon() {
        if (this.gallon < Const.CAR_MAX_GALLON) {
            this.gallon+= 1;
        }
    }

    public void decrementGallon() {
        if (this.gallon > 0) {
            this.gallon -=1;
        }
    }
}
