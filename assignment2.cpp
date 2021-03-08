#include <iostream>
#include <cmath>
#include <cstdlib>
#include <fstream>
/* run this program using the console pauser or add your own getch, system("pause") or input loop
Name: Zakaria Farah


 */
	using namespace std;
	void displayAll (int a[4][7]);
	void displayIdRcd (int a[4][7]);
	void displayTotGrd (int a[4][7]);
	
	
	void DisplayMenu(void){
		cout << "===============================================================================" << endl;
		cout << "                                     MENU             " << endl;
		cout << "===============================================================================" << endl;
		cout << "1. View all students' records including the total." << endl;
		cout << "2. View a student's records by ID,display only the total mark and letter grade." << endl;
		cout << "3. View the whole list of students with only their ID and total." << endl;
		cout << "\nPlease enter your choice: ";
	}

	
	void readTable(int a[4][7]){
		ifstream fin;
		int i,j=0;
		int sum = 0;
		fin.open("Assignment2.txt");
		if (fin.fail()) {
			cout << "Error opening file" << endl;
			system("pause");
			exit(-1); // exit the program
		}	
		i = 0;
		j = 0;	
		for(i=0;i<4;i++){
			for(j=0;j<6;j++){
				fin >> a[i][j];
			}
		}
		i=0;
		j=0;
		sum = 0;
		for(i=0;i<4;i++){
			for(j=1;j<6;j++){
				sum += a[i][j];		
			}
			a[i][6] = sum;
			sum = 0;
		}	
	
			fin.close();
		int n;
		cin >> n;
		while((n<1) || (n>3)){
			cout << "Enter a valid option." << endl;
			cin >> n;
		}
		if(n==1){
			displayAll(a);
		}
		else if(n==2){
		displayIdRcd(a);	
		}
		else if (n==3){
			displayTotGrd(a);
		}		
	}

	void displayAll (int a[4][7]){
		cout << "   Id\t| Quiz\t| Exam\t| Assig\t| Lab\t| Final\t| Total\t| " << endl;
		cout << " ========================================================" << endl;
		int i = 0;
		int j = 0;
		for(i=0;i<4;i++){
			for(j=0;j<7;j++){
				cout << "  " <<  a[i][j] << "\t|";	
			}
			cout << endl;
		}	
	}
	
	void displayIdRcd (int a[4][7]){
		int i=0;
		int j= 0;
		int id;
		bool idfound;
		cout << "Enter Id: ";
		cin >> id;
		while((id!=1232) && (id!=2343) && (id!=2043) && (id!=3423)){
			cout << "Id not found. Please try again." << endl;
			cout << "Renter Id: ";
			cin >> id;
		}
	 	for(i=0;i<4;i++){
	 		if(id==a[i][0]){
	 			cout << "=============================" << endl;
				cout << " ID\t| Total\t| Grade\t " << endl;
				cout << "=============================" << endl;
				cout << a[i][0] << "  \t| " << a[i][6] << "\t|";
				if(a[i][6] > 90){
					cout << "  A";
				}
				else if((a[i][6] < 90) && (a[i][6] > 80)){
					cout << "   B" ;
				}
				else if((a[i][6] < 80) && (a[i][6] > 70)){
					cout << "  C";
				}
				 else if((a[i][6] > 60) && (a[i][6] < 70)){
					cout << "  D";
				}
			 	else if(a[i][6] < 60){
					cout << "  F" ;
				}
			idfound = true;
			break;
			}
				
		 }	 
	}
	
	void displayTotGrd (int a[4][7]){
		int i =0;
		int j = 0;
		cout << "  Id\t| Total\t" << endl;
		cout << "===============" << endl;
		for(i=0;i<4;i++){
			cout << "  " << a[i][0];
			cout << "\t|  ";
			cout << a[i][6];
			cout << endl;
		}
	}
	
	int main() {
		int i,j,sum = 0;
		int a [4][7];
		int id;
		int n;	
		bool idfound;
		DisplayMenu();
		readTable(a);
		return 0;
	}


