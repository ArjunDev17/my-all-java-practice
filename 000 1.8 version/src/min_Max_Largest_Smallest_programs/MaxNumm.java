package min_Max_Largest_Smallest_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MaxNumm {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		ArrayList<Integer> al=new ArrayList<>();
		List<Integer> numbers=Arrays.asList();
		

        // 1. find Largest number in List using max(Integer::compare).get()
        int max1 = numbers.stream().max(Integer::compare).get();
        System.out.println("\nLargest number using "
                + "max(Integer::compare).get() is = "
                + max1);
	}
}
