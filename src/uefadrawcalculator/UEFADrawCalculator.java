package uefadrawcalculator;

import java.util.ArrayList;

public class UEFADrawCalculator {

    static Group winners;
    static Group runnerUp;
    
    public static void main(String[] args) {
        winners = new Group();
        runnerUp = new Group();
               
        winners.addClub(new Club("Manchester City", null, Country.England, GroupStage.A));
        winners.addClub(new Club("Bayern München", null, Country.Germany, GroupStage.E));
        winners.addClub(new Club("Liverpool", null, Country.England, GroupStage.B));
        winners.addClub(new Club("Manchester United", null, Country.England, GroupStage.F));
        winners.addClub(new Club("Ajax", null, Country.Netherland, GroupStage.C));
        winners.addClub(new Club("Real Madrid", null, Country.Spain, GroupStage.D));
        winners.addClub(new Club("Juventus", null, Country.Italy, GroupStage.H));
        winners.addClub(new Club("Lille", null, Country.France, GroupStage.G));
        
        runnerUp.addClub(new Club("PSG", null, Country.France, GroupStage.A));
        runnerUp.addClub(new Club("Inter", null, Country.Italy, GroupStage.D));
        runnerUp.addClub(new Club("Sporting", null, Country.Portugal, GroupStage.C));
        runnerUp.addClub(new Club("Atlético de Madrid", null, Country.Spain, GroupStage.B));
        runnerUp.addClub(new Club("Chelsea", null, Country.England, GroupStage.H));
        runnerUp.addClub(new Club("Villarreal", null, Country.Spain, GroupStage.F));
        runnerUp.addClub(new Club("Benfica", null, Country.Portugal, GroupStage.E));
        runnerUp.addClub(new Club("RB Salzburgo", null, Country.Austria, GroupStage.G));        
       
        // The balls are moved
        winners.shuffle();
        runnerUp.shuffle();
        
        runnerUp.getClubs().forEach(club -> {
            calculateRival(club);
        });      
    }
    
    public static Club calculateRival(Club club){
        System.out.println(club.getName() + " can't face: ");
        
        winners.getClubs().stream()
                .filter(i -> i.getCountry().equals(club.getCountry()) || i.getGroupStage() == club.getGroupStage())
                .map(i -> i.getName())
                .forEach(System.out::println);

        
        Club rival = (Club) winners.getClubs().stream()
                .filter(i -> i.getCountry() != club.getCountry() && i.getGroupStage() != club.getGroupStage())
                .findFirst()
                .get();
        System.out.println(club.getName() + " will face " + rival.getName());
        winners.removeClub(rival);
        System.out.println("-----------------");
        return rival;
    }
    
}
