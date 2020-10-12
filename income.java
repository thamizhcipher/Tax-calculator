import java.util.Scanner;
public class Income{

public static void main(String args[]){

  System.out.println("Tax calculator");
  Scanner sc=new Scanner(System.in);
  String name;
  int dob,mob,yob,salary,age,annualsalary;
  System.out.println("Enter your name :");
  name=sc.nextLine();
  System.out.println("Enter your monthly salary:");
  salary=sc.nextInt();
  System.out.println("Enter your date of birth:");
  dob=sc.nextInt();
  System.out.println("Enter your month of birth:");
  mob=sc.nextInt();  
  System.out.println("Enter your year of birth:");
  yob=sc.nextInt();
  
  age=2020-yob;
  annualsalary=salary*12;
   
  System.out.println(name+"\n");
  System.out.println(age+"\n");
 
  if (annualsalary>=500000&&annualsalary<=600000){
    System.out.println("you should pay 20% of your annual salary as tax");   
  }
  
  else if(annualsalary>400000&&annualsalary<=500000){
    System.out.println("you should pay 15% of your annual salary as tax");
  }
  
  else if(annualsalary>=300000&&annualsalary<=400000){
    System.out.println("you should pay 10% of your annual salary as tax");
  }
  
  else if(annualsalary>=200000&&annualsalary<=300000){
    System.out.println("you should pay 5% of your annual salary as tax");
  }

  else{
    System.out.println("As your salary is less than 200000 you do not need to pay tax");
  }


}
}

class Inputclass{ 
     static Scanner sc=new Scanner(System.in)

}
