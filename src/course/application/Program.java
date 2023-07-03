package course.application;

import Entities.BankAccount;
import Entities.Pessoa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Quantas pessoas serão digitadas? ");
//        int n = sc.nextInt();
//        Pessoa[] listaPessoas = new Pessoa[n];
//        double somaAlturas = 0;
//        int menorDezesseis = 0;
//        StringBuilder pessoasMenorDezesseis = new StringBuilder();
//
//        for (int i=0; i<n; i++) {
//            int ordem = i+1;
//            System.out.println("Dados da " + ordem + "ª pessoa: ");
//            System.out.print("Nome: ");
//            String nome = sc.next();
//            System.out.println();
//            System.out.print("Idade: ");
//            int idade = sc.nextInt();
//            System.out.print("Altura: ");
//            double altura = sc.nextDouble();
//
//            Pessoa pessoa = new Pessoa(nome, idade, altura);
//            listaPessoas[i] = pessoa;
//            somaAlturas += altura;
//
//            if (idade<16) {
//                menorDezesseis ++;
//                pessoasMenorDezesseis.append(nome).append("\n");
//            }
//        }
//
//        double alturaMedia = somaAlturas/listaPessoas.length;
//        int porcMenoresDezesseis = menorDezesseis/listaPessoas.length*100;
//        System.out.println("Altura média: " + alturaMedia);
//        System.out.println("Pessoas com menos de 16 anos: " + porcMenoresDezesseis + "\n" + pessoasMenorDezesseis);
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//        Employee employee3 = new Employee();
//        System.out.print("How many eployees will be registered? ");
//        n = sc.nextInt();
//        System.out.print("Employee #1:\n ");
//
//
//        System.out.println("\n" + rectangle);

//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] matriz = new int [m][n];
//
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<n; j++) {
//                matriz[i][j] = sc.nextInt();
//            }
//        }
//
//        int x = sc.nextInt();
//
//        for (int i=0; i< matriz.length; i++) {
//            for (int j=0; j<matriz[i].length; j++) {
//                if (matriz[i][j] == x) {
//                    System.out.println("Position " + i + "," + j);
//                    if (j>0){
//                        int left = matriz[i][j-1];
//                        System.out.println("Left: " + left);
//                    }
//                    if (j != matriz[i].length-1) {
//                        int right = matriz[i][j + 1];
//                        System.out.println("Right: " + right);
//                    }
//                    if (i != matriz.length-1) {
//                        int down = matriz[i+1][j];
//                        System.out.println("Down: " + down);
//                    }
//                    if (i>0) {
//                        int up = matriz[i-1][j];
//                        System.out.println("Up: " + up);
//                    }
//                }
//            }
//        }
//
//        sc.close();
//        Using different types of dates:
//
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//
//        LocalDate d01 = LocalDate.now();
//        LocalDateTime d02 = LocalDateTime.now();
//        Instant d03 = Instant.now();
//        LocalDate d04 = LocalDate.parse("2022-07-20");
//        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
//        Instant d06 = Instant.parse("2022-07-20T01:30:26");
//        Instant d07 = Instant.parse("2022-07-20T01:30:26-3:00");
//
//        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
//        LocalDate d09 = LocalDate.parse("20/07/2022 01:30", fmt2);
//
//        LocalDate d10 = LocalDate.of(2022, 7, 20);
//        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
//
//        System.out.println(d01);
//        System.out.println(d02);
//        System.out.println(d03);
//        System.out.println(d04);
//        System.out.println(d05);
//        System.out.println(d06);
//        System.out.println(d07);
//        System.out.println(d08);
//        System.out.println(d09);
//        System.out.println(d10);
//        System.out.println(d11);

//         Formatting dates:
//        LocalDate d04 = LocalDate.parse("2022-07-20");
//        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
//        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
//
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // system default gets the zone of the local machine
//        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
//
//
//        System.out.println("d04 = " + d04.format(fmt1));
//        System.out.println("d04 = " + fmt1.format(d04));
//        System.out.println("d04 = " +  d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//        System.out.println("d05 = " + d05.format(fmt1));
//        System.out.println("d05 = " + d05.format(fmt2));
//        System.out.println("d06 = " + fmt3.format(d06));
//
//        Converting global to local date:

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());

    }
}
