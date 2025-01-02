import java.util.*;
class prime
{
	public static void main(String s1[])
	{
		int no,i,j,flag=0;
		System.out.println("enter any integer number:");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		System.out.println("1");
		for(i=3;i<no;i++)
		{
			for(j=2;j<i;j++){
				if(i%j==0){
					flag=1;
					break;
				}
				else{
			        continue;
		            }    
		}

            if(flag==0)
            {
            	System.out.println(i);
            }
            flag=0;
        }
	}
}