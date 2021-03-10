
package aula4;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro lvr = new Livro();
        
        System.out.println ("Título do livro:");
        lvr.titulo = ler.nextLine();
        
        System.out.println ("Nome do autor");
        lvr.autor = ler.nextLine();
        
        System.out.println ("Gênero do livro:");
        lvr.setGenero(ler.nextLine());
        
        System.out.println ("Ano do livro");
        lvr.setAno(ler.nextInt());
        
        System.out.println ("Preço do livro");
        lvr.setPreco(ler.nextDouble());
        
        System.out.println("Visualizando...");
        System.out.println("Titulo do livro:" + lvr.titulo);
        System.out.println("Autor do livro:" + lvr.autor);
        System.out.println("Gênero do livro:" + lvr.getGenero());
        System.out.println("Ano livro:" + lvr.getAno());
        System.out.println("Preco do livro:" + lvr.getPreco());
        System.out.println("Desconto do livro:" + lvr.verificarPreco());
        
       
    }
    
}
