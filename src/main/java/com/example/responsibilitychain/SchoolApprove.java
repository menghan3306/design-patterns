package com.example.responsibilitychain;

/**
 * 校长审批环节
 * @author liubin
 * @date 2021-04-09
 */
public class SchoolApprove extends Approve {

    public SchoolApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>10000){
            System.out.println(purchaseRequest.getId()+"被"+this.name+"处理");
        }else {
            approve.processRequest(purchaseRequest);
        }
    }
}
