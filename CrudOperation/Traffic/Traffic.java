package com.xworks.CrudOperation.Traffic;

public class Traffic {
    private boolean wearingSeatBelt;
    private int speed;
    private int yearOfExp;
    private boolean HasLicence;

    public Traffic(){

    }

    public boolean isWearingSeatBelt() {
        return wearingSeatBelt;
    }

    public void setWearingSeatBelt(boolean wearingSeatBelt) {
        this.wearingSeatBelt = wearingSeatBelt;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public boolean isHasLicence() {
        return HasLicence;
    }

    public void setHasLicence(boolean hasLicence) {
        HasLicence = hasLicence;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "wearingSeatBelt=" + wearingSeatBelt +
                ", speed=" + speed +
                ", yearOfExp=" + yearOfExp +
                ", HasLicence=" + HasLicence +
                '}';
    }
}
