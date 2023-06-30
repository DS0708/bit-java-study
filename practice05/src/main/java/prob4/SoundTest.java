package prob4;

import prob3.Sparrow;
import prob3.Duck;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	private static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
}