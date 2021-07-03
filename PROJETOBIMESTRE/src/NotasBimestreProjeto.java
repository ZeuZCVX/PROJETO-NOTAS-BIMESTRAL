import java.util.Scanner;
public class NotasBimestreProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner (System.in);
		double prova, projeto, exercicios, Media;
		do {
			System.out.print("Digite a nota da Prova: ");
			prova = sn.nextDouble();
		}while(prova < 0 || prova >10);
		do {
		
			System.out.print("Digite a nota do Projeto: ");
			projeto = sn.nextDouble();
		}while(projeto < 0 || projeto >10);
		do {
			System.out.print("Lista de Exercícios: ");
			exercicios = sn.nextDouble();
		}while(exercicios < 0 || exercicios >10);
		
		Media = (prova + projeto + exercicios ) / 3;
		
		if( Media >= 8)
		{
			System.out.println(" Aprovado: " + Media + " Parabens ");
		}else if (Media >= 5 ) {
			System.out.println(+ Media +" Fazer a Avaliacao Final para obter nota: ");
			
	    }else {
	    	System.out.println("Reprovado: "+ Media + ", Boa Sorte na Proxima Avalicao ");
	    	
	    }
			
		
		
		 
		
		
		
		
		

	}

}
