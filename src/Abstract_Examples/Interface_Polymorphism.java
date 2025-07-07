package Abstract_Examples;
//Interface
interface Playable{
    void play();
    }
//Guitar Class Implementing Playable
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
//Piano class Implementing Playable
class piano implements Playable{
 @Override
 public void play(){
     System.out.println("Playing Piano");
 }
}


public class Interface_Polymorphism {
    public static void main(String[] args) {
        Playable instrument;
        instrument=new Guitar();
        instrument.play();
        instrument=new piano();
        instrument.play();
    }
}
