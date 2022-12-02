import java.util.*;
public class sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int x[][]= {{4,5,3,8,2,6,1,9,7},{8,9,2,5,7,1,6,3,4},{1,6,7,4,9,3,5,2,8},{7,1,4,9,5,2,8,6,3},{5,8,6,1,3,7,2,4,9},{3,2,9,6,8,4,7,5,1},{9,3,5,2,1,8,4,7,6},{6,7,1,3,4,5,9,8,2},{2,4,8,7,6,9,3,1,5}};
		int x[][]= {{1,2,3,4,5,6,7,8,9},{9,1,2,3,4,5,6,7,8},{8,9,1,2,3,4,5,6,7},{7,8,9,1,2,3,4,5,6},{6,7,8,9,1,2,3,4,5},{5,6,7,8,9,1,2,3,4},{4,5,6,7,8,9,1,2,3},{3,4,5,6,7,8,9,1,2},{2,3,4,5,6,7,8,9,1}};
		boolean c = true;
		boolean res = true;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(x[i][j]+" ");
				if(x[i][j]<0) {
					c=false;
				}
			}
			System.out.println();
		}
		
		if(c==true) {
		for(int i = 0; i<9; i++) {
			int arr [] = new int[10];
			for(int j = 0; j<9; j++) {
					if(arr[x[i][j]]>=1)
						res = false;
					else 
						arr[x[i][j]]++;
				}
			}
		
		for(int i = 0; i<9; i++) {
			int arr [] = new int[10];
			for(int j = 0; j<9; j++) {
					if(arr[x[j][i]]>=1)
						res = false;
					else 
						arr[x[j][i]]++;
			}
		}
		System.out.println(res);
		
		int sum = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=3;i<6;i++) {
			for(int j=0;j<3;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=6;i<9;i++) {
			for(int j=0;j<3;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=3;i<6;i++) {
			for(int j=0;j<3;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=3;i<6;i++) {
			for(int j=3;j<6;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=3;i<6;i++) {
			for(int j=6;j<9;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=6;i<9;i++) {
			for(int j=0;j<3;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
		}
		for(int i=6;i<9;i++) {
			for(int j=3;j<6;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		for(int i=6;i<9;i++) {
			for(int j=6;j<9;j++) {
				sum+=x[i][j];
			}
			if(sum==45) {
				res=true;
			}
			else {
				res=false;
			}
		}
		System.out.println(res);
		
	}
		else {
			System.out.println("not between 1-9");
		}
		}

			
		
}
