package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  @author nithin.pradeep
 * 
 *  Leetcode Problem Link: https://leetcode.com/problems/pascals-triangle/submissions/
 * 
 *  Solution Link: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/
 * 
 *  Unable to proceed beyond brute force solution.
 * 
 */

 public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> row = null;
        List<Integer> pre = null;
        for(int i=0; i<numRows; i++) {
            row = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            sol.add(row);
            pre = row;
        }
        return sol;
    }

    public static void main(String args[]) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int n;
        PascalsTriangle obj = new PascalsTriangle();
        System.out.print("Enter number of rows required: ");
        n = Integer.parseInt(br.readLine());
        System.out.println(obj.generate(n));
    }
}