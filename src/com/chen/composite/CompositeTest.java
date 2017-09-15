package com.chen.composite;

/**
 * @Desc: 组合模式：测试类
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class CompositeTest {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 8000);

        Employee headSales = new Employee("Robert", "Head Sales", 5000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 5000);

        Employee clerk1 = new Employee("Laura", "Marketing", 2000);
        Employee clerk2 = new Employee("Bob", "Marketing", 2000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 3000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 3000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
