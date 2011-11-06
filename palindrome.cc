#include"stdio.h"
#include"stdlib.h"
#include<iostream>

using namespace std;

int palindrome_num(int num)
{
  int new_num=0;
  int temp=num;
  while ( temp )
  {
    new_num=new_num*10+temp%10;
    temp/=10;
  }
  return new_num == num;
}

int main() 
{
  cout<<palindrome_num(12321)<<endl;
  cout<<palindrome_num(22321)<<endl;
  cout<<palindrome_num(123454321)<<endl;
  return 0;
}
