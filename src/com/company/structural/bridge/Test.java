package com.company.structural.bridge;



/*

    in design pattern ro harchi fk kardam rahe ghashangi be zahnam naresid
    yani chizaei ham ke miresid ham kheyli pichide bud
    vase hamin be hamin rahe hale abstract(entezae) razi shodam

    bebin asan in patterin vase in omade ke abstract layer ma ro az impliment layer joda kone
    yani chi ?
    bebin age animal ro bebini mige man ye movement daram vali inke movement chie to moghe piyade kardan to baram moshakhas kon
    abstract method move ro ham ke on movement ke dari behem midi piyade karde

    in ye mesale kheyli sade hast ke mige mitoni impliment haro jaye dg piyade koni o faghat behem pas bede
    hamin faghat behesh fk kon ziad sakht nist

 */

public class Test {

    public static void main(String[] args) {

        Animal dog = new Dog(new Running());
        dog.move();//in running mikone

        Animal eagle = new Eagle(new Fly());
        eagle.move();//inam fly mikone

        Animal sloth = new Sloth(new Crawling());
        sloth.move();//inam crowling mikone
    }
}
//omidvaram ke toneste basham khob begamesh
//agaram nagerefti pas man bad goftamesh  ;)