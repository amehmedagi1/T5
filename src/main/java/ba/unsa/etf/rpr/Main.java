package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.Builder.Mobitel;
import ba.unsa.etf.rpr.Builder.MobitelBuilder;
import ba.unsa.etf.rpr.Factory.AutoFactory;
import ba.unsa.etf.rpr.Factory.Factory;

public class Main {
    public static void main(String[] args) {
        MobitelBuilder mb = new MobitelBuilder();
        AutoFactory fabr = new AutoFactory();
        fabr.fabrika("Struja").specifikacije();
        Mobitel m = mb.setRAM("16GB").setEkran("8''").build();
    }
}
