package ru.mirea.task1;

import java.util.Scanner;

public class roman1 {
    static Scanner in = new Scanner(System.in);
    public static int[] arr;

    public static void fillArr(int lenght)
    {
        arr = new int[lenght];
        for(int i = 0; i <  arr.length; i++)
        {
            arr[i]= in.nextInt();
        }
    }

    public static void getArrSumFor(int lenght)
    {
        int sum = 0, max, min;

        for(int i = 0; i <  arr.length; i++)
        {
            sum += arr[i];
        }

        double avg = (double) sum;
        min = max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
            else if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Results for");
        System.out.println("sum = "+ sum);
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
        System.out.println("avg = " + avg/lenght );

    }

    public static void getArrSumWhile(int length)
    {
        int sum = 0, max, min, i;
        min = max = arr[0];
        sum +=arr[0];
        i = 1;

        while (i < length)
        {
            sum +=arr[i];
            if(arr[i] < min)
                min = arr[i];
            else if(arr[i] > max)
                max = arr[i];
            i++;
        }
        System.out.println("Results while");
        System.out.println("sum = "+ sum);
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
    }

    public static void getArrSumDoWhile(int length)
    {
        int sum = 0, max, min, i;

        if(length == 0)
        {
            System.out.println("Results doWhile");
            System.out.println("sum = 0");
            System.out.println("max = 0");
            System.out.println("min = 0");
            return;
        }

        min = max = arr[0];
        sum += arr[0];
        i = 1;

        do
        {
            sum += arr[i];
            if(arr[i] < min)
                min = arr[i];
            else if(arr[i] > max)
                max = arr[i];
            i++;
        }
        while(i < length);
        System.out.println("Results doWhile");
        System.out.println("sum = "+ sum);
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
    }

    public static int getFactorial(int n)
    {
        int result = 1;
        for(int i = n; i > 0; i--)
            result *= i;
        return result;
    }

    public static void tenHarmonicSeries()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%.3f ", 1.0/i);
        }
    }


    public static void main(String[] args)
    {
        System.out.print("Input size of array : ");
        int lenght = in.nextInt();
        System.out.println("Input array:");
        fillArr(lenght);
        getArrSumDoWhile(lenght);
        getArrSumFor(lenght);
        getArrSumWhile(lenght);
        System.out.println(getFactorial(10));
        tenHarmonicSeries();
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("аргумент = " + args[i]);
        }
    }

}