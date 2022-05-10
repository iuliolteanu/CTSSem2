package Builder_var2Main;

import Builder_var2.AutobuzBuilder;
import Builder_var2.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setAreOprire(false);
        autobuzBuilder.setNrLinie(25);
        AutobuzLinie autobuz = autobuzBuilder.build();

        System.out.println(autobuz.toString());

    }
}
