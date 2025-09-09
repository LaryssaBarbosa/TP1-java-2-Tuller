// ex1 Laryssa Barbosa Soares - CB3031667
/*
Exercício 01
Uma classe chamada Author é desenhada para servir de modelo para autores de livros,
veja abaixo:

- 3 atributos privados name (String), email (String), and gender (char contendo 'm' or 'f');
- Um construtor para inicializar os atributos com base nos 3 parâmetros.
- Não existe um construtor default para Author [Author()].
- Criar métodos públicos: getName(), getEmail(), setEmail(), and getGender().
- Não existe setter para name e gender, estes atributos não podem ser alterados.
- Um método chamado toString() que retorna "Author[name=?,email=?,gender=?]",
exemplo "Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]".
- Escreva a classe Author e desenvolva uma de teste, com os seguintes itens:

- Testar construtor.
- Verificar o método toString().
- Testar o Setter
- Testar os Getters
*/
public class AuthorTese{
    public static void main (String[] args) {
        Author author1 = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        
                System.out.println(author1.toString());
                 

        
        System.out.println("Nome: " + author1.getName());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Genero: " + author1.getGender());


        author1.setEmail("novoemail@gmail.com");
        System.out.println("Email atualizado: " + author1.getEmail());

    
        System.out.println(author1);
    }
}


 class Author{
    private String name;
    private String email;
     private char gender; //m ou f

//contrutor
public Author(String name, String email, char gender)
{
    this.name = name;
    this.email = email;
    this.gender = gender;
    
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
public char getGender(){
    return gender;
}
 public void setEmail(String email ){
    this.email = email ;
}
@Override
public String toString(){
    return "Author [Nome: "+ name + ", Email : " + email + ", Gender: " + gender + "]";
}
}


