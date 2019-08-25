package com.cms.java8.Optional;

import java.util.Optional;

public class OptionalExample1 {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> chkNull = Optional.ofNullable(str[5]);
        if(chkNull.isPresent()){// It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("String value is not present");
    }
}
