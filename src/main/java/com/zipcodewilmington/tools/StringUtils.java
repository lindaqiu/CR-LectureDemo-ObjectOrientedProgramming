package com.zipcodewilmington.tools; 

/**
 * Created by leon on 5/25/17.
 */
public final class StringUtils {
    private StringUtils() {
        /** uninstantiable class */
    }

    public static String capitalizeFirstChar(String str) {
        String firstCharacter = new Character(str.charAt(0)).toString();
        return str.replaceFirst(firstCharacter, firstCharacter.toUpperCase());
    }
}