package com.chen.prototype;

import java.util.Hashtable;

/**
 * @Desc: 原型模式：从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * 查询相应 ID 的形状
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 创建各种形状，并保存到 shapeMap(id, shape)
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
