/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrays;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] hourglasses = new int[6][6];
        // read in the row
        for(int i = 0; i < 6; i++){
            // read in the column
            for(int j = 0; j < 6; j++){
                int n = scan.nextInt();
                hourglasses[i][j] = n;

            }
        }
        
        // make indices for calculating hourglasses
        int index1 = 0;
        int index2 = 0;
        //print the row
        for(int i = 0; i< 6; i++){
            // print the column
            for(int j = 0; j < 6; j++){
                System.out.print(hourglasses[i][j] + " ");
            }
            System.out.println();
        }
        
        // calculate an hourglass
        int max = hourglasses[index1][index2] + hourglasses[index1][index2+1] 
                    + hourglasses[index1][index2+2] + hourglasses[index1+1][index2+1]
                    + hourglasses[index1+2][index2]+ hourglasses[index1+2][index2+1]
                    + hourglasses[index1+2][index2+2]; 
        int count = 0;
        
        // move down the rows
        for(index1 = 0; index1 < 4; index1++){
            // move along the columns
            for(index2 = 0; index2 < 4; index2++){
                count = hourglasses[index1][index2] + hourglasses[index1][index2+1] 
                        + hourglasses[index1][index2+2] + hourglasses[index1+1][index2+1]
                        + hourglasses[index1+2][index2]+ hourglasses[index1+2][index2+1]
                        + hourglasses[index1+2][index2+2];
                if(count > max){
                    max = count;
                }
            }
        }
        System.out.println(max);
        
    }
    
}
