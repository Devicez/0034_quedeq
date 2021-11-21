package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        boolean no_solution = true;

        for(int i=1;i<=100;i++)
        {
            a = i;
            if(A%a==0)
            {
                c = A/a;

                for (int j=-100;j<=100;j++)
                {
                    b = j;
                    if(b != 0)
                    {
                        if(C%b == 0)
                        {
                            d = C/b;
                        }
                    }

                    if((a*d) + (b*c) == B)
                    {
                        no_solution = false;
                        break;
                    }
                }
            }
            if (no_solution == false)
            {
                break;
            }
        }

        if(no_solution)
        {
            System.out.println("No Solution");
        }
        else
        {
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}
