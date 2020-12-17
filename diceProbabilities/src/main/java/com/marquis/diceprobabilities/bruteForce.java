/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marquis.diceprobabilities;

import java.util.ArrayList;

/**
 *
 * @author marquis
 */
public class bruteForce {
    
    public static void main( String args[] ) {
        
        int[] dice = {4, 6, 6}; //the dice to be rolled
        ArrayList<Integer> sums = new ArrayList();
        
        for (int i = 0; i < dice[0]; i++){
            sums.add(i);
        }
        
        int ignore = dice.length - 1;//will not need this part of count array
        ArrayList<Integer> oldSums;
        
        if (dice.length > 1) {//start if
        for (int j = 1; j < dice.length; j++) {//goes through dice
            oldSums = sums;
            int sz = oldSums.size();
            sums = new ArrayList();
            for (int k = 0; k < sz; k++) {//goes through full list
                for (int l = dice[j]; l > 0; l--) {
                    sums.add(oldSums.get(k)+l);
                }
            }
        }
        }//end if
        //int buffer = dice.length - 1;
        int tot = 0;
        int db = 1;
        for (int m = 0; m < dice.length; m++) {
            tot += dice[m];
            db *= dice[m];
        }
        
        int[] counts = new int [tot];
        
        for (int n = 0; n < sums.size(); n++) {
                counts[sums.get(n)]++;
        }
        
        double prob = (1.0)/ db;
        
        double pTot = 0.0;
        
        System.out.println("New Array:");
        
        for (int o = ignore; o < counts.length; o++) {
            int prnt = o + 1;
            double p = counts[o]*prob*100;
            pTot += p;
            String pr = String.format("%.2f", p);
            System.out.println("Roll: " + prnt + " cnt: " + counts[o] + " p: " + pr);
            //System.out.println(counts[o]);
        }
        System.out.println("Total p (should be about 100): " + pTot);
    }
    
}
