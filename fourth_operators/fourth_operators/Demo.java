package fourth_operators;

public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum=num1 + num2;
        System.out.println("Sum: "+sum);
        int difference = num1 - num2;
        System.out.println("Difference: "+difference);
        System.out.println("product: "+(num1 * num2));
        System.out.println("Division: "+(num1 / num2));
        System.out.println("Modulus: "+(num1 % num2));

        int a=10;
        System.out.println("A: "+a);
        System.out.println("++A: "+ ++a);
        System.out.println("A++: "+ a++);
        System.out.println("A: "+ a);

        System.err.println("++A: "+ --a);
        System.out.println("A++: "+ a--);
        System.out.println("A: "+ a);

        int num=10;
        num+= 5; // 10+ 5
        System.out.println("Number is: "+num);

        num*=5;// 15 * 5
        System.out.println("Number is: "+num);

        int x=10;
        int y=10;

         System.out.println("X is greater than Y: "+(x>y));
        System.out.println("X is equal to Y: "+(x==y));
        System.out.println("X is greater than equal to Y: "+(x>=y));

        // Logical Operators
        int l = 7;
        int m = 5;
        int n = 3;
        int o = 7;

        boolean resultAND = l > m && n>o && o >=l ; // T && F -> F
        System.out.println(resultAND);

        boolean resultOR = l > m || n>o; // T || F -> T
        System.out.println(resultOR);

        boolean resultNOT = l > m; // T 
        System.out.println(!resultNOT); // T -> F

        // Bitwise Operators
        int valuea = 5; // 0000000000000101
        int valueb = 3; // 0000000000000011
        int resultand =  valuea & valueb; // 0000000000000001 --> 1
        System.out.println(resultand);

        int resultaor =  valuea | valueb; //0000000000000111 --> 7
        System.out.println(resultaor);

        int resultxor =  valuea ^ valueb; //0000000000000110 --> 6
        System.out.println(resultxor);

        int result = ~valueb;  // 0000000000000011 --> 1111111111111100
        System.out.println(result);

        // Left Shift
        // int valueb = 3; // 0000000000000011
        System.out.println(valueb<<2); // 0000000000001100 --> 12
        System.out.println(valueb<<1); // 0000000000000110 --> 6
        System.out.println(valueb<<3); // 0000000000011000 --> 24

        // Right Shift
        // int valueb = 3; // 0000000000000011
        System.out.println(valueb>>2); // 0000000000000000 --> 0
        System.out.println(valueb>>1); // 0000000000000001 --> 1
        System.out.println(valueb>>3); // 0000000000000000 --> 0
        System.out.println(8>>2);       //0000000000001000 --> 0000000000000010
    }

}
