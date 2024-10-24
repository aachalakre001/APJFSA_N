package CoreJava;

public class NarrowingCasting {

    public static void main(String[] args) {
        // Double to Float
        double doubleValue = 9.78;
        float floatValue = (float) doubleValue; // Explicit narrowing
        System.out.println("Double to Float:");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed float value: " + floatValue);
        
        // Float to Int
        floatValue = 10.5f;
        int intValueFromFloat = (int) floatValue; // Explicit narrowing
        System.out.println("\nFloat to Int:");
        System.out.println("Original float value: " + floatValue);
        System.out.println("Narrowed int value: " + intValueFromFloat);
        
        // Int to Short
        int intValue = 32768; // Out of short range
        short shortValueFromInt = (short) intValue; // Explicit narrowing
        System.out.println("\nInt to Short:");
        System.out.println("Original int value: " + intValue);
        System.out.println("Narrowed short value: " + shortValueFromInt); 
        
        // Short to Byte
        short shortValue = 130; // Out of byte range
        byte byteValueFromShort = (byte) shortValue; // Explicit narrowing
        System.out.println("\nShort to Byte:");
        System.out.println("Original short value: " + shortValue);
        System.out.println("Narrowed byte value: " + byteValueFromShort); 
        
        // Long to Int
        long longValue = 100000L;
        int intValueFromLong = (int) longValue; // Explicit narrowing
        System.out.println("\nLong to Int:");
        System.out.println("Original long value: " + longValue);
        System.out.println("Narrowed int value: " + intValueFromLong);
        
        // Char to Int
        char charValue = 'A'; // ASCII value 65
        int intValueFromChar = (int) charValue; // Explicit narrowing
        System.out.println("\nChar to Int:");
        System.out.println("Original char value: " + charValue);
        System.out.println("Narrowed int value (ASCII): " + intValueFromChar);
    }
}
