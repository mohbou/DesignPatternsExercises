package main.miscellaneous;


import java.util.concurrent.ThreadLocalRandom;

public class PeakElement {

            public static Integer getPeakElement(int[] array) {

        	        if (array == null || array.length == 0) {
            	            return null;
            	        }

        	        int n = array.length;

        	        int start = 0;
        	        int end = n - 1;

        	        while (start <= end) {
                        int mid = (start + end) / 2;

                        if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
                	                return array[mid];
                	            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                	                end = mid - 1;
                	            } else {
                	                start = mid + 1;
                	            }
            	        }
        	        return null;
            }

        	    public static void main(String[] args) {

                int array [] = new int[25];
        	        for(int i=0;i<25;i++) {
                        array[i] = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE-1);
                        //System.out.println(i+",");
                    }
                    long startTime = System.nanoTime();
        	        Integer peak = getPeakElement(array);
                    long endTime   = System.nanoTime();
                    long totalTime = endTime - startTime;
        	        System.out.println(peak != null ? "Peak Element is "  + peak : "No peak element!" );
                    System.out.println("totalTime "+totalTime);
        	    }
	}