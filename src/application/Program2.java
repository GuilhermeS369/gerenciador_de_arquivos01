package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		String path = "c:\\DS4\\in.txt";//ARMAZENANDO CAMINHO DENTRO DE VARIAVEL
	
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			//DENTRO DESSE TRY, TUDO Q É INSTANCIA É FINALIZADO, É UMA FUNÇÃO JA EMBUTIDA NO TRY
			//INICIANDO A INSTANCIA COM O CAMINHO DA VARIAVEL
			//COLOCANDO NO BUFFER A INSTANCIA FILE READER
			//METODO MAIS RAPIDO SERIA BR = new BufferredReader(new FileReader(path));
			
			String line = br.readLine();//LE UMA LINHA DO ARQUIVO, SE FOR A ULTIMA = NULL
					
			while (line !=null) { //AQUI É PRA FAZER O CICLO E LER TODAS AS LINHAS
				System.out.println(line); //APRESENTA A LINHA EM Q ESTA.
				line = br.readLine();//AQUI SEGUE LENDO ATÉ LINE SER NULL
				}
			}
		catch(IOException e){//TRATANDO A EXCESSÃO
			System.out.println("ERROR: " + e.getMessage());
			}
		//------------------------------------ESCRITA DE ARQUIVOS-----------------------------
		
		String[] lines = new String [] {"Boa noite"};//INICIANDO O VETOR COM APENAS UMA PALAVRA
		String path2 = "c:\\DS4\\out.txt";//CAMINHO DE SAIDA, CASO NAO EXISTA SE CRIA UM NOVO
			
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) { 
			//O TRY QUE INSTANCIA E FINALIZA
			for(String line : lines) {//CADA VETOR VAI FICAR EM UMA LINHA, ENTAO PARA CADA VETOR, CRIA-SE UMA NOVA LINHA
			bw.write(line);//ESCREVA EM NESSA LINHA
			bw.newLine();//QUEBRA DE LINHA APOS ESCREVER A LINHA
				}
			}
		catch(IOException e){//TRATANDO A EXCESSÃO
			System.out.println("ERROR: " + e.getMessage());
			}
		//----------------------------------LISTAGEM DE PASTAS---------------------------------
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a folder path: ");
			String strPath = sc.nextLine();//RECEBE O CAMINHO
			
			File path1 = new File(strPath);// RECEBE O CAMINHO
			File[] folders = path1.listFiles(File::isDirectory); 
			//path1.listFIles É PARA LISTAR TODOS OS ARQUIVOS E SALVAR EM UM VETOR.
			//isDirectory É UMA FUNÇÃO QUE FILTRA SÓ POR PASTA
			for (File folder : folders) {//PERCORRER O VETOR
			System.out.println(folder);//EXIBIR OQ TEM DENTRO DE CADA VETOR.
			}
		//---------------------------------LISTAGEM DE ARQUIVOS-----------------------------
			File[] files = path1.listFiles(File::isFile);// SOMENTE A LISTA DE ARQUIVOS
			System.out.println("FILES: ");//FOR PARA PERCORRER OS ARQUIVOS
			for (File file : files) {
				System.out.println(file);
			}
		//---------------------------------CRIAÇÃO DE PASTA--------------------------------
			boolean sucess = new File(strPath + "\\roscovo").mkdir();
			System.out.println(sucess);
			//MKDIR RESPONSAVEL POR CRIAR A PASTA PARTIR DO CAMINHO Q ESTA DENTRO DO STRPATH
			//ELE CRIOU A BASTA CHAMADA SUBDIR E A VARIAVEL SUCESS RETORNOU TRUE.
			
		//
			
		
		}//FIM DO CODIGO

	}


