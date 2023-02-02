import java.util.Scanner;

public class UPCCheckDigit {

    public static void main(String[] args) {
        long input_num;
        int check_digit;
        Scanner s = new Scanner(System.in);
        System.out.print("Please give the partial UPC number to get the check digit for: ");
        input_num = s.nextLong(); // take input
        check_digit = get_check_digit(input_num);
        System.out.println("The check digit is: "+Integer.toString(check_digit));
    }
    public static int get_check_digit(long num) {
        int odd_sum = 0, even_sum = 0, big_sum;
        boolean odd = true;

        while (num != 0) {
            if (odd) {
                odd_sum += num%10;
                odd = false;
            } else {
                even_sum += num%10;
                odd = true;
            }
            num = (num - num%10)/10; // reduce number
        }

        odd_sum *= 3; // sum of odd number multiplied by 3
        big_sum = odd_sum + even_sum; // add both numbers together
        return 10 - big_sum%10; // return the sum of the numbers % 10
    }

}
