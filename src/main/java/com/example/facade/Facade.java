package com.example.facade;

/**
 * @author liubin
 * @date 2021/07/23
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void openSystem(){
        subSystemOne.methodOpenOne();
        subSystemTwo.methodOpenTwo();
        subSystemThree.methodOpenThree();
    }

    public void closeSystem(){
        subSystemOne.methodCloseOne();
        subSystemTwo.methodCloseTwo();
        subSystemThree.methodCloseThree();
    }
}
