class InvalidAgeException1 extends Exception{
InvalidAgeException1(String s){
super(s);
}}
class Voting{
    void validate(int age) throws InvalidAgeException1{
    if(age<18){
        throw new InvalidAgeException1("Too young to vote");
    }else{
        System.out.println("Welcome to vote");
    }
    }
}
public class VotePrac{
public static void main(String[] args) throws InvalidAgeException1 {
    Voting p=new Voting();
    try{
    p.validate(16);
}
    catch(InvalidAgeException1 e){
        System.out.println(e+"\n"+"Handled");
    }
    System.out.println("Rest of the Code");
}

}
