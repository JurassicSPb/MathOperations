/**
 * Created by Юрий on 09.06.2016.
 */
public class MathOperations {
    public int max (int a, int b, int c)
    {
        int max = a;
        if (a<b)
        {
            max = b;
        }
        if (a<c)
        {
            max = c;
        }
        return max;
    }
    public int sum (int [] arr)
    {
        int sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        return sum;
    }
    public int avr (int [] arr)
    {
        int sum = 0;
        int avr = 0;
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];

        }
        avr = sum / arr.length;
        return avr;
    }
    public int factorial (int n)
    {
        int result = 1;
        if (n < 0 || n == 0 || n == 1)
        {
            result = 1;
        }
        else
        {
            for (int i = 2; i <= n; i++)
            {
                result = result * i;
            }
        }
        return result;
    }
    public int fibonacci (int n)
    {
        int a = 1;
        int b = 1;
        int sum =0;
        if (n <= 2)
            return 1;
        for (int i = 3; i <= n; i++)
        {
            sum = a+b;
            a=b;
            b = sum;

        }
        return sum;
    }
    public int [] sort(int [] array, boolean isAscending)
    {
        for (int i=0; i<array.length; i++)
        {
            array[i] = (int) (Math.random() * 50);
        }
        for (int j = 0; j < array.length - 1; j++)
        {
            for (int i = 0; i < array.length - 1 - j; i++)
            {
                if (isAscending == true)
                {
                    if (array[i] > array[i + 1])
                    {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }

                }
                if (isAscending == false)
                {
                    if (array[i] < array[i + 1])
                    {
                        int temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }




}
