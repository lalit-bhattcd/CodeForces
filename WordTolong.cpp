#include<iostream>
#include<string>
using namespace std;
int main(){
    int n;
    cin >> n;
while(n--){
    string word;
    cin >> word;
        if(word.length() > 10){
            int len = word.length();
            cout << word[0] << len - 2 << word[len - 1] << endl;
        }
        else{
            cout << word << endl;
        }
    }
    return 0;
}