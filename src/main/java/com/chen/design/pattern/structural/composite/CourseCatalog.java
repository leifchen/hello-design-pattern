package com.chen.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 *
 * @Author LeifChen
 * @Date 2018-10-31
 */
public class CourseCatalog extends AbstractCatalogComponent {

    private String name;
    private Integer level;
    private List<AbstractCatalogComponent> items = new ArrayList<>();

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(AbstractCatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(AbstractCatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(name);
        for (AbstractCatalogComponent item : items) {
            if (level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
