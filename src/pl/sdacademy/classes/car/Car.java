package pl.sdacademy.classes.car;

public class Car {
    private int ccm;
    private String make;

    public Car() {
    }

    public Car(int ccm, String make) {
        this.ccm =  ccm;
        this.make = make;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void upgrade(){
        ccm += 500;
    }
}
