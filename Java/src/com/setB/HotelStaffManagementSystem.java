package com.setB;

import java.util.Scanner;

class Staff {
    private String staffName;
    private String staffId;
    private String baseShift;

    public Staff(String staffName, String staffId, String baseShift) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.baseShift = baseShift;
    }

    public void profile() {
        System.out.println("------ Staff Details ------");
        System.out.println("Name: " + this.staffName);
        System.out.println("Staff ID: " + this.staffId);
        System.out.println("Shift: " + this.baseShift);
    }
}

class DepartmentStaff extends Staff {

    private String departmentName;
    private String responsibilityLevel;

    public DepartmentStaff(String staffName, String staffId, String baseShift,
                           String departmentName, String responsibilityLevel) {
        super(staffName, staffId, baseShift);
        this.departmentName = departmentName;
        this.responsibilityLevel = responsibilityLevel;
        System.out.println("Staff Profile Created");
    }

    public void updateResponsibility(String level) {
        if (level == null || level.equals("")) {
            System.out.println("Data entered is not valid");
        } else {
            this.responsibilityLevel = level;
            System.out.println("Data Updated Successfully");
        }
    }

    public void updateDepartment(String dept) {
        if (dept == null || dept.equals("")) {
            System.out.println("Data entered is not valid");
        } else {
            this.departmentName = dept;
            System.out.println("Data Updated Successfully");
        }
    }

    public void viewDetails() {
        super.profile();
        System.out.println("Department: " + this.departmentName);
        System.out.println("Responsibility: " + this.responsibilityLevel);
    }
}

public class HotelStaffManagementSystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Staff Name: ");
        String sname = in.nextLine();

        System.out.print("Enter Staff ID: ");
        String sid = in.nextLine();

        System.out.print("Enter Base Shift: ");
        String shift = in.nextLine();

        System.out.print("Enter Department Name: ");
        String dept = in.nextLine();

        System.out.print("Enter Responsibility Level: ");
        String resp = in.nextLine();

        DepartmentStaff ds = new DepartmentStaff(sname, sid, shift, dept, resp);

        int opt = 0;
        do {
            System.out.println("\n--------- Menu -----------");
            System.out.println("1. Update Responsibility");
            System.out.println("2. Update Department");
            System.out.println("3. View Profile");
            System.out.println("4. Exit");
            System.out.print("Enter your choice [1-4]: ");

            opt = in.nextInt();

            switch (opt) {
                case 1:
                    in.nextLine();
                    System.out.print("Enter Responsibility Level: ");
                    String newResp = in.nextLine();
                    ds.updateResponsibility(newResp);
                    break;

                case 2:
                    in.nextLine();
                    System.out.print("Enter Department Name: ");
                    String newDept = in.nextLine();
                    ds.updateDepartment(newDept);
                    break;

                case 3:
                    ds.viewDetails();
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