package com.example.builder;

/**
 * @author liubin
 * @date 2021-03-31
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        houseDirector.createHouse();
        houseDirector.setHouseBuilder(new HighHouse());
        houseDirector.createHouse();
    }
}
