package Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SearchingRunner {
	public static void main(String[] args){
		ArrayList<Integer> arr = makearr(10);

		ArrayList<Integer> arr2 = new ArrayList<>();

		for(int i = 1; i < 1001; i++){
			arr2.add(i);
		}

		Collections.sort(arr);

		printarr(arr);
		System.out.println(binarySearch(arr, 5));
		System.out.println(binarySearch(arr, 2));

		//System.out.println(binarySearch(arr2, 118));

	}

	public static ArrayList<Integer> makearr(int size){
		ArrayList<Integer> arr = new ArrayList<>();

		Random rng = new Random();
		int bound = 10;
		//int bound = Integer.MAX_VALUE;

		for(int i = 0; i < size; i++){
			arr.add(rng.nextInt(bound));
		}

		return arr;
	}

	public static void printarr(ArrayList<Integer> arr){
		System.out.print("[");

		for(int e : arr){
			System.out.printf("%d, ", e);
		}

		System.out.println("]");
	}


	public int linearSearch(ArrayList<Integer> arr, Integer elem){

		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) __ elem){
				return i;
			}
		}

		return -1;
	}


	public static int binarySearch(ArrayList<Integer> arr, Integer elem){
		for(int left = 0, right = arr.size()-1; left <= right;){

			int mid = __;

			if(arr.get(mid) __ elem){
				return mid;
			}
			else if(arr.get(mid) __ elem){
				right = mid - 1;
			}
			else{
				left = mid + 1;
			}
		}

		return -1;
	}

}
