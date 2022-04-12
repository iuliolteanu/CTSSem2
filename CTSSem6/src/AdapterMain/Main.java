package AdapterMain;

import Adapter.Autobuz.AdaptorValidatorMetrou;
import Adapter.Autobuz.AdaptorValidatorObiecte;
import Adapter.Autobuz.Autobuz;
import Adapter.Metrou.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        //Adaptor de obiecte
        AdaptorValidatorObiecte adaptorObiecte = new AdaptorValidatorObiecte(metrou);
        adaptorObiecte.validareBilet();
        adaptorObiecte.validareAbonament();

        // Adaptor de clase
        AdaptorValidatorMetrou validator = new AdaptorValidatorMetrou();
        validator.validareBilet();
        validator.validareAbonament();
    }
}
