package com.zipcodewilmington.tools; 

import java.util.Random;

/**
 * Created by Leon on 2/4/2017.
 * @ATTENTION_TO_STUDENTS You are FORBIDDEN from modifying this class
 */
public final class RandomUtils {
    private static final Random random = new Random();

    private RandomUtils() {
        /** This class is uninstantiable */
    }

    /**
     * @param percentage - the likelihood of returning true
     * @return - some boolean value
     */
    public static boolean createBoolean(float percentage) {
        return percentage > createFloat(0, 100);
    }

    /** @return a random character between the specified min and max character range */
    public static Character createCharacter(char min, char max) {
        return (char) createInteger((int) min, (int) max).intValue();
    }

    /** @return a random float between the specified min and max numeric range */
    public static Float createFloat(float min, float max) {
        return random.nextFloat() * (max - min) + min;
    }

    /** @return a random integer between the specified min and max numeric range */
    public static Integer createInteger(Integer min, Integer max) {
        return createFloat(min, max).intValue();
    }

    /** @return a random string of the specified length containing characters in the specified range */
    public static String createString(char min, char max, int stringLength) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < stringLength; i++) {
            sb.append(createCharacter(min, max));
        }
        return sb.toString();
    }
}