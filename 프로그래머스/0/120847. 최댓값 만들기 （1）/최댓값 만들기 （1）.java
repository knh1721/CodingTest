import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num1 = numbers[numbers.length - 1];
        int num2 = numbers[numbers.length - 2];
        return num1*num2;
    }
}