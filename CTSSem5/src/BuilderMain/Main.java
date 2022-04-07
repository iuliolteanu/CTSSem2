package BuilderMain;

import Builder.AutobuzBuilder;
import Builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        //Builder
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Sofer CTS");
        autobuzBuilder.setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.build();

        System.out.println(autobuzLinie);
    }
}
