package com.company.structural.decorator;


/*

decorator design patterin bishtar vase jahaei karbord dare ke ma mikhayim ye raftar[behavior] ro be sorate
daynamik be ye Object bedim
to in mesal ke mibinid ma to comment 1 hich raftare ezafe be object nadadim
vali comment 2 mibinid ke ma be houseBlend 3ta raftare dg dadim
hala khorojish ro bebinid
--- House Blend coffee,Mocha,Mocha,soy$2.8
age mikhayid bishtar az decorator to java bedonid mitoni class haye I/O to java ro bebinid kheyli decorator mibinid

 */
public class CoffeeShopTest {
    public static void main(String[] args) {

        Beverage espersso = new Espersso(); //1
        System.out.println(espersso.getDescribe() + "$" + espersso.cost());

        Beverage houseBlend = new HouseBlend(); //2
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescribe() + "$" + houseBlend.cost());
    }
}
