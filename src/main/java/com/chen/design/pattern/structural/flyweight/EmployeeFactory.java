package com.chen.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工的工厂类
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    private EmployeeFactory() {
    }

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            manager.setReportContent(department+"部门汇报内容...");
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }

}
