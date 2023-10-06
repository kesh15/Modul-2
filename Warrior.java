public class Warrior extends Karakter implements Attack {

  super(nama,level,energi);
  
  public void attack(){
    System.out.println("Warrior melakukan serangan pedang!");
  }
  
  public void PhysicalSpecialAttack(nilaienergi){
    System.out.println("Warrior melakukan serangan dengan fisik khusus dengan energi (nilaienergi)!")
  }
  
}