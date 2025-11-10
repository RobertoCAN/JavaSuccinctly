package br.part1;

public class Overflow {

	public static void main(String[] args) {
		byte myByte = 127;
		myByte++;
		System.out.println("Byte says 127+1= " + myByte);
		myByte = -128;
		myByte--;
		System.out.println("Byte says -128-1= " + myByte);
		
		short myShort = 32767;
		System.out.println("Short is " + myShort + " before ++");
		myShort++;
		System.out.println("Short is " + myShort + " after ++");
		myShort--;
		System.out.println("Short is " + myShort + " after --");
	}

}
