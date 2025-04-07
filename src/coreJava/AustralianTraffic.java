package coreJava;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic,Continental {
 
	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		AustralianTraffic at = new AustralianTraffic();
		Continental ct = new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
	}

	@Override
	public void greenGo() {
		
		System.out.println(" green go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("redstop implementation");
		
	}
	
	public void walkonsymbol() {
		System.out.println("walking");
	
	}
	@Override
	public void FlashYellow() {
		System.out.println(" flash yellow implementation");
		
		
	}

	@Override
	public void Trainsymbol() {
		
		
	}

}
