package com.wiley.innerclass;

public class AnonymousDemo {
	public static void main(String args[])
	{
		Radio r=new Radio(){@Override
		void playList()
		{System.out.println("Playing a list suggested..");}};
		r.playList();
	}
}
abstract class Radio
{
	abstract void playList();
}