package net.matt;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Driver {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println("["+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.DAY_OF_MONTH)+"]");

	}

}
