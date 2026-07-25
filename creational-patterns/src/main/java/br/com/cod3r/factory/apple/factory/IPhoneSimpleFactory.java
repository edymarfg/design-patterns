package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.factory.enums.IPhoneGeneration;
import br.com.cod3r.factory.apple.factory.enums.IPhoneLevel;
import br.com.cod3r.factory.apple.model.IPhone;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(IPhoneGeneration generation, IPhoneLevel level) {
        IPhoneFactory factory = getFactory(generation, level);
        return factory.create();
    }

    private static IPhoneFactory getFactory(IPhoneGeneration generation, IPhoneLevel level) {
        switch (generation) {
            case IPHONE_X:
                return getIPhoneXFactory(level);
            case IPHONE_11:
                return getIPhone11Factory(level);
            default:
                throw new IllegalArgumentException("Generation not supported");
        }
    }

    private static IPhoneFactory getIPhoneXFactory(IPhoneLevel level) {
        switch (level) {
            case STANDARD:
                return new IPhoneXFactory();
            case PRO:
                return new IPhoneXProFactory();
            default:
                throw new IllegalArgumentException("Level not supported");
        }
    }

    private static IPhoneFactory getIPhone11Factory(IPhoneLevel level) {
        switch (level) {
            case STANDARD:
                return new IPhone11Factory();
            case PRO:
                return new IPhone11ProFactory();
            default:
                throw new IllegalArgumentException("Level not supported");
        }
    }
    
}
