package application;

public class Application {

    private int modelNum;
    private String versionNum;
    private int price;
    private String mobileName;
    private int ManufactureYear;



    public  Application(){


    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getManufactureYear() {
        return ManufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        ManufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Application{" +
                "modelNum=" + modelNum +
                ", versionNum='" + versionNum + '\'' +
                ", price=" + price +
                ", mobileName='" + mobileName + '\'' +
                ", ManufactureYear=" + ManufactureYear +
                '}';
    }
}
