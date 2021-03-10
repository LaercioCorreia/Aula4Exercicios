
package aula4;


public class Livro {
    public String titulo;
    public String autor;
    private String genero;
    private int ano;
    private double preco;

    
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double verificarPreco()
    {
       
        if (this.preco >= 80){
            preco = preco - (preco * 0.20);
        
        } else {
            preco = preco;
            
        }
        return preco;
            
        }
        @Override
        public String toString(){
               return this.titulo + "\n" + this.autor + "\n" + this.genero;
           }
                    
        }
        
        
        
    
