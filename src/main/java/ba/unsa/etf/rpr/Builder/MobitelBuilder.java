package ba.unsa.etf.rpr.Builder;

public class MobitelBuilder {
    private String brend, model, procesor, RAM, ekran;
    private boolean imaLiBluetooth, imaLiWifi;

    public MobitelBuilder setBrend(String brend) {
        this.brend = brend;
        return this;
    }

    public MobitelBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public MobitelBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public MobitelBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public MobitelBuilder setEkran(String ekran) {
        this.ekran = ekran;
        return this;
    }

    public MobitelBuilder setImaLiBluetooth(boolean imaLiBluetooth) {
        this.imaLiBluetooth = imaLiBluetooth;
        return this;
    }

    public MobitelBuilder setImaLiWifi(boolean imaLiWifi) {
        this.imaLiWifi = imaLiWifi;
        return this;
    }

    public Mobitel build(){
        return new Mobitel(brend, model, procesor, RAM, ekran, imaLiBluetooth, imaLiWifi);
    }
}
