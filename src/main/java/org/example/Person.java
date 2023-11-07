package org.example;

public class Person {
    public String name;
    public String geschlecht;
    public int alter;

    public Person(String personName,String personGeschlecht,int personAlter){
        this.name=personName;
        this.geschlecht=personGeschlecht;
        this.alter=personAlter;

    }
    public String vorstellung(){
        String meineVorstellung="hallo, ich bin " +this.name+" und "+this.alter+" Jahre alt";
        /*
        meineVorstellung.concat(this.name);
        meineVorstellung.concat(" und ");
        meineVorstellung.concat(" "+this.alter);
        meineVorstellung.concat(" Jahre alt");*/
        return meineVorstellung;
    }
}
