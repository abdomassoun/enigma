package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import coding.dodo.enigma;
import sun.java2d.pipe.AlphaColorPipe;

public class enigmav2 {

	
	static char[] chars= {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};//new char [26]; 

	
	public static void main(String[] args) {
		//int [] array = {1,2,4,3,4,1,0,0,2,0,4,2,4,3};
		int n=20,m=26,k=2;
		String text="enigma ";//n2(array);
		int[] ab=n1(text);
		
		
              // for(int j=0;j<array.length;j++) { System.out.print(array[j]); }System.out.println("");
            	int [] g=rutor (ab ,n,m,k);System.out.println(n2(g)); 
               // for(int i=0;i<g.length;i++) {System.out.print(g[i]+"."); }System.out.println("");
                int [] dodo= code(g, n,m,k);
                
                //for( int u=0;u<dodo.length;u++){ System.out.print(dodo[u]+".");
                
               
            System.out.println(n2(dodo));
             
	}

	public static int [] rutor(int [] text,int n,int m,int k) {
	int [] fnc= {4,5,18,21,20,16,23,17,15,1,19,26,25,6,22,3,11,0,9,24,7,12,2,10,13,14,8};// {2,3,1,0,4};
    		for(int i=0;i<text.length;i++) {
    	//	System.out.print("["+n+""+""+m+""+k+"]");
			switch (text[i]) {
			case 0:text[i]=fnc[n%27];break;
			case 1:text[i]=fnc[(n+1)%27];break;
			case 2:text[i]=fnc[(n+2)%27];break;
			case 3:text[i]=fnc[(n+3)%27];break;
			case 4:text[i]=fnc[(n+4)%27];break;
			case 5:text[i]=fnc[(n+5)%27];break;
			case 6:text[i]=fnc[(n+6)%27];break;
			case 7:text[i]=fnc[(n+7)%27];break;
			case 8:text[i]=fnc[(n+8)%27];break;
			case 9:text[i]=fnc[(n+9)%27];break;
			case 10:text[i]=fnc[(n+10)%27];break;
			case 11:text[i]=fnc[(n+11)%27];break;
			case 12:text[i]=fnc[(n+12)%27];break;
			case 13:text[i]=fnc[(n+13)%27];break;
			case 14:text[i]=fnc[(n+14)%27];break;
			case 15:text[i]=fnc[(n+15)%27];break;
			case 16:text[i]=fnc[(n+16)%27];break;
			case 17:text[i]=fnc[(n+17)%27];break;
			case 18:text[i]=fnc[(n+18)%27];break;
			case 19:text[i]=fnc[(n+19)%27];break;
			case 20:text[i]=fnc[(n+20)%27];break;
			case 21:text[i]=fnc[(n+21)%27];break;
			case 22:text[i]=fnc[(n+22)%27];break;
			case 23:text[i]=fnc[(n+23)%27];break;
			case 24:text[i]=fnc[(n+24)%27];break;
			case 25:text[i]=fnc[(n+25)%27];break;
			case 26:text[i]=fnc[(n+26)%27];break;
			
			}
			
	
			
			switch (text[i]) {
			case 0:text[i]=fnc[m%27];break;
			case 1:text[i]=fnc[(m+1)%27];break;
			case 2:text[i]=fnc[(m+2)%27];break;
			case 3:text[i]=fnc[(m+3)%27];break;
			case 4:text[i]=fnc[(m+4)%27];break;
			case 5:text[i]=fnc[(m+5)%27];break;
			case 6:text[i]=fnc[(m+6)%27];break;
			case 7:text[i]=fnc[(m+7)%27];break;
			case 8:text[i]=fnc[(m+8)%27];break;
			case 9:text[i]=fnc[(m+9)%27];break;
			case 10:text[i]=fnc[(m+10)%27];break;
			case 11:text[i]=fnc[(m+11)%27];break;
			case 12:text[i]=fnc[(m+12)%27];break;
			case 13:text[i]=fnc[(m+13)%27];break;
			case 14:text[i]=fnc[(m+14)%27];break;
			case 15:text[i]=fnc[(m+15)%27];break;
			case 16:text[i]=fnc[(m+16)%27];break;
			case 17:text[i]=fnc[(m+17)%27];break;
			case 18:text[i]=fnc[(m+18)%27];break;
			case 19:text[i]=fnc[(m+19)%27];break;
			case 20:text[i]=fnc[(m+20)%27];break;
			case 21:text[i]=fnc[(m+21)%27];break;
			case 22:text[i]=fnc[(m+22)%27];break;
			case 23:text[i]=fnc[(m+23)%27];break;
			case 24:text[i]=fnc[(m+24)%27];break;
			case 25:text[i]=fnc[(m+25)%27];break;
			case 26:text[i]=fnc[(m+26)%27];break;
			}
	 
			switch (text[i]) {
			case 0:text[i]=fnc[k%27];break;
			case 1:text[i]=fnc[(k+1)%27];break;
			case 2:text[i]=fnc[(k+2)%27];break;
			case 3:text[i]=fnc[(k+3)%27];break;
			case 4:text[i]=fnc[(k+4)%27];break;
			case 5:text[i]=fnc[(k+5)%27];break;
			case 6:text[i]=fnc[(k+6)%27];break;
			case 7:text[i]=fnc[(k+7)%27];break;
			case 8:text[i]=fnc[(k+8)%27];break;
			case 9:text[i]=fnc[(k+9)%27];break;
			case 10:text[i]=fnc[(k+10)%27];break;
			case 11:text[i]=fnc[(k+11)%27];break;
			case 12:text[i]=fnc[(k+12)%27];break;
			case 13:text[i]=fnc[(k+13)%27];break;
			case 14:text[i]=fnc[(k+14)%27];break;
			case 15:text[i]=fnc[(k+15)%27];break;
			case 16:text[i]=fnc[(k+16)%27];break;
			case 17:text[i]=fnc[(k+17)%27];break;
			case 18:text[i]=fnc[(k+18)%27];break;
			case 19:text[i]=fnc[(k+19)%27];break;
			case 20:text[i]=fnc[(k+20)%27];break;
			case 21:text[i]=fnc[(k+21)%27];break;
			case 22:text[i]=fnc[(k+22)%27];break;
			case 23:text[i]=fnc[(k+23)%27];break;
			case 24:text[i]=fnc[(k+24)%27];break;
			case 25:text[i]=fnc[(k+25)%27];break;
			case 26:text[i]=fnc[(k+26)%27];break;
			}	
			if(n%27==0) {m++;if(m%27==0) {k++;} }
			n++;
			
		}	
		
		return text;
	}
	
	public static int [] code(int []text,int n,int m,int k) {
		n=n+text.length-1;
		m=n/27+m;k=k+m/27;
		int [] fnc={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		for(int j=text.length-1;j>=0;j--) {
	
			//System.out.print("["+n+""+""+m+""+k+"]");
		/*2,3,1,0,4
	    case 0:text[j]=fnc[1];break;
		case 1:text[j]=fnc[0];break;
		case 2:text[j]=fnc[3];break;
		case 3:text[j]=fnc[2];break;
		case 4:text[j]=fnc[4];break;
		*/
		 	switch (text[j]) {
			case 0:text[j]=fnc[17];break;
			case 1:text[j]=fnc[9];break;
			case 2:text[j]=fnc[22];break;
			case 3:text[j]=fnc[15];break;
			case 4:text[j]=fnc[0];break;
			case 5:text[j]=fnc[1];break;
			case 6:text[j]=fnc[13];break;
			case 7:text[j]=fnc[20];break;
			case 8:text[j]=fnc[26];break;
			case 9:text[j]=fnc[18];break;
			case 10:text[j]=fnc[23];break;
			case 11:text[j]=fnc[16];break;
			case 12:text[j]=fnc[21];break;
			case 13:text[j]=fnc[24];break;
			case 14:text[j]=fnc[25];break;
			case 15:text[j]=fnc[8];break;
			case 16:text[j]=fnc[5];break;
			case 17:text[j]=fnc[7];break;
			case 18:text[j]=fnc[2];break;
			case 19:text[j]=fnc[10];break;
			case 20:text[j]=fnc[4];break;
			case 21:text[j]=fnc[3];break;
			case 22:text[j]=fnc[14];break;
			case 23:text[j]=fnc[6];break;
			case 24:text[j]=fnc[19];break;
			case 25:text[j]=fnc[12];break;
			case 26:text[j]=fnc[11];break;
			}
		
            text[j]=text[j]-(k%27);
			while(text[j]<0) {
				text[j]=text[j]+27;
			}
			
			switch (text[j]) {
			case 0:text[j]=fnc[17];break;
			case 1:text[j]=fnc[9];break;
			case 2:text[j]=fnc[22];break;
			case 3:text[j]=fnc[15];break;
			case 4:text[j]=fnc[0];break;
			case 5:text[j]=fnc[1];break;
			case 6:text[j]=fnc[13];break;
			case 7:text[j]=fnc[20];break;
			case 8:text[j]=fnc[26];break;
			case 9:text[j]=fnc[18];break;
			case 10:text[j]=fnc[23];break;
			case 11:text[j]=fnc[16];break;
			case 12:text[j]=fnc[21];break;
			case 13:text[j]=fnc[24];break;
			case 14:text[j]=fnc[25];break;
			case 15:text[j]=fnc[8];break;
			case 16:text[j]=fnc[5];break;
			case 17:text[j]=fnc[7];break;
			case 18:text[j]=fnc[2];break;
			case 19:text[j]=fnc[10];break;
			case 20:text[j]=fnc[4];break;
			case 21:text[j]=fnc[3];break;
			case 22:text[j]=fnc[14];break;
			case 23:text[j]=fnc[6];break;
			case 24:text[j]=fnc[19];break;
			case 25:text[j]=fnc[12];break;
			case 26:text[j]=fnc[11];break;
			}
			
            text[j]=text[j]-(m%27);
			while(text[j]<0) {
				text[j]=text[j]+27;
			}
			switch (text[j]) {
			case 0:text[j]=fnc[17];break;
			case 1:text[j]=fnc[9];break;
			case 2:text[j]=fnc[22];break;
			case 3:text[j]=fnc[15];break;
			case 4:text[j]=fnc[0];break;
			case 5:text[j]=fnc[1];break;
			case 6:text[j]=fnc[13];break;
			case 7:text[j]=fnc[20];break;
			case 8:text[j]=fnc[26];break;
			case 9:text[j]=fnc[18];break;
			case 10:text[j]=fnc[23];break;
			case 11:text[j]=fnc[16];break;
			case 12:text[j]=fnc[21];break;
			case 13:text[j]=fnc[24];break;
			case 14:text[j]=fnc[25];break;
			case 15:text[j]=fnc[8];break;
			case 16:text[j]=fnc[5];break;
			case 17:text[j]=fnc[7];break;
			case 18:text[j]=fnc[2];break;
			case 19:text[j]=fnc[10];break;
			case 20:text[j]=fnc[4];break;
			case 21:text[j]=fnc[3];break;
			case 22:text[j]=fnc[14];break;
			case 23:text[j]=fnc[6];break;
			case 24:text[j]=fnc[19];break;
			case 25:text[j]=fnc[12];break;
			case 26:text[j]=fnc[11];break;
			}
			
            text[j]=text[j]-(n%27);
			while(text[j]<0) {
				text[j]=text[j]+27;
			}
			
		
		n--;if(n%27==0) {if(m%27==0) {k--;};m--;};//normalmo 28****inportent****
		
		
		}	
		
		return text ;
		
	}

	
	public static int[] n1(String string) {
		int [] array=new int[string.length()];
		String text="";
		//String text="";
		for(int c = 0;c<array.length;c++) {
			//for (int i = 0; i < chars.length; i++) {if (chars[i] == array[c]) {array[c]=i; }}
			int g=0;
			
			for(int i=0;i<chars.length;i++) {
				if(chars[i]==string.charAt(c)) {
					array[c]=i;g=array[c]; text=text+Integer.toString(array[c]);
				}	
			}
			
			/*List<char[]> arrlist=Arrays.asList(chars);
           List list =Arrays.asList(chars);
			array[c]=list.indexOf(chars[string.charAt(c)]);
		System.out.print(array[c]);
		
		*/
		}
		
		//System.out.println("gg"+text+"gg");
		return array;
	}
	public static String n2(int []array) {
		String string="";
		for(int i=0;i<array.length;i++) {
			string=string+chars[array[i]];}
		
	return string;
	}
	
	
	
}
