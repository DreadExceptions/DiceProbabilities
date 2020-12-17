/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marquis.diceprobabilities;

/**
 *
 * @author marquis
 */
public class iterativeMethod {
    
    public static void main( String args[] ) {
        int[] d = {4, 6, 8}; // the dice to be rolled, in order.
        int[] p = {}; // probability of values rolled
        int[] pOld; // probability of values rolled previous iteration
        int pCnt; //probability by number of possible versions
        int sum; //sum of current counts
        int maxSum = 1; //maximum possible sum of current iteration
        int maxCnt = 1; //maximum count of current iteration
        int maxVal = 0; //maximum possible value of current iteration
        
        for (int i = 0; i < d.length; i++) {
            maxCnt *= d[i];
            if (i > 0) {
                maxVal += d[i] - 1;
                maxSum *= d[i-1];
                pOld = p;
                p = new int [maxVal];
                int k = 0;
                
                while (k <= (p.length/2)) {
                    p[i] += d[i];
                    //p[]
                }
                
            } else {
                maxVal = d[i];
                p = new int [d[i]];
                for (int j = 0; j < p.length; j++) {p[j] = 1;}
                break;
            }
            
            
        }
    }
    
}
