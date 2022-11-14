package ba.unsa.etf.rpr.Builder;

public class Mobitel {
    private String brend, model, procesor, RAM, ekran;
    private boolean imaLiBluetooth, imaLiWifi;

    public Mobitel(String brend, String model, String procesor, String RAM, String ekran, boolean imaLiBluetooth, boolean imaLiWifi) {
        this.brend = brend;
        this.model = model;
        this.procesor = procesor;
        this.RAM = RAM;
        this.ekran = ekran;
        this.imaLiBluetooth = imaLiBluetooth;
        this.imaLiWifi = imaLiWifi;
    }

    public boolean isImaLiWifi() {
        return imaLiWifi;
    }

    public void setImaLiWifi(boolean imaLiWifi) {
        this.imaLiWifi = imaLiWifi;
    }

    public boolean isImaLiBluetooth() {
        return imaLiBluetooth;
    }

    public void setImaLiBluetooth(boolean imaLiBluetooth) {
        this.imaLiBluetooth = imaLiBluetooth;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getEkran() {
        return ekran;
    }

    public void setEkran(String ekran) {
        this.ekran = ekran;
    }
}
