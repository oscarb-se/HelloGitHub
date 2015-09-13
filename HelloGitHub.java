public class HelloGitHub {
  public static void main(String[] args) {
    System.out.println("Hello GitHub!");

    Greeting.sayHelloToGitHub("Adam");


  }



}



class Greeting {

  public static void sayHelloToGitHub(String name) {
    System.out.println("There is a person...");
    System.out.println("...the name of the person is...");
    System.out.println(name);
    System.out.println("...and you know what?");
    System.out.println(name + " just started using GitHub!");
  }

}
