#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string s;
   map<char,int> m;
   getline(cin,s); 
  for(int i = 0 ; i<s.length() ;i++){
  if(s[i]>='A' && s[i]<='Z'){
  s[i]=s[i]+32;
  }
  }
  for(int i = 0 ; i<s.length() ;i++){
  if(s[i]!=' '){
   if(m[s[i]]){
    m[s[i]]++;
   }
    else{
      m[s[i]]=1;
    }
  }
  }
  
  map<char,int> :: iterator it;
  int max=INT_MIN;
  for(it = m.begin() ; it!=m.end() ; it++){
  if(it->second > max){
    max=it->second;
  }
  }
  for(it = m.begin() ; it!=m.end() ; it++){
  if(it->second == max){
    char c =it->first;
    c>='a' && c<='z' ? c=toupper(c) : c=c;
   cout<<"Maximum occurring character is '"<<c<<"' = "<<it->second<<" times.";
    return 0;
  }
  }
    return 0;
}