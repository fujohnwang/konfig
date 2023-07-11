package com.keevol.config;

public class AppTest {
    public static void main(String[] args) throws Throwable {
        Konfig config = new Konfig();
        System.out.println(config.get("name"));
        System.out.println(Integer.parseInt(config.get("version")));
    }
}
