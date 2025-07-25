#include <stdio.h>
void main() 
{
    int marathi=85, hindi=80, english=75, maths=90, history=80;
    float total, percentage;

    total=marathi+hindi+english+maths+history;
    
    percentage=(total/500)*100;

    printf("total marks is : %f\n", total);
    printf("percentage is : %f\n", percentage);

}