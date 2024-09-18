#include <iostream>
using namespace std;

int main() {
    double num1, num2;
    char op;
    
    cout << "Enter operator (+, -, *, /): ";
    cin >> op;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;
    
    switch(op) {
        case '+':
            cout << num1 + num2 << endl;
            break;
        case '-':
            cout << num1 - num2 << endl;
            break;
        case '*':
            cout << num1 * num2 << endl;
            break;
        case '/':
            if (num2 != 0) cout << num1 / num2 << endl;
            else cout << "Error: Division by zero" << endl;
            break;
        default:
            cout << "Invalid operator" << endl;
    }

    return 0;
}
