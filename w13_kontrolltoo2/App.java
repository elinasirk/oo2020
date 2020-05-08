package app;

import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        List<Ions> ions = new ArrayList<>();

        final Ions ion1 = new Ion("vesinik", 1.008, 1);
        final Ions ion2 = new Ion("lämmastikushape", 62.0049, -1);
        ions.add(ion1);
        ions.add(ion2);

        ions.get(0).getInfo();
        ions.get(1).getInfo();
    }
}