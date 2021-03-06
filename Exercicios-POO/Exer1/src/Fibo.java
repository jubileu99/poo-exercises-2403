import java.util.Arrays;

public class Fibo {
	
	private int[] FiboArray;
	
	public Fibo(int n) {
		FiboArray = PutFiboInArray(n);
	}
	
	private int[] PutFiboInArray(int n) {
		
		int[] FiboArray = new int[n];
		int anterior = 0, atual = 0;
		
		for(int i = 0; i < n ; i++) {
			if(i == 1) {
				atual = 1;
				anterior = 0;
			}else {
				atual = atual + anterior;
				anterior = atual - anterior;
			}
			FiboArray[i] = atual;
		}
			
		return FiboArray;
	}
	
	public int somaAB(int a, int b) {
		int soma = 0;

		for(; a <= b; a++) {
			soma += FiboArray[a];
		}
		return soma;
	}
	
	public String getArrayFibo() {
		return Arrays.toString(FiboArray);
	}
	
}
