#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n,f,t=0;
    cin>>n;
    vector<int> v(n);
    for(int i = 0 ; i < n ; i++){
    cin>>v[i];
    }
  cin>>f;
    for(int i = 0 ; i < n-1 ; i++){
    for(int j = i+1 ; j < n ; j++){
    if(v[i]+v[j]== f){
    cout<<"Perfect couple: "<<v[i]<<" "<<v[j]<<endl;
      t=1;
      return 0;
    }
    }
    }
  if(t==0){
  cout<<"No perfect couple found!";
  }
    return 0;
}