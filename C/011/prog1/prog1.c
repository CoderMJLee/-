#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#define MAX 100
int fun(int lim, int aa[MAX])
{
  
}
void main()
{
  FILE *wf;
  int limit,i,sum;
  int aa[MAX];
  system("CLS");
  printf("����һ������:");
  scanf("%d",&limit);
  sum=fun(limit,aa);        
  for(i=0;i<sum;i++)
     {
      if(i%10==0&&i!=0)    /*ÿ�����10����*/
         printf("\n ");
      printf("%5d ",aa[i]);
    }
/******************************/
  wf=fopen("out.dat","w");
  sum=fun(15,aa);        
  for(i=0;i<sum;i++)
     {
      if(i%10==0&&i!=0)    /*ÿ�����10����*/
         fprintf(wf,"\n");
      fprintf(wf,"%5d ",aa[i]);
    }
  fclose(wf);
/*****************************/
}
