abstract class Sound {
    public abstract void makeSound();
}

class Bell extends Sound {

    public void makeSound() {
        System.out.println("The bell rings: Ding dong!");
    }
}

class Siren extends Sound {
  
    public void makeSound() {
        System.out.println("The siren sounds: Woo-woo-woo!");
    }
}

class Horn extends Sound {
 
    public void makeSound() {
        System.out.println("The horn honks: Beep beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        Sound bell = new Bell();
        Sound siren = new Siren();
        Sound horn = new Horn();

        bell.makeSound();
        siren.makeSound();
        horn.makeSound();
    }
}

