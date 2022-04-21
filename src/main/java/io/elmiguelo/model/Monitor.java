package io.elmiguelo.model;

public class Monitor {
    private final int monitorId;
    private String brand;
    private double size;
    private static int monitorCounter;
    private Monitor(){
        this.monitorId = ++Monitor.monitorCounter;
    }

    public Monitor(String brand, double size){
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitorId=" + monitorId +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
