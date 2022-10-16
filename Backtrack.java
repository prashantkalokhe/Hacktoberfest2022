// Basic Idea:

// All backtracking problems are composed by these three steps: choose, explore, unchoose.
// So for each problem, you need to know:

// choose what? For this problem, we choose each substring.
// how to explore? For this problem, we do the same thing to the remained string.
// unchoose Do the opposite operation of choose.
// Let's take this problem as an example:
// 1.Define helper(): Usually we need a helper funcition in backtracking problem, to accept more parameters.
// 2.Parameters: Usually we need the following parameters

//     1. The object you are working on:  For this problem is String s.
//     2. A start index or an end index which indicate which part you are working on: For this problem, we use substring to indicate the start index.
//     3. A step result, to remember current choose and then do unchoose : For this problem, we use List<String> step.
//     4. A final result, to remember the final result. Usually when we add, we use 'result.add(new ArrayList<>(step))' instead of 'result.add(step)', since step is reference passed. We will modify step later, so we need to copy it and add the copy to the result;
// 3.Base case: The base case defines when to add step into result, and when to return.
// 4.Use for-loop: Usually we need a for loop to iterate though the input String s, so that we can choose all the options.
// 5.Choose: In this problem, if the substring of s is palindrome, we add it into the step, which means we choose this substring.
// 6.Explore: In this problem, we want to do the same thing to the remaining substring. So we recursively call our function.
// 7.Un-Choose: We draw back, remove the chosen substring, in order to try other options.



//Program

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void
	findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index)
	{
	// Base Condition
		if (index == nums.size()) {
			subset.add(output);
			return;
		}
	
		// Not Including Value which is at Index
		findSubsets(subset, nums, new ArrayList<>(output), index + 1);

		// Including Value which is at Index
		output.add(nums.get(index));
		findSubsets(subset, nums, new ArrayList<>(output), index + 1);
	}

	public static void main(String[] args) {
	
	//Main List for storing all subsets
	List<List<Integer>> subset = new ArrayList<>();
	
	// Input ArrayList
	ArrayList<Integer> input = new ArrayList<>();
	input.add(1);
	input.add(2);
	input.add(3);
	
	findSubsets(subset, input, new ArrayList<>(), 0);

	// Comparator is used so that all subset get
	// sorted in ascending order of values
		Collections.sort(subset, (o1, o2) -> {
			int n = Math.min(o1.size(), o2.size());
			for (int i = 0; i < n; i++) {
				if (o1.get(i) == o2.get(i)){
					continue;
				}else{
					return o1.get(i) - o2.get(i);
				}
			}
			return 1;
		});
	
	
	// Printing Subset
	for(int i = 0; i < subset.size(); i++){
		for(int j = 0; j < subset.get(i).size(); j++){
			System.out.print(subset.get(i).get(j) + " ");
		}
		System.out.println();
	}
	
	}
}


// Complexity Analysis:  

// Time Complexity: O(n. 2^n)
// Auxiliary Space: O(n) There can be at max n recursion calls at a particular time, which would consume O(n) stack space. 




