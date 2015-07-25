package com.martin.designmode23.BuilderMode;

/**
 * 建造者
 * Created by Martin on 2015/7/26.
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
