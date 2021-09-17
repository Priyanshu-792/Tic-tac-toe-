package practice;
import java.util.*;
public class tic_tac {

	public static void main(String[] args) {
		
	char [][] t = {{' ','|',' ','|',' '},
			           {'-','+','-','+','-'},
			           {' ','|',' ','|',' '},
			           {'-','+','-','+','-'},
			           {' ','|',' ','|',' '}};
	
	
	print_table(t);
	int pr[]=new int[5];
	int cr[]=new int[5];
	int a=0,i,b=0;
	while(true)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter you place from 1-9 ,where you want to put your keys,if you input the keys accept1-9 you will get a wrong results");
	int p;
	p=sc.nextInt();
	pr[a++]=p;
	placements(t,p,"person");
	Random r = new Random();
	int cp= r.nextInt(9)+1;
	for(i=0;i<a;i++)
	{
		if(cp==pr[i]||cp==cr[i])
		{
			cp= r.nextInt(9)+1;
			i=-1;
		}
	}
	cr[b++]=cp;
	
	placements(t,cp,"computer");
	
	 print_table(t);
	String w= winner(t,a,b);
	System.out.println(w);
	 }

	}
	
	
	public static void print_table(char[][] t) {
		
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(t[i][j]);
			}
			System.out.println();
		}
	}
	public static void placements(char[][] t, int p, String turn)
	{
		char symbol=' ';
		if(turn.contentEquals("person"))
			symbol='X';
		else if(turn.contentEquals("computer"))
			symbol='O';
			
		 if(p==1)
			t[0][0]=symbol;
		 else if(p==2)
				t[0][2]=symbol;
		 else if(p==3)
				t[0][4]=symbol;
		 else if(p==4)
				t[2][0]=symbol;
		 else if(p==5)
				t[2][2]=symbol;
		 else if(p==6)
				t[2][4]=symbol;
		 else if(p==7)
				t[4][0]=symbol;
		 else if(p==8)
				t[4][2]=symbol;
		 else if(p==9)
				t[4][4]=symbol;
	}
	public static String winner(char[][] t, int a, int b)
	{

if((t[0][0]==t[0][2])&&(t[0][2]==t[0][4]&&(t[0][0]=='X')) || ((t[2][0]==t[2][2])&&(t[2][2]==t[2][4])&&(t[2][2]=='X')) || ((t[4][0]==t[4][2])&&(t[4][2]==t[4][4])&&(t[4][2]=='X')) || ((t[0][0]==t[2][2])&&(t[2][2]==t[4][4])&&(t[2][2]=='X')) || ((t[0][4]==t[2][2])&&(t[2][2]==t[4][0])&&(t[0][4]=='X')) || ((t[0][0]==t[2][0])&&(t[2][0]==t[4][0])&&(t[0][0]=='X')) || ((t[0][2]==t[2][2])&&(t[2][2]==t[4][2])&&(t[0][2]=='X')) || ((t[0][4]==t[2][4])&&(t[2][4]==t[4][4])&&(t[2][4]=='X')) )
		{
	return "person wins";
	
		}
 else if((t[0][0]==t[0][2])&&(t[0][2]==t[0][4]&&(t[0][0]=='O')) || ((t[2][0]==t[2][2])&&(t[2][2]==t[2][4])&&(t[2][2]=='O')) || ((t[4][0]==t[4][2])&&(t[4][2]==t[4][4])&&(t[4][2]=='O')) || ((t[0][0]==t[2][2])&&(t[2][2]==t[4][4])&&(t[2][2]=='O')) || ((t[0][4]==t[2][2])&&(t[2][2]==t[4][0])&&(t[0][4]=='O')) || ((t[0][0]==t[2][0])&&(t[2][0]==t[4][0])&&(t[0][0]=='O')) || ((t[0][2]==t[2][2])&&(t[2][2]==t[4][2])&&(t[0][2]=='O')) || ((t[0][4]==t[2][4])&&(t[2][4]==t[4][4])&&(t[2][4]=='O')) )
 {
return "sry you loose";

 }
 else if((a+b)==10)
     return "tie";
return "";
	 

	}

}
