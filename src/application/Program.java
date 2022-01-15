package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
		File file = new File("c:\\DS4\\in.txt"); // INSTANCIAR UM CAMINHO
		Scanner sc = null; //INSTANCIANDO O LEITOR DO ARQUIVO COMO NULO
		try {
			sc = new Scanner(file); //COLOCANDO O LEITOR PARA LER O ARQUIVO
			while (sc.hasNextLine()) { //EM QUANTO TIVER ALGO NA PROXIMA LINHA EXIBIR NA TELA
			System.out.println(sc.nextLine());
			}
			
		}
		catch (IOException e ){ //TRATANDO UM ERRO Q PODE SER GERADO
			System.out.println("Error: " + e.getMessage());
		}
		finally {// SEMPRE USAR O FECHAMENTO DO RECURSO NO FINALLY
			if (sc != null)//PODE SER Q DE UM ERRO NA HORA DE INSTANCIAR O SCANNER,
				//SE DER UM ERRO E CONTINUAR NULL, NAO DA PRA FECHAR O SCANNER
				// SÓ SE FECHA UM SCANNER SE ELE SE INICIAR, NAO SE FOR NULL
			sc.close();
		}
		
	}

}
