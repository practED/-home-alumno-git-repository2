
public class ParesImpares {

	
		static int MAX=100;
		static int A[]=new int[MAX];
		static int B[]=new int[MAX];
		static int C[]=new int[MAX];
		static int x=0,y=0;

		static void llenaArreglo()
		{
			for(int i=0;i<A.length;i++)
			{
				A[i]=(int)(Math.random()*100+1);
				separa(A[i]);
			}	
		}

		static void imprimeArreglo()
		{
			for(int i=0;i<A.length;i++)
			{
				System.out.print("\t Todos ["+i+"] : "+A[i]);
				System.out.println("");
			}
			System.out.print("\n----------------------------------------------\n");
			
			for(int i=0;i<x;i++)
			{
				System.out.print("\t Par ["+i+"] : "+B[i]);
				System.out.println("");
			}
			System.out.print("\n----------------------------------------------\n");

			for(int i=0;i<y;i++)
			{
				System.out.print("\t Impar ["+i+"] : "+C[i]);
				System.out.println("");
			}


		}

		static void separa(int n)
		{
			
				if(n%2==0)
				{
					B[x]=n;
					x++;
					ordenar(n,x);
				}
				else
				{
					C[y]=n;
					y++;
					ordenar(n,y);
				}
			
		}

		static void ordenar(int n,int tam)
		{
			int temp=0;
			if(tam>=2)
			{
				if(n%2==0)
				{
					for(int i=1;i<tam;i++)
					{
						for(int j=0;j<tam-i;j++)
						{
							if(B[j]>B[j+1])
							{
								temp=B[j];
								B[j]=B[j+1];
								B[j+1]=temp;
							}
						}
					}
				}
				else
				{
					for(int i=1;i<tam;i++)
					{
						for(int j=0;j<tam-i;j++)
						{
							if(C[j]>C[j+1])
							{
								temp=C[j];
								C[j]=C[j+1];
								C[j+1]=temp;
							}
						}
					}
				}
			}


		}

		public static void main(String[] args)
		{
			llenaArreglo();
			imprimeArreglo();
		} 
	}


