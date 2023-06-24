package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "° aula: ");
			System.out.println();
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ct = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Titulo: ");
			String title = sc.nextLine();
			
			if (ct == 'c' || ct == 'C') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração do em segundos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
			list.add(new Video(title, url, seconds));
			}
			else if ( ct == 't' || ct == 'T'){
				System.out.print("Descrição: ");
				String descreption = sc.next();
				System.out.print("Quantidade de questões: ");
				int quest = sc.nextInt();
				sc.nextLine();
			list.add(new Task(title, descreption, quest));
			}
		}
		
		int sum = 0;
		for (Lesson l : list) {
			sum += l.duration();
		}
		
		System.out.println();
		System.out.println("Duração total do curso: " + sum + " segundos");
		sc.close();

	}

}
