#include<iostream>
using namespace std;
 
void segregate0and1(int arr[], int n)
{
    int count = 0; 
  for (int i = 0; i < n; i++) 
  {
        if (arr[i] == 0)
            count++;
    }
 for (int i = 0; i < count; i++)
        arr[i] = 0;
 
  for (int i = count; i < n; i++)
        arr[i] = 1;
}
 
void print(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}
 
int main()
{
    int arr[100],n,i;
    cin>>n;
    for(i=0;i<n;i++)
        cin>>arr[i];
    segregate0and1(arr, n);
    print(arr, n);
     
    return 0;
}