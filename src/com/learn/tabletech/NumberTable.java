package com.learn.tabletech;

public class NumberTable {

    public static void main(String args[]){
        String spell = spellNumber(6);
        System.out.println(spell);
    }

    public static String spellNumber(int number){
        String resultSpell = "Negative";
        String spell[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nice", "Ten"};
        if(number >= 0){
            if(number >= 0 && number <= 10){
                resultSpell = spell[number];
            }else if(number > 10){
                resultSpell= "Greater the ten";

            }else {
                resultSpell= "Number";
            }
        }
        return  resultSpell;
    }

}
