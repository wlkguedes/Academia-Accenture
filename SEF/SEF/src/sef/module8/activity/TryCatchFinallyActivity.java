package sef.module8.activity;

//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();

	}

	void catchMeIfYouCan() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		/*unchecked exception
		 * no geral eh um erro de programacao e nao deve ser tratado com try e cacth.
		 * o correto eh encontrar o erro de programacao e corrigi-lo.
		 * 
		 *  nesse caso aqui a exeception encontrada foi "ArrayIndexOutOfBoundsException", ou seja,
		 *  uma unchecked excpetion.
		 */
		
		for (int i = 0; i < 10; i++) {//o erro de programacao estava na condicao de parada do laco. i<=10
			System.out.println(arr[i]);
		}

		System.out.println("This should get printed even if there is an exception");

	}

}
