package helpers;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomHelper {
    public static String getRandomEmail() {
        return getRandomText(10) + "@gmail.com";
    }

    public static String getRandomText() {
        return getRandomText(10);
    }


    public static String getRandomText(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

//    public static String getRandomZipCode(int count) {
//        return Faker.
//    }
}