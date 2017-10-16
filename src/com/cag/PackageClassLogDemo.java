package com.cag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageClassLogDemo {
    public static void main(String[] args) {
        System.out.println("PackageClassLogDemo");
        Logger logger = LoggerFactory.getLogger(PackageClassLogDemo.class.getName());
        logger.info("PackageClassLogDemo log");

    }
}
