/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author User
 */
public class pengurangan {
    public static void main(String[] args) {
        int [][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int [][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        if (A.length == B.length && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++) {
                    C[i][j]= A[i][j] - B[i][j];
                }
            }
            for(int[]c: C) {
                for(int q: c) {
                    System.out.print(q+"\t");
                }
                System.out.println();
            }
        }
    }
}
