package com.example.builder;

/**
 * 抽象的建造者
 * @author liubin
 * @date 2021-03-31
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 建造地基
     */
    public abstract void buildBasic();

    /**
     * 建造墙壁
     */
    public abstract void buildWalls();

    /**
     * 建造屋顶
     */
    public abstract void buildRoofed();

    /**
     * 建造房子
     * @return 房子
     */
    public House buildHouse(){
        return house;
    }
}
