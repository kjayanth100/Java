package com.SetA;

import java.util.Scanner;

class InsurancePolicy {
    private String customerName;
    private String policyType;
    private double policyAmount;
    private double approvedAmount;
    private String policyStatus;

    public InsurancePolicy(String customerName, String policyType, double policyAmount) {
        this.customerName = customerName;
        this.policyType = policyType;
        this.policyAmount = policyAmount;
        this.approvedAmount = 0.0;
        this.policyStatus = "Pending";
        System.out.println("Policy Profile Created");
    }

    public void updateApprovedAmount(double amount) {
        if (amount <= 0 || amount > policyAmount) {
            System.out.println("Invalid approved amount");
        } else {
            this.approvedAmount = amount;
            System.out.println("Approved Amount Updated Successfully");
        }
    }

    public void changePolicyStatus(String status) {
        if (status == null || status.equals("")) {
            System.out.println("Invalid policy status");
        } else {
            this.policyStatus = status;
            System.out.println("Policy Status Updated Successfully");
        }
    }
    
    public void viewSummary() {
        System.out.println("\n------ Policy Summary ------");
        System.out.println("Customer: " + customerName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Policy Amount: " + policyAmount);
        System.out.println("Approved Amount: " + approvedAmount);
        System.out.println("Policy Status: " + policyStatus);
    }
}

public class InsuranceManagementSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String cname = in.nextLine();

        System.out.print("Enter Policy Type: ");
        String ptype = in.nextLine();

        System.out.print("Enter Policy Amount: ");
        double pamount = in.nextDouble();

        InsurancePolicy policy = new InsurancePolicy(cname, ptype, pamount);

        int choice = 0;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice [1-4]: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Approved Amount: ");
                    double amt = in.nextDouble();
                    policy.updateApprovedAmount(amt);
                    break;

                case 2:
                    in.nextLine(); // consume newline
                    System.out.print("Enter Policy Status: ");
                    String status = in.nextLine();
                    policy.changePolicyStatus(status);
                    break;

                case 3:
                    policy.viewSummary();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice!= 4);

        in.close();
    }
}