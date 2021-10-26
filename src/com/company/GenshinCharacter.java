package com.company;

public class GenshinCharacter {
    public String name;
    public String sex;
    public String element;
    public String weapon;
    public String country;

    public GenshinCharacter(String name, String sex, String element, String weapon, String country) {
        this.name = name;
        this.sex = sex;
        this.element = element;
        this.weapon = weapon;
        this.country = country;
    }

    public String toString()
    {
        return name + " " + sex + " " + element + " " + weapon + " " + country;
    }
}
