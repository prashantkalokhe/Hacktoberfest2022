    //Using Dynamic Programming
    static int fib(int n)
    {
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
