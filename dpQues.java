public class dpQues{

  public static void main(String args [])
  {
    int n=10;
  /*
    long start=System.currentTimeMillis();
    fibonacciMemorization(n,new int [n+1]);
    long end=System.currentTimeMillis();
    System.out.print(end-start);
  */ 
  /*
  
    long start=System.currentTimeMillis();
    long end=System.currentTimeMillis();
    countBoardPathMemorization(0,n,new int [n+1]);
    System.out.print(end-start);
  */   
  /*
    long start=System.currentTimeMillis();
    long end=System.currentTimeMillis();
    fibonacciTabulated(n);
    System.out.print(end-start);
  */
    
    long start=System.currentTimeMillis();
    long end=System.currentTimeMillis();
    countBoardPathTabulated(n);
    System.out.print(end-start);
   / 
  }
  
  public static int countBoardPathMemorization(int src,int dest,int [] qb)
  {
    if(src == dest)
    {
      return 1;
    }
    
    if(src > dest)
    {
      return 0;
    }
    
    if(qb[src]!=0)
    {
      return qb[src];
    }
    int ansCatch=0
    
    for(int dice=1;dice<=6;dice++)
    {
      inter=src+dice;
      ansCatch+=countBoardPathMemorization(inter,dest,qb);
    }
    qb[src]=ansCatch;
return ansCatch;
  }
  

  public static int fibonaccilMemorization(int n, int [] questionBank)
  {
    
    if(n==0 || n==1)
    {
      return n;
    }
   
    if(questionBank []!= 0)
    {
      return questonBank [n];
    }
    
    int sumCatcher =fibonacciMemorization(n-1)+fibonacciMemorization(n-2);
    questionBank [n]=sumCatcher;
    return sumCatcher;
    
    }
  
  public static int fibonacciTabulated(int n)
  {
    int [] f=new int [n+1];
    f[0]=0;  // fibonacci of 0;
    f[1]=1;  // fibonacci of 1;
    
    for(int x=2;x<=n;x++)
    {
      f[x]=f[x-1]+f[x-2];
    }
    
    return f[n];
  }
  
  public static countBoardPathTabulated(int dest)
  {}
  
  

}
