package com.example.responsibilitychain;

/**
 * 教学主任审批环节
 * @author liubin
 * @date 2021-04-09
 */
public class DepartApprove extends Approve {

    public DepartApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println(purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }
}
