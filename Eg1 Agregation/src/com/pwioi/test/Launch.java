package com.pwioi.test;
import java.util.Arrays;

import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Charger charger=new Charger("apple",240);
		Mobile m=new Mobile(90000,"snapdragon");
		m.setC(charger);
		System.out.println(m.c.getBrand());
		System.out.println(m.c.getVoltage());
		System.out.println(m.os.getSize());
		System.out.println(m.os.getName());
		m=null;
		System.out.println(m.c.getBrand());
		System.out.println(m.c.getVoltage());
		System.out.println(m.os.getSize());
		System.out.println(m.os.getName());
		System.out.println(charger.getBrand());
		System.out.println(charger.getVoltage());
	}
}
