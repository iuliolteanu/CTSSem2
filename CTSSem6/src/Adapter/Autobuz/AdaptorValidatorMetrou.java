package Adapter.Autobuz;

import Adapter.Metrou.ValidatorMetrou;

public class AdaptorValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {
    @Override
    public void validareBilet() {
        super.validareCalatorie();
    }
}
