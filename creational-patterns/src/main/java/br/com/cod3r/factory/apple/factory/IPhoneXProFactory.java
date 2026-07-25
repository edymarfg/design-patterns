package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXProFactory extends IPhoneFactory {

    @Override
    public IPhone create() {
        return new IPhoneXSMax();
    }
}
