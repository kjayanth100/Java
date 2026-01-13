package com.setB;

import java.util.Scanner;

class SubscriptionPlan {

    private String subscriberName;
    private String planType;
    private double planCost;
    private double paidAmount;
    private String subscriptionStatus;

    public SubscriptionPlan(String subscriberName, String planType, double planCost) {
        this.subscriberName = subscriberName;
        this.planType = planType;
        this.planCost = planCost;
        this.paidAmount = 0.0;
        this.subscriptionStatus = "Active";
        System.out.println("Subscription Profile Created");
    }

    public void updatePaidAmount(double amount) {
        if (amount <= 0 || amount > planCost) {
            System.out.println("Invalid payment amount");
        } else {
            this.paidAmount = amount;
            System.out.println("Payment Updated Successfully");
        }
    }

    public void updateSubscriptionStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            System.out.println("Invalid subscription status");
        } else {
            this.subscriptionStatus = status;
            System.out.println("Status Updated Successfully");
        }
    }

    public void viewSummary() {
        System.out.println("----- Subscription Summary ------");
        System.out.println("Subscriber: " + this.subscriberName);
        System.out.println("Plan Type: " + this.planType);
        System.out.println("Plan Cost: " + this.planCost);
        System.out.println("Paid Amount: " + this.paidAmount);
        System.out.println("Subscription Status: " + this.subscriptionStatus);
    }
}

public class SubscriptionManagementSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Subscriber Name: ");
        String sname = in.nextLine();

        System.out.print("Enter Plan Type: ");
        String ptype = in.nextLine();

        System.out.print("Enter Plan Cost: ");
        double pcost = in.nextDouble();

        SubscriptionPlan sp = new SubscriptionPlan(sname, ptype, pcost);

        int opt = 0;
        do {
            System.out.println("--------- Menu -----------");
            System.out.println("1. Update Payment");
            System.out.println("2. Change Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice [1-4]: ");

            opt = in.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter Paid Amount: ");
                    double amt = in.nextDouble();
                    sp.updatePaidAmount(amt);
                    break;

                case 2:
                    in.nextLine();
                    System.out.print("Enter Subscription Status: ");
                    String status = in.nextLine();
                    sp.updateSubscriptionStatus(status);
                    break;

                case 3:
                    sp.viewSummary();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (opt != 4);

        in.close();
    }
}
