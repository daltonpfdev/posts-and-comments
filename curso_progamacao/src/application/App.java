package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class App{
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Quantide de posts: ");
		int posts = sc.nextInt();
		System.out.println();
		for (int postx = 0; postx < posts; postx++) {
			
			System.out.println("Post #" + (postx+1) + ": ");
			
			System.out.print("Title: ");
			
			if(postx == 0) {
				sc.nextLine();
			}
		
			String titleOfPost = sc.nextLine();
			
			System.out.print("Likes: ");
			int likesOfPost = sc.nextInt();
			
			System.out.print("Data e Hora: ");
			sc.nextLine();
			Date dateAndhourOfPost = sdf.parse(sc.nextLine());
			
			System.out.print("Conteúdo: ");
			String contentOfPost = sc.nextLine();
			
			Post post = new Post(titleOfPost, likesOfPost, dateAndhourOfPost, contentOfPost);
			
			System.out.print("Quantidade de comentário da postagem: ");
			int quantidadeDeComentariosNaPostagem = sc.nextInt();
			
			sc.nextLine();
			
			for(int quantidade = 0; quantidade < quantidadeDeComentariosNaPostagem; quantidade++) {
				System.out.print("Escreva um comentário: ");
				//String comment = sc.nextLine();
				Comment c = new Comment(sc.nextLine());
				post.addComment(c);
			}
			
			System.out.println();
			System.out.println(post.toString());
			System.out.println();
			
		}
		
		
	}
	
}