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
