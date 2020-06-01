public class MainClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] result = methodOne(numbers);

        // для првоерки работы методов:
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
        System.out.println(methodTwo(numbers));
    }

    protected static int[] methodOne(int[] array) {
        if(array.length == 0)
            throw new ArrayIndexOutOfBoundsException();

        int count4 = 0;
        int numberLast4 = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 4) {
                count4++;
                numberLast4 = i;
            }
        }

        if(count4 == 0)
            throw new RuntimeException();

        int[] result = new int[array.length - numberLast4 - 1];

        for(int i = 0; i < result.length; i++)
            result[i] = array[i + numberLast4 + 1];

        return result;
    }

    protected static boolean methodTwo(int[] array) {
        int count1 = 0;
        int count4 = 0;
        int countOther = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1)
                count1++;
            else if(array[i] == 4)
                count4++;
            else
                countOther++;
        }

        if(count1 == 0 || count4 == 0 || countOther != 0)
            return false;
        else
            return true;
    }
}
