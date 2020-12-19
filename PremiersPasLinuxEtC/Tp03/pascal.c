#include<stdio.h>                                                                                                      
         
int main(){
    unsigned char t[30][30];
    int k,n;
    for(n=0;n<30;n++){
        for(k=0;k<=n;k++){
            if (k==0||k==n) t[n][k] = 1;
            else t[n][k] = (t[n-1][k] + t[n-1][k-1])%2;
            putchar(t[n][k] ? '*':' ');
        }  
        putchar('\n');
    }    
}      
