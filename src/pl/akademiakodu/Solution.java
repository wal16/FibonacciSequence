package pl.akademiakodu;

public class Solution {
    public static Boolean IsFibonacci(int input) {
        int first_number = 0;
        int second_number = 1;
        int third_number = 1;
        while (second_number < input) {
            third_number = first_number + second_number;
            first_number = second_number;
            second_number = third_number;
        }
        return input == third_number;
    }
}
