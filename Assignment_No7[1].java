package Template;


//import java.io.*;
//import java.lang.*;
import java.util.*;
public class Assignment_No7 
{
     static int count=0;
     static void even_odd(int n)
     {
         if(n%2==0)
         {
            System.out.println(n+"is even");
            count++;
         }
        else
        {
            System.out.println(n+"is odd");
        }
     }
     
     public static void palindrome(String str)
     {
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
        {
        System.out.println("String is palindrome");
        count++;
        }
        else
        {
        System.out.println("String is not palindrome");
        } 
    }
public static void prime_number(int num)
{
          int i;
for( i=2;i<=num-1;i++){
           if(num%2==0){
            break;
           }
          }
          if(i==num){
System.out.println(num+"is prime");
           count++;
          }
else{
System.out.println(num+"is not prime");
          }
     }
public static void check(int ch,int x)
{       switch(ch)
       {
           case 1:
            even_odd(x);
               break;
           case 2:
            prime_number(x);
               break;
           default:
System.out.println("Enter the correct option!");
       }
     }
static void number_op()
{
  int n,element,choice;
  Scanner sc=new Scanner(System.in);
  
ArrayList<Integer>nums=new ArrayList<Integer>();
        System.out.println("Enter the numbers of element:");
        n=sc.nextInt();//n=4
        System.out.println("Enter the elements:");
        
for(int i=0;i<n;i++)//n=0,1,2,3
{
        element=sc.nextInt();// 7,9,12,22
        nums.add(element);//nums.add(7) 7,9,12,22
}
        System.out.println("Enter the operation to be performed");
        System.out.println("1.odd or even");
        System.out.println("2.prime number");

      choice=sc.nextInt();
      Iterator itr=nums.iterator();
      count=0;
      while(itr.hasNext())
      {
       check(choice,(int)itr.next());
      }
      if(choice==1)
      {
        System.out.println("The number of Even number is "+count);
        System.out.println("The number of Odd number is "+(nums.size()-count));
      }
      else
      {
        System.out.println("The number of prime number is "+count);
        System.out.println("The number of non-prime number is "+(nums.size()-count));
      }
    }

    static void string_op(){
      int n;
      String word;
      Scanner sc=new Scanner(System.in);
ArrayList<String>words=new ArrayList<String>();
System.out.println("Enetrthre numbers of element:");
      n=sc.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
       word=sc.next();
words.add(word);
      }
      count=0;
for(String w:words){
        palindrome(w);
      }

System.out.println("The number of PALINDROMES is:"+ count);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Choose the type of List needed
System.out.println("Choose Type:");
System.out.println("1. String");
System.out.println("2. Integer");
        int ch = sc.nextInt();

if(ch == 2)
number_op(); //Calls Intergerarraylist
        else
string_op(); //Calls String arraylist
    }
   }
