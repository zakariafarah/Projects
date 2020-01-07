#include <iostream>
#include <iomanip>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	double balance, withdraw, deposit;
	balance = 0;
	int input;
	
	cout<< "Option 1: Display bank account balance \n"
		<< "Option 2: Deposit money into account \n"
		<< "Option 3: Withdraw money froom account \n"
		<< "Option 4: Type -1 to exit program \n"
		<< "Enter option: ";
	cin >> input;
	 
	
	while (input!=-1){
		switch (input){
			case 1: cout << "Current balance in your account is: " << balance << endl;
			break;
			case 2: cout << "Enter the amount you want to deposit: ";
			cin >> deposit;
			balance = balance + deposit;
			cout << "You have deposited " << deposit << endl;
			break;
			case 3: cout << "Enter the amount you want to withdraw:";
			cin>> withdraw;
			cout << "You have withdrawn:" << withdraw << endl;
			balance = balance - withdraw;
			break;
			case 4: cout << "you have entered a wrong option" << endl;
		}
		cout << "Enter option\n";
		cin >> input;
	}

	return 0;
}
