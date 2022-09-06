import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

public class Caveman {

  private String name;
  private double health;

  public Caveman() {
    name = "DefaultCaveman";
    health = 100.0;
  }

  public Caveman(String nameArg, double healthArg) {

    name = nameArg;

    if ((healthArg > 100.0) || (healthArg < 0.0)) {
      health = 100.0;
    }
    else {
      health = healthArg;
    }

  }

  public void setName(String nameArg) {
    this.name = nameArg;
  }

  public String getName() {
    return this.name;
  }

  public void setHealth(double healthArg) {

    if (healthArg > 100.0) {
      this.health = 100.0;
    }
    else if (healthArg < 0.0) {
      this.health = 0.0;
    }
    else {
      this.health = healthArg;
    }

  }

  public double getHealth() {
    return this.health;
  }

  public void smack(Caveman toSmack) {

    toSmack.setHealth(toSmack.getHealth() - (this.health / 10.0));

    if (toSmack.getHealth() <= 0.0) {
      toSmack.setHealth(0.0);
      String deathMessage = "Slaughtered by " + this.name;
      toSmack.setName(deathMessage);
    }

  }

}
