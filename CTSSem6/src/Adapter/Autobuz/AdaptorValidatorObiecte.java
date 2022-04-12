package Adapter.Autobuz;

import Adapter.Metrou.ValidatorMetrou;

public class AdaptorValidatorObiecte implements ValidatorAutobuz{
    private ValidatorMetrou validatorMetrou;

    public AdaptorValidatorObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void validareBilet() {
        validatorMetrou.validareCalatorie();
    }
}
