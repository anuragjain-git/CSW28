import java.util.*;
public class sudoko_userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size (n): ");
		int n = sc.nextInt();
		int num=n;
		int size = n * n;
		int c = 0;
		int g =0;
		int arr[][]=new int[n][n];
		int a1=0,a2=1,a3=n-2,a4=n-2;
		int e=n-1;
		int o=1;
		System.out.print("Enter "+size+" inputs: ");
		int i=0;
		while(c!=size) {
			
				while(a1<num) {
					arr[i][a1]=sc.nextInt();
					a1++;
					c++;
//					if(c==size) {
//						break;
//					}
				}
				
				while(a2<num) {
					arr[a2][num-1]=sc.nextInt();
					a2++;
					c++;
//					if(c==size) {
//						break;
//					}
					
				}

				while(a3>=0) {
					arr[num-1][a3]=sc.nextInt();
					a3--;
					c++;
//					if(c==size) {
//						break;
//					}
				}

				while(a4>=1) {
					arr[a4][i]=sc.nextInt();
					a4--;
					c++;
//					if(c==size) {
//						break;
//					}
				}

			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
				
			a1=0;
			i++;a1=o;o++;
			a2=a1+1;e=i+1;
			a3=num-i;
			a4=a3;
			num=num-1;
		}
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
	

}
