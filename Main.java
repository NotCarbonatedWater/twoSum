public class Main {
    public static void printIntro(int arr[], int sum) {
        System.out.print("Given Nubers: [");
        for (int index = 0; index < arr.length; index++)
            if (index == 0)
                System.out.print(arr[index]);
            else
                System.out.print(", " + arr[index]);
        System.out.print("], target = " + sum + ".\n");
    }

    public static int[] twoSum(int[] arr, int sum) {
        printIntro(arr, sum); // prints info of array & target
        // finds two element in array that sums to target
        for (int in1 = 0; in1 < arr.length; in1++) {
            for (int in2 = 0; in2 < arr.length; in2++) {
                // checks if target is reached
                if ((arr[in1] + arr[in2] == sum) && arr[in1] != arr[in2]) {
                    // checks if two elements are unique
                    if (arr[in1] != arr[in2]) {
                        System.out.print("The output should be: ");
                        System.out.print("[" + in1 + ", " + in2 + "].\n");
                        System.out.print("Because arr[" + in1 + "] + arr[" + in2 + "]");
                        System.out.println(" = " + arr[in1] + " + " + arr[in2] + " = " + sum);
                        return arr;
                    }
                    // checks if two element are indentical
                    else if (arr[in1] == arr[in2]) {
                        System.out.print("The output should be -1.\nBecause ");
                        System.out.print("num is not allowed to be used twice:\n");
                        System.out.println(arr[in1] + " + " + arr[in2] + " = " + sum);
                        return arr;
                    }
                }
            }
        }
        // failure elemets that sums to target:
        System.out.print("The output should be -1.\n");
        System.out.print("Because no two elements sum to target: " + sum + ".\n");
        return arr;
    }

    public static void main(final String[] args) {
        // initilization //
        int[] arr;
        int sum = 0;

        // TEST 1 //
        arr = new int[] { 2, 12, 8, 7, 0, 1 };
        sum = 9;
        twoSum(arr, sum);

        // TEST 2 //
        arr = new int[] { 1, 13, 18, 20, 20, 30 };
        sum = 40;
        twoSum(arr, sum);

        // TEST 3 //
        arr = new int[] { 25, 1, 7, 0, 90, 83 };
        sum = 10;
        twoSum(arr, sum);
    }
}