#include <iostream>
using namespace std;
  
int main()
{
    char op;
    float num1, num2;
  
    cout<<"Enter operand(+,-,*,/:)";
    cin >> op;
  
   cout<<"Enter the two numbers:";
    cin >> num1 >> num2;
  
    
    switch (op) {
          
       
        case '+':
        cout<<"Addition of "<<num1 <<" and "<<num2<<"=";
            cout << num1 + num2;
            break;
          
       
        case '-':
        cout<<"Subtraction of "<<num1 <<" and "<<num2<<"=";
            cout << num1 - num2;
            break;
          
       
        case '*':
        cout<<"Multiplication of "<<num1 <<" and "<<num2<<"=";
            cout << num1 * num2;
            break;
          
       
        case '/':
        cout<<"Division of "<<num1 <<" and "<<num2<<"=";
            cout << num1 / num2;
            break;
          
       
        default:
            cout << "Error! operator is not correct";
            break;
    } 
  
    return 0; 
}
