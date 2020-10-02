#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  map<int,int> v;
  for(int i = 0 ; i < n; i++){
    int k;
    cin>>k;
    if(v[k]){
    v[k]++;
    }
    else{
      v[k]=1;
    }
  }
 map<int, int>::iterator itr; 

    for (itr = v.begin(); itr != v.end(); ++itr) { 
        if(itr->second==1){
        cout<<itr->first<<" ";
        }
    } 
    return 0;
}