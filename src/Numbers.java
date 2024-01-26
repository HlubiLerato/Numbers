public class Numbers {
    public static void main(String [] args){
    //call the function
        multiNumbers(num);

        System.out.println("The sum the multiple numbers are "+ multiNumbers(num));

    }

    public static void multiNumbers(int number)
    {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum= sum + i;
                System.out.println;
            }
        }
        System.out.println("The sum of the numbers is " + sum);

    }


    public static int hasThree(int num1, int num2) {
        int sum = 0;
        boolean True;
        boolean False;

        if (num1 == 1) {
            return sum;
        }

    }
}

