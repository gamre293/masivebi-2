import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("საწყისი მასივი: ");
//        printArray(numbers);
//
//        while (!isAllZero(numbers)) {
//            System.out.print("შეიყვანე წასაშლელი რიცხვი: ");
//
//            if (!scanner.hasNextInt()) {
//                System.out.println("შეიყვანე მთელი რიცხვი.");
//                scanner.next();
//                continue;
//            }
//
//            int userInput = scanner.nextInt();
//
//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i] == userInput) {
//                    numbers[i] = 0;
//                }
//            }
//
//            System.out.println("განახლებული მასივი: ");
//            printArray(numbers);
//        }
//
//        System.out.println("ყველა ელემენტი არის ნული.");
//        scanner.close();
//    }
//
//    private static boolean isAllZero(int[] arr) {
//        for (int num : arr) {
//            if (num != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        //2
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int maxProfit = getMaxProfit(prices);
//
//        if (maxProfit > 0) {
//            System.out.println("მაქსიმალური მოგება: " + maxProfit);
//        } else {
//            System.out.println("არ შეიძლება მოგება.");
//        }
//    }
//
//    public static int getMaxProfit(int[] prices) {
//        if (prices == null || prices.length < 2) {
//            return 0;
//        }
//
//        int minPrice = prices[0];
//        int maxProfit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            int profit = prices[i] - minPrice;
//
//            maxProfit = Math.max(maxProfit, profit);
//
//            minPrice = Math.min(minPrice, prices[i]);
//        }
//
//        return maxProfit;

        //3
//        int[] array1 = {1, 2, 0, 2, 1};
//        int[] array2 = {1, 2, 3, 4, 5};
//
//        System.out.println(isPalindrome(array1) ? "კი" : "არა");
//        System.out.println(isPalindrome(array2) ? "კი" : "არა");
//    }
//
//    public static boolean isPalindrome(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            if (array[left] != array[right]) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

        //4
//        int[] array = {1, 2, 1, 1, 4, 5, 2, 1, 4, 2};
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("შეიყვანე წასაშლელი რიცხვი: ");
//        int numberToRemove = scanner.nextInt();
//
//        int[] resultArray = removeOccurrences(array, numberToRemove);
//
//        System.out.print("ახალი მასივი " + numberToRemove + ": ");
//        for (int num : resultArray) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static int[] removeOccurrences(int[] array, int numberToRemove) {
//        ArrayList<Integer> resultList = new ArrayList<>();
//
//        for (int num : array) {
//            if (num != numberToRemove) {
//                resultList.add(num);
//            }
//        }
//
//        int[] resultArray = new int[resultList.size()];
//        for (int i = 0; i < resultList.size(); i++) {
//            resultArray[i] = resultList.get(i);
//        }
//
//        return resultArray;
    }
}