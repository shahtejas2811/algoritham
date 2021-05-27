package com.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * For example, the square matrix  is shown below:
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 1 + 5 + 9 = 15 . 
 * The right to left diagonal = 3 + 5 + 9 = 17 . 
 * Their absolute difference is 15 - 17 = 2 
 * 
 *
 */
public class DiagonalSummation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
      int leftToRight = 0;
      int rightToLeft = 0;
      
      List<Integer> innerList;
      
      for (int i=0; i < arr.size() ;i++){
    	
    	  innerList =	arr.get(i);
    	  int innerListSize = (innerList.size() -1 ) - i;
    	  
    	  for (int j=0; j < innerList.size() ;j++){
    		  // Left to Right summation 
    		  if (i == j){
    			  
    			  leftToRight = leftToRight +  innerList.get(j) ;
    		  }
    		 // Right to Left  summation 
    		  if (j ==  innerListSize ){
    			  rightToLeft = rightToLeft +  innerList.get(j) ;
    		  }
    	  }
      }
     // System.err.println(s1);
      //System.err.println(s2);
      return Math.abs(leftToRight-rightToLeft);

    }

}
