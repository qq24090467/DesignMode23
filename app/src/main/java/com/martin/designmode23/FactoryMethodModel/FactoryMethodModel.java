package com.martin.designmode23.FactoryMethodModel;

/**
 * 工厂方法，
 * Created by Martin on 2015/7/25.
 */
public class FactoryMethodModel {

    public static IProduct creator(String target, String parameter) {
        if (parameter == null) {
            switch (target) {
                case "A":
                    return new IProductImpl1();
                case "B":
                    return new IProductImpl2();
                default:
                    return null;
            }
        } else {
            return new IProductImpl3(parameter);
        }
    }

}
