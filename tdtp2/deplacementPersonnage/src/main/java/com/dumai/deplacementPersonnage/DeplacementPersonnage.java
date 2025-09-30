package com.dumai.deplacementPersonnage;

public class DeplacementPersonnage {
    private String[] directions = {"NORD","EST","SUD","OUEST"};
    public DeplacementPersonnage() {}
    public String tourner(int fois){
        if(fois < 4){
            return directions[fois];
        }
        else{
            return directions[fois%4];
        }
    }
}
