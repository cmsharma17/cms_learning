package com.cms.java8.Optional;

import java.util.Optional;

/*To avoid the abnormal termination, we use Optional class. In the following example, we are using Optional.
 So, our program can execute without crashing. */

public class OptionalExample {

    public static void main(String[] args) {
        String str[] = new String[10];
        Optional<String> strChkNull = Optional.ofNullable(str[5]);
        if(strChkNull.isPresent()){ // check for value is present or not

            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}
