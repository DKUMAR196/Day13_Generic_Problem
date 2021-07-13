package com.bridgelabz.program;

public class Refactor02 {
	public static <D extends Comparable<D>> D maximum(D x, D z) {
		D max = z;
		if (z.compareTo(max) > 0) {
				max = x;
		}			
		return max;
	}
	
		public class Refactorsecond {
			
			public static <D extends Comparable<D>> D maximum(D y, D z) {
				D max = y;
				if (y.compareTo(max) > 0) {
					max = z;
				}			
				return max;
			}
			
		public class Refactorthird {
				
			public static <D extends Comparable<D>> D maximum(D x, D z) {
				D max = z;
				if (z.compareTo(max) > 0) {
						max = x;
				}			
				return max;
			}
		
		}
	public static void main(String[] args) {
		System.out.println("Maximum is " + maximum(1,2,3));
		System.out.println("Maximum is " + maximum(1.1,2.2,3.3));
		System.out.println("Maximum is " + maximum("Name","Deepak","Kumar"));		
		}
	private static String maximum(double d, double e, double f) {
		System.out.println("Maximum is " + maximum(1.1,2.2,3.3));
		return null;
	}
	private static String maximum(String string, String string2, String string3) {
		System.out.println("Maximum is " + maximum("Name","Deepak","Kumar"));	
		return null;
		}
	 }	
  }



