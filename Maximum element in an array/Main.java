#include <bits/stdc++.h>
using namespace std;

int main() 
{
int n,max=INT_MIN;
  cin>>n;for(int i = 0 ; i<n;i++){
  int k;
    cin>>k;
      if(max<k){
      max=k;
      }
  }
  cout<<max<<endl;
    return 0;
}