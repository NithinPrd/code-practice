package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  @author nithin.pradeep
 * 
 *  Leetcode Problem Link: https://leetcode.com/problems/set-matrix-zeroes/submissions/
 * 
 *  Solution Link: https://takeuforward.org/data-structure/set-matrix-zero/
 * 
 *  Space complexity of this solution can be optimized.
 * 
 */

class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int length = matrix.length;
        int width = matrix[0].length;
        boolean lArr[] = new boolean[length];
        boolean wArr[] = new boolean[width];
        int i, j;
        for(i=0; i<length; i++) {
            for(j=0; j<width; j++) {
                if(matrix[i][j] == 0) {
                    lArr[i] = true;
                    wArr[j] = true;
                }
            }
        }
        for(i=0; i<length; i++) {
            if(lArr[i]) {
                for(j=0; j<width; j++) {
                    matrix[i][j] = 0;
                }
                continue;
            }
            for(j=0; j<width; j++) {
                if(wArr[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int l, w;
        SetMatrixZero obj = new SetMatrixZero();
        System.out.print("Enter length of matrix: ");
        l = Integer.parseInt(br.readLine());
        System.out.print("Enter the width of the matrix: ");
        w = Integer.parseInt(br.readLine());
        int arr[][] = new int[l][w];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0; i<l; i++) {
            for(int j=0; j<w; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        obj.setZeroes(arr);
        for(int i=0; i<l; i++) {
            for(int j=0; j<w; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}