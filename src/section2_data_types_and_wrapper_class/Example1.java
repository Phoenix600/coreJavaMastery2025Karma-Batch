package section2_data_types_and_wrapper_class;

public class Example1
{
    public static void main(String[] args)
    {
        // Data
        // Integral
        byte bNum1; // Variable Declaration
        byte bNum2 = -128; // Variable Declaration And Initialization
        System.out.println(bNum2);
//        System.out.println(bNum1);
        // We can not access uninitialized variables

        short sNum1 = 32000;
        short sNum2;
        System.out.println(sNum1);
//        System.out.println(sNum2);

        int lnNum1 = 320000;
        int lnNum2;

        System.out.println(lnNum1);

        long llNum1 = 1200000000000L;
        long llNum2;

        System.out.println(llNum1);

        // Decimal
        float fNum1 = 12.001234343434f;
        float fNum2;
        System.out.println(fNum1);

        double dNum1 = 12.12345678901112131415;
        double dNum2;
        System.out.println(dNum1);

        // Character
        char cData = '1';
        cData  = '\u1250';
        System.out.println(cData);

        // Boolean
        boolean isPresent = true;
        System.out.println(isPresent);
    }
}
