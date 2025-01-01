public class Casting {

    public static void main(String[] args) {
        // implicit type casting
        short input1 = 30;
        int outPut1 = input1 + 7;
        System.out.println(outPut1);
        // Explicit type casting
        String firstInput = "3.4";
        float outPut = Float.parseFloat(firstInput) + 5.3F;
        System.out.println(outPut);
    }
}