package edu.pucrs.verval.utils;

import java.util.Date;

public class FurnitureUtils {
	
	public static boolean dateIntervalIsValid(Date initial, Date end) {
		long diff = end.getTime() - initial.getTime();
		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
		return diffDays >= 4;
	}

}
