package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.factory.enums.IPhoneGeneration;
import br.com.cod3r.factory.apple.factory.enums.IPhoneLevel;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone(IPhoneGeneration.IPHONE_X, IPhoneLevel.STANDARD);
		iphone.getHardware();
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone(IPhoneGeneration.IPHONE_11, IPhoneLevel.PRO);
		iphone2.getHardware();
	}
}
