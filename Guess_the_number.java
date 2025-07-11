package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number ;
    public int inputNumber;
    public int noFGuesses =0;

//    public int getNoFGuesses() {
//        return noFGuesses;
//    }
//
//    public void setNoFGuesses(int noFGuesses) {
//        this.noFGuesses = noFGuesses;
//    }
    game(){
        Random rand = new Random();
        this.number= rand.nextInt(100);
    }

    void inputNumber(){
        System.out.println("make the guess :");
        Scanner sc = new Scanner(System.in);
        inputNumber= sc.nextInt();
    }

    boolean isCorrectNumber(){
        noFGuesses++;
        if(inputNumber==number){
            System.out.format("You guessed it correct, the number was %d, and you guessed it in %d attempts ",number,noFGuesses);
            return true;
        } else if (inputNumber>number) {
            System.out.println("that's high....");
        } else if (inputNumber<number) {
            System.out.println("that's low...");
        }
        return false;
    }
}




public class Guess_the_number {
    public static void main(String[] args) {
      game g= new game();
      boolean b = false;
      while(!b) {
          g.inputNumber();
          b = g.isCorrectNumber();

      }
    }
}