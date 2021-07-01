package com.example.responsibilitychain;

/**
 * @author liubin
 * @date 2021-04-09
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 7000);
        DepartApprove departApprove = new DepartApprove("教学主任");
        CollegeApprove collegeApprove = new CollegeApprove("院长");
        SchoolApprove schoolApprove = new SchoolApprove("校长");

        //链起来
        departApprove.setNextApprove(collegeApprove);
        collegeApprove.setNextApprove(schoolApprove);

        departApprove.processRequest(purchaseRequest);
    }
}
