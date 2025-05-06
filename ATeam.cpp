#include<iostream>
using namespace std;
int main(){
    int n;
    int solveProblem = 0;
    cin >> n;
    for(int i = 0 ; i < n ; i++){
        int patya , vasya , tonya;
            cin >> patya;
            cin >> vasya;
            cin >> tonya;
        if(patya + vasya + tonya >= 2){
            solveProblem++;
        }
    }
      cout << solveProblem;
    
}