package com.xyzinc.deviceinventory.common;

import java.util.regex.Pattern;

public class Utilities {
	
	public static boolean isAValidString(String StringToMatch) {
 	   String regex = "[a-zA-Z0-9]+[-][a-zA-Z0-9]+";
 	   Pattern.compile(regex);
 	   return Pattern.matches(regex, StringToMatch);
 	}

}
