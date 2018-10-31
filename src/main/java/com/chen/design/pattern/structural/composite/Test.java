package com.chen.design.pattern.structural.composite;

import java.math.BigDecimal;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-31
 */
public class Test {

    public static void main(String[] args) {
        AbstractCatalogComponent mainCatalog = new CourseCatalog("目录", 1);

        AbstractCatalogComponent javaCatalog = new CourseCatalog("Java课程目录", 2);
        AbstractCatalogComponent pythonCatalog = new CourseCatalog("Python课程目录", 2);
        AbstractCatalogComponent jsCatalog = new CourseCatalog("JavaScrpit课程目录", 2);

        AbstractCatalogComponent javaCourse1 = new Course("Java设计模式", BigDecimal.valueOf(90));
        AbstractCatalogComponent javaCourse2 = new Course("自定义权限管理系统", BigDecimal.valueOf(130));
        AbstractCatalogComponent javaCourse3 = new Course("SpringBoot 2.0新特性", BigDecimal.valueOf(80));

        javaCatalog.add(javaCourse1);
        javaCatalog.add(javaCourse2);
        javaCatalog.add(javaCourse3);

        mainCatalog.add(javaCatalog);
        mainCatalog.add(pythonCatalog);
        mainCatalog.add(jsCatalog);

        mainCatalog.print();
    }
}
