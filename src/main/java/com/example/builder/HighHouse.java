package com.example.builder;

/**
 * @author liubin
 * @date 2021-03-31
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("建造高级房子，地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("建造高级房子，墙壁");
    }

    @Override
    public void buildRoofed() {
        System.out.println("建造高级房子，屋顶");
    }
}
