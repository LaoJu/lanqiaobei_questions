package java_7;

/*
����Ʊ

�硾ͼ1.jpg��, ��12������һ���12��Ф����Ʊ��
������Ҫ���м���5������Ҫ����������ŵġ�
����������һ���ǲ���������
���磬��ͼ2.jpg������ͼ3.jpg���У��ۺ�ɫ��ʾ���־��Ǻϸ�ļ�ȡ��

������㣬һ���ж����ֲ�ͬ�ļ�ȡ������

����д��ʾ������Ŀ��������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/

//1.���12ѡ5
//2.��ͨ�Լ��
public class b_7 {
	
	static int a[] = {0,0,0,0,0,0,0,1,1,1,1,1};
	static int ans =0;
	
	public static void main(String args[]){
		int path[] = new int[12];
		f(0,path);
		System.out.println(ans);
	}
	
	
	//ץȡ������ȫ����
	static boolean vis[] = new boolean[12];
	static void f(int k,int path[]){
		if(k==12){
			if(check(path)){
				ans++;
			}
		}
		
		
		for (int i = 0; i < 12; ++i) {
			//��һ�� �����ظ�Ԫ��
		      if (i > 0 && a[i] == a[i - 1] && !vis[i - 1]) continue;//����׼��ѡȡ��Ԫ�غ���һ��Ԫ����ͬ��������һ��Ԫ�ػ�û��ʹ��

		      if (!vis[i]) {//û�б��ù���Ԫ�ؿ���ץ�뵽path
		        vis[i] = true;//���Ϊ�ѷ���
		        path[k] = a[i];//��a[i]���뵽path[k]��
		        f(k + 1, path);//�ݹ�
		        vis[i] = false;//����
		      }
		}
	}
	
	static boolean check(int path[]){
		int g[][] = new int[3][4];
		
		//��ĳ��������������1��Ǳ�ѡ�еĵط�
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				if(path[i*4+j]==1)g[i][j]=1;
				else g[i][j]=0;
			}
		}
		
		//��ͨ�Լ��
		int cnt = 0;//��ͨ����Ŀ
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				if(g[i][j]==1){
					dfs(g,i,j);
					cnt++;
				}
			}
		}
		return cnt==1;
	}
	
	static void dfs(int g[][],int i,int j){
		g[i][j]=0;
		if(i-1>=0&&g[i-1][j]==1)dfs(g,i-1,j);//��һ��
		if(i+1<=2&&g[i+1][j]==1)dfs(g,i+1,j);//��һ��
		if(j-1>=0&&g[i][j-1]==1)dfs(g,i,j-1);//��һ��
		if(j+1<=3&&g[i][j+1]==1)dfs(g,i,j+1);//��һ��
	}
	
}
