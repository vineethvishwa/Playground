#include <iostream>
using namespace std;

int main() 
{
  string s;int c=0; 
  getline(cin,s);
  for(char k : s){
    if(k==' '){
    c++;
    }
  }
  cout<<c+1<<endl;
    return 0;
}