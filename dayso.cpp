#include<stdlib.h>
#include<iostream>
using namespace std;

int main()
{
	int i=1;
	while(i<100000000)
	{
		int r=rand();
		cout <<r<<r<<r<<r<<r<<r;
		system("color 2");
		i++;
	}
}
