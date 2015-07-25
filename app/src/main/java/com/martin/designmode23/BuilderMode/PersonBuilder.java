package com.martin.designmode23.BuilderMode;

/**
 * Builder（建造者）
 * Created by Martin on 2015/7/26.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
