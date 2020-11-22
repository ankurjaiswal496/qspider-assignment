#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main()
{
    ll t;
    cin>>t;
    while (t--)
    {   ll n;
        cin>>n;
        if(n==1)
        {
            cout<<"1\n";
        }
        else if(n==3)
        {
            cout<<"2 3 1\n";
        }
        else if(ceil(log2(n))==floor(log2(n)))
        {
            cout<<"-1\n";
        }
        else
        {
            cout<<"2 3 1";
            for(ll i=4;i<=n;)
            {
                if(ceil(log2(i))==floor(log2(i)))
                {
                    cout<<i+1<<" "<<i<<" ";
                    i+=2;
                }
                else
                {
                    cout<<i<<" ";
                    i++;
                }
                
            }
        }
        
        /* code */
    }
    return 0;
}

