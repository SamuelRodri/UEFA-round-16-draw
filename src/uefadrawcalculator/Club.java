package uefadrawcalculator;

import java.awt.Image;

public class Club {

    private String name;
    private Image shield;
    private Country country;
    private GroupStage groupStage;
    
    public Club(String name, Image shield, Country country, GroupStage groupStage) {
        this.name = name;
        this.shield = shield;
        this.country = country;
        this.groupStage = groupStage;
    }

    public GroupStage getGroupStage() {
        return groupStage;
    }

    public void setGroupStage(GroupStage groupStage) {
        this.groupStage = groupStage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getShield() {
        return shield;
    }

    public void setShield(Image shield) {
        this.shield = shield;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
