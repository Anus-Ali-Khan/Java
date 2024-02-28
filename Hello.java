class Hello
{
    public static void main(String a[])
    {
        int num1 = 7;
        // int num2 = 5;
        // int result = num1 % num2; // ("/" will give you Quotient and "%" will give remainder)

        // num1 = num1 + 2;  
        
        // num1 += 2;
        // num1 += 1;
        // num1--;        // decrement
        // num1++;        // post-increment
        // ++num1;        // pre-increment

        // int result = ++num1 ; // Its answer is 8 becuse it first increment and then fetch the value
        int result = num1++ ; // Its answer is 7 because first its fetch the value and then increment

        System.out.println(result);
    }
}