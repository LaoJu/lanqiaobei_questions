package sixth;

public class b_6 {
	public static void main(String args[]){
		int sum = 0;
		for(int i=1;i<50;i++){
			for(int j=i+2;j<50;j++){
				sum = 1225+i*(i+1)+j*(j+1)-(2*i+1)-(2*j+1);
				if(sum==2015){
					System.out.println("i:"+i+" "+"j:"+j);
				}
			}
		}
	}
}
