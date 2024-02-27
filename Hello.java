// Tpe Conversion and Casting

class Hello
{
    public static void main(String args[])
    {
       byte b = 127;
       int c = 12;

      // b = c ; (Since "byte" is smaller than int so we cant convert directly it into "int")

      //Correct Method
      b = (byte)c; // This method of conversion is called casting

      //Conversion
       c = b; // it is called conversion as "int" can store large numbers than "bytes" 

    //    what if range of bytes exceeds from 127 ?? since btes has 256 values ranging from -128 to 127 it     will divide the given value with 256 and prints the remainder
        int a = 257;
        byte k = (byte) a;
        System.out.println(k);
        
    // if we try to convert float value into integer it will remove all the value after point as below
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

    // Type Promotion (since result of "bytes" is exceeding from its range of 127 so we promote its type to "int")
    byte x = 10;
    byte y = 30;
  
    int result = x * y;

    System.out.println(result);
       


    }
}

