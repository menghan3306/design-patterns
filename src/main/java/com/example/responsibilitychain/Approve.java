package com.example.responsibilitychain;

/**
 * 审批抽象类
 * @author liubin
 * @date 2021-04-09
 */
public abstract class Approve {

    protected Approve approve;

    protected String name;

    public Approve(String name){
        this.name = name;
    }

    /**
     * 下一个处理者
     * @param approve
     */
    public void setNextApprove(Approve approve){
        this.approve = approve;
    }

    /**
     * 处理请求
     * @param purchaseRequest 请求
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
