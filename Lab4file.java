public class Main {
    public static void main(string[] args)
    {

        System.out.print("Input how many numbers will be used.");
        int n = new int(System.in);
        while(n <= 0)
        {
            System.out.print("Invalid input, must be greater then 0, input again.");
            n = System.in;
        }

        System.out.print("Input how far we will select clockwise");
        int m = new int(System.in);


        System.out.print("Input how far we will select counterclockwise");
        int o = new int(System.in);


        if(m < 0 || o < 0 || (m + o) <= 0)
        {
            System.err.print("Invalid m and o");
        }




    }
}