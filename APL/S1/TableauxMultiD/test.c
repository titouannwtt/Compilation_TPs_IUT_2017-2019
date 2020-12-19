#include <stdio.h>
#include <stdlib.h>

int bigjump(void) {
	printf("\n");
	printf("\n");
	printf("=====================");
	printf("\n");	
}

int main(void) {


	int t1[2][5];
	int t2[3][5];
	int t3[25][25];
	int count;
	int saut;
	int number;
	
	number=0;
	while (number!=3) {
		count=0;
		saut=0;
		bigjump();
		if ( number==0 ) {
			printf("\n   ");
			while (saut!=2){
				t1[saut][count]=count+1;
				printf("%2d ", t1[saut][count]);
				if ( (count==4) )
				{
					count=-1;
					saut++;
					printf("\n   ");
				}
				count++;
			}
		}	
		
		else if (number==1) {
			printf("\n   ");
			while (count!=15){
				t2[saut][count]=count+1;
				printf("%2d ", t2[saut][count]);
				if ( (count==4) || (count==9) )
				{
					saut++;
					printf("\n   ");
				}
				count++;
			}
		}
		else if (number==2) {
			printf("\n   ");
			while (count!=24) {
				printf("\ncount=%d, saut=%d\n", count, saut);
				if ( (count==5) || (count==10) || (count==15) || (count==20) ) {
					t3[saut][count]=1;
				}
				else if ( (count==11) || (count==16) || (count==21) ) {
					t3[saut][count]=2;
				}
				else if ( (count==17) || (count==22) ) {
					t3[saut][count]=3;
				}
				else if ( (count==23) ) {
					t3[saut][count]=4;
				}
				else if ( (count>=24) ) {
					t3[4][4]=0;
				}		
				else {
					t3[saut][count]=0; 
				}
				printf("%2d ", t3[saut][count]);
				if ( (count==4 ) || (count==9) || (count==14) || (count==19) || (count==24) )
				{
					saut++;
					printf("\n   ");
				}
				count++;
			}
		}
		else {
			printf("\nCou**** dans le paté");
		}
		number++;
	}
	printf("test");
	return EXIT_SUCCESS;
}
