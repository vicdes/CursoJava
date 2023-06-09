package course.application;

import Entities.BankAccount;
import Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //            EXC RECTANGLE:
//
//        Scanner sc = new Scanner(System.in);
//
//        Rectangle rectangle = new Rectangle();
//        System.out.print("Enter the rectangle width: ");
//        rectangle.width = sc.nextDouble();
//        System.out.print("Enter the rectangle height: ");
//        rectangle.height = sc.nextDouble();
//
//        System.out.println("\n" + rectangle);
//
//        sc.close();
//

//            EXC EMPLOYEE:
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        Employee employee = new Employee();
//        System.out.print("Name: ");
//        employee.name = sc.nextLine();
//        System.out.print("Gross salary: ");
//        employee.grossSalary = sc.nextDouble();
//        System.out.print("Tax: ");
//        employee.tax = sc.nextDouble();
//
//        System.out.println("Employee: " + employee);
//
//        System.out.print("Which percentage to increase salary? ");
//        double percentage = sc.nextDouble();
//        employee.increaseSalary(percentage);
//        System.out.println("\nUpdated data: " + employee);
//
//        sc.close();


//        EXC STUDENT

//        Scanner sc = new Scanner(System.in);
//
//        Student student = new Student();
//        System.out.print("Name of the student: ");
//        student.name = sc.nextLine();
//        System.out.print("First grade: ");
//        student.firstGrade = sc.nextDouble();
//        System.out.print("Second grade: ");
//        student.secondGrade = sc.nextDouble();
//        System.out.print("Third grade: ");
//        student.thirdGrade = sc.nextDouble();
//        student.calculateFinalGrade();
//
//        System.out.println("\n" + student);
//
//        sc.close();



//        EXC BANK ACCOUNT

//        Scanner sc = new Scanner(System.in);
//        BankAccount bankAccount;
//        System.out.print("Enter account number: ");
//        int number = sc.nextInt();
//        System.out.print("Enter account holder: ");
//        sc.nextLine();
//        String holder = sc.nextLine();
//        System.out.print("Is there an initial deposit? (y/n) ");
//        char response = sc.next().charAt(0);
//        if (response == 'y') {
//            System.out.print("Enter initial deposit value: ");
//            double initialDeposit = sc.nextDouble();
//            bankAccount = new BankAccount(number, holder, initialDeposit);
//        }
//        else {
//            bankAccount = new BankAccount(number, holder);
//        }
//
//        System.out.println();
//        System.out.println("Account data: ");
//        System.out.println(bankAccount);
//
//        System.out.println();
//        System.out.print("Enter a deposit value: ");
//        double depositValue = sc.nextDouble();
//        bankAccount.deposit(depositValue);
//        System.out.println("Updated account data: ");
//        System.out.println(bankAccount);
//
//        System.out.println();
//        System.out.print("Enter a withdraw value: ");
//        double withdrawValue = sc.nextDouble();
//        bankAccount.withdraw(withdrawValue);
//        System.out.println("Updated account data: ");
//        System.out.println(bankAccount);



//        EXC NEGATIVOS

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Quantos números você vai digitar? ");
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite um número: ");
//            numbers[i] = sc.nextInt();
//        }
//
//        System.out.println("NÚMEROS NEGATIVOS:");
//
//        for (int i=0; i<n; i++) {
//            if (numbers[i] < 0) {
//                System.out.println(numbers[i]);
//            }
//        }

//        sc.close();



//        EXC SOMA VETOR

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Quantos números você vai digitar? ");
//        int n = sc.nextInt();
//        double sum = 0;
//        double[] vetorNumeros = new double[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite um número: ");
//            vetorNumeros[i] = sc.nextDouble();
//            sum += vetorNumeros[i];
//        }
//
//        double media = sum/vetorNumeros.length;
//
//        System.out.print("VALORES = ");
//        for (int i=0; i<n; i++) {
//            System.out.print(vetorNumeros[i]);
//            System.out.print("  ");
//        }
//
//        System.out.println();
//        System.out.println("SOMA = " + sum);
//        System.out.println("MÉDIA = " + media);


//        EXC ALTURAS

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] listaPessoas = new Pessoa[n];
        double somaAlturas = 0;
        int menorDezesseis = 0;
        StringBuilder pessoasMenorDezesseis = new StringBuilder();

        for (int i=0; i<n; i++) {
            int ordem = i+1;
            System.out.println("Dados da " + ordem + "ª pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.println();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            listaPessoas[i] = pessoa;
            somaAlturas += altura;

            if (idade<16) {
                menorDezesseis ++;
                pessoasMenorDezesseis.append(nome).append("\n");
            }
        }

        double alturaMedia = somaAlturas/listaPessoas.length;
        int porcMenoresDezesseis = menorDezesseis/listaPessoas.length*100;
        System.out.println("Altura média: " + alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcMenoresDezesseis + "\n" + pessoasMenorDezesseis);

        sc.close();

    }
}
