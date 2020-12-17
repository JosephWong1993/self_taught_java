package com.wong.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射案例2
 * 反射解剖，Student类，获取无参数构造方法
 * 运行有参数构造(String,Int)（对象创建）
 */
public class ReflectDemo03 {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        Class c = Class.forName("com.wong.reflect.Student");
        //Class类的方法，获取有参数的构造,String,int
        //传递构造方法参数列表中，数据类型的class文件类型 getConstructor(Class...p)
        Constructor con = c.getConstructor(String.class, int.class);
        System.out.println(con);
        //运行构造方法，创建对象，Constructor方法 newInstance(传递构造方法的实际参数 Object...o)
        Object object = con.newInstance("张三", 30);
        System.out.println(object);
    }
}
