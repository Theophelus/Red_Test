package red_test;
/**
 * There are 4 parts to this test. See the description of each method below.
 *
 * Do not use any libraries (e.g. Apache Commons). You may however use any standard Java classes you like.
 */
public class Red_Test {
    /**
     * This method converts an array of ints {1, 2, 3, 4, 5} into a comma-separated String "1, 2, 3, 4, 5".
     *
     * You will notice that the output is incorrect, since it ends up with an extra comma at the end.
     *
     */
    private static String arrayToString1( int[] numbers )
    {
        String result = "";
        for (int i = 0; i < numbers.length; i++)
        {
            int current = numbers[i];
            String s = String.valueOf(current).concat(", "); //convert int into String
            result += s; //add each value to results
        }
        // call removeComma method and pass results as argument.
        return removeComma(result);
    }
    //Define a method to get the first and remove the last index in the array.
    private static String removeComma(String str){
        int last =  str.length()-2;
        return str.substring(0, last);
    }
    /**
     * This method does the same as the previous method.
     *
     * Fix it using a completely different technique to the previous one.
     */

    private static String arrayToString2( int[] numbers )
    {
        StringBuilder builder = new StringBuilder();

        if (numbers.length > 0){
            //append first element
            builder.append(numbers[0]);
            for (int i = 1; i < numbers.length; i++) //loop through the list
            {
                builder.append(", ").append(numbers[i]); //append comma after every element
            }
        }


        return builder.toString();
    }

    /**
     * Make this method return a new array that is the reverse of the input array.
     *
     * The input array must be unchanged.
     *
     * i.e. input {1, 2, 3, 4, 5} output {5, 4, 3, 2, 1}
     */
    private static int[] reverseArray1( int[] numbers )
    {


        int[] result = new int[ numbers.length ];

        for (int i=0; i < numbers.length; i++){

            int tempValue = numbers[i];

            result[i] = numbers[ numbers.length-1 -i ];

            numbers[ numbers.length -1 -i ] = tempValue;

        }
        return result;


    }

    /**
     * Make this method return a new array that is the reverse of the input array.
     *
     * The input array must be unchanged.
     *
     * i.e. input {1, 2, 3, 4, 5} output {5, 4, 3, 2, 1}
     * @return
     */
    private static int[] reverseArray2(int[] numbers )
    {

//        String temp = "";


        int[] arr = new int[numbers.length];
        for (int i=0; i < numbers.length; i++ ){

            int index = numbers.length - (i + 1);
            System.out.println(numbers[index] + " ---- " + index + " ? " + numbers.length);

            arr[i] = numbers[index];
        }


//        return temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        String arrayToString1 = arrayToString1( numbers );
        System.out.println( "arrayToString1 = " + arrayToString1 );
        if (arrayToString1.equals( "1, 2, 3, 4, 5" ))
            System.out.println( "Correct!" );
        else
            System.out.println( "Incorrect" );
        System.out.println();

        String arrayToString2 = arrayToString2( numbers );
        System.out.println( "arrayToString2 = " + arrayToString2 );
        if (arrayToString2.equals( "1, 2, 3, 4, 5" ))
            System.out.println( "Correct!" );
        else
            System.out.println( "Incorrect" );
        System.out.println();

        String reverseArray1 = arrayToString1( reverseArray1( numbers ) );
        System.out.println( "reverseArray1 = " + reverseArray1 );
        if (reverseArray1.equals( "5, 4, 3, 2, 1" ))
            System.out.println( "Correct!" );
        else
            System.out.println( "Incorrect" );
        System.out.println();


        int[] reverseArray2 = reverseArray2( numbers );
        System.out.println( "reverseArray2 = " + reverseArray2 );
        if (reverseArray2.equals( "5, 4, 3, 2, 1" ))
            System.out.println( "Correct!" );
        else
            System.out.println( "Incorrect" );
        System.out.println();
    }
}

