#include <iostream>
using namespace std;

int main() 
{
    float celsius, fahrenheit;

    scanf("%f", &celsius);
 
    fahrenheit = ((celsius * 9)/5) + 32;
  cout<<fahrenheit<<endl; 
  return 0;
}