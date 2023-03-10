import java.util.*;
// import java.util.Scanner;
// import javax.print.event.PrintJobListener;

// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a number");
//         int num = sc.nextInt();
//         int num2 = 10/num;
//         System.out.println(num2);
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a number");
//         int num = sc.nextInt();

//         try {
//             int num2 = 10/num;
//             System.out.println(num2);
//         } catch (Exception e) {
//             System.out.println("Please enter a correct input");
//         }
//         System.out.println("We are out of the try-catch block");
//     }
// } 

// class Answer {
//     public static void main(String[] args) {
//         int arr[] = new int[10];

//         try {
//             arr[15] = 10;
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Exception: " + e);
//             System.out.println("Please enter the correct input");
//         }
//     }
// }

// class Abswer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter number");
//         int num1 = sc.nextInt();

//         try {
//             int num2 = 10/num1;
//             System.out.println(num2);
//         } catch (ArithmeticException e) {
//             System.out.println("Please enter the correct input");
//         }
//         System.out.println("We are out of the try-catch block");
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         int arr[] = new int[10];

//         try {
//             arr[15] = 10;
//         } catch (ArithmeticException e) {
//             System.out.println("Please enter the correct input");
//         }

//         System.out.println("We are out of the try-catch block");
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a number");
//         int num = sc.nextInt();
//         int arr[] = new int[10];
//         try {
//             arr[num] = 10 / num;
//             System.out.println(arr[num]);
//         } catch (ArithmeticException e) {
//             System.out.println("Please enter input(except 0)");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Please enter correct index of array");
//         }
//     }
// 

// class Answer {
//     public static void main(String[] args) {
//         String str = null;
//         try {
//             System.out.println(str.charAt(1));
//         }
//         catch (Exception e) {
//             System.out.println("Some error occurred");
//         } catch (ArithmeticException e) {
//             System.out.println("Please enter non-zero input");
//         } catch (NullPointerException e) {
//             System.out.println("Please enter the correct array index");
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Please enter a number");
//         int num = s.nextInt();

//         int arr[] = new int[10];

//         try {
//             arr[num] = 10 / num;
//             System.out.println(arr[num]);
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException error");
//         } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//             System.out.println("Please enter the correct input");
//         } catch (Exception e) {
//             System.out.println("Some error occurred");
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         try {
//             arr[5] = 10 / 0;
//         } catch (ArithmeticException e1) {
//             System.out.println("Exception: " + e1.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e2) {
//             System.out.println("Exception: " + e2.getMessage());
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         try {
//             int num = 10 / 0;
//             System.out.println(num);
//         } catch (ArithmeticException e) {
//             System.out.println("Number is divided by zero!");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Wrong index!");
//         } catch (Exception e) {
//             System.out.println("Some error occurred");
//         } finally {
//             System.out.println("finally block");
//         }

//         System.out.println(
//             "We are out of the try-catch block"
//         );
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         try {
//             int num = 10 / 0;
//             System.out.println(num);
//         } finally {
//             System.out.println("finally block");
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter roll number");
//         int roll = sc.nextInt();
//         if (roll < 0) {
//             throw new ArithmeticException("Roll number can't be negative");
//         } else {
//             System.out.println("Valid roll number");
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Please enter your roll number");
//         int roll = s.nextInt();
//         try {
//             if (roll < 0) {
//                 throw new ArithmeticException(
//                     "The number entered is not positive"
//                 );
//             } else {
//                 System.out.println("Valid roll number");
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("An exception is thrown");
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter your age");
//         int age = sc.nextInt();

//         try {
//             if (age < 5) {
//                 throw new ArithmeticException(
//                     "Not allowed! Your age is less than 5"
//                 );
//             } else if (age > 20) {
//                 throw new ArithmeticException(
//                     "Not allowed! Your age is greater than 20"
//                 );
//             } else {
//                 System.out.println("Welcome!");
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("An exception is thrown");
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Please enter your roll number");
//         int roll = s.nextInt();

//         try {
//             if (roll < 0) {
//                 throw new Exception("The number entered is not positive");
//             } else {
//                 System.out.println("Valid roll number");
//             }
//         } catch (Exception e) {
//             System.out.println("An exception is thrown");
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     // public static void func() {}
//         public static void func() throws ArithmeticException {
//         int num = 10 / 0;
//     }
//     public static void main(String[] args) {
//         func();
//     }
// }

// class Answer {
//     public static void func()
//         throws ArithmeticException, ArrayIndexOutOfBoundsException {
//     }
//     public static void main(String[] args) {
//         try {
//             func();
//         } catch (ArithmeticException e) {
//         } catch (ArrayIndexOutOfBoundsException e) {
//         }
//     }
// }

// class Answer {
//     public static void calculate()
//         throws ArithmeticException, ArrayIndexOutOfBoundsException {
//         int num = 10 / 0;
//         }
//     public static void main(String[] args) {
//         try {
//             calculate();
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception thrown");
//             System.out.println(e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBounds Exception thrown");
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     public static void calculate() throws IOException {
//         throw new IOException("IOException occurred");
//     }
//     public static void main(String[] args) {
//         try {
//             calculate();
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     public static void func() throws IOException, ClassNotFoundException {
//         // statements which might throw IOException or ClassNotFoundException
//     }
//     public static void main(String[] args) {
//         try {
//             func();
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Answer {
//     void productArray(int array[], int size) {
//         if (size == 1) {
//             System.out.print("0");
//             return;
//         }

//         int i, temp = 1;
//         int product[] = new int[size];
//         for (int j = 0; j < size; j++)
//             product[j] = 1;

//         for (i = 0; i < size; i++) {
//             product[i] = temp;
//             temp *= array[i];
//         }
//         temp = 1;

//         for (i = size - 1; i >= 0; i--) {
//             product[i] *= temp;
//             temp *= array[i];
//         }

//         for (i = 0; i < size; i++)
//             System.out.print(product[i] + " ");

//         return;
//     }

//     public static void main(String[] args) {
//         Answer ans = new Answer();
//         // int array[] = { 1, 2, 3, 4, 5 };
//         int array[] = { 3, 2, 1 };
//         int size = array.length;
//         System.out.println("The product array is : ");
//         ans.productArray(array, size);
//     }
// }

//watering plants
// class Solution {
// public int wateringPlants(int[] plants, int capacity) {
//     int sum=0;
//     int n=plants.length;
//     int count=0;

//     for(int i=0; i<n; i++){
//         sum=sum+plants[i];
//         count++;

//         if(sum>capacity){
//             count+=i*2;
//             sum=plants[i];
//         }
//     }
//     return count;
// }
// }// OR
// class Solution {
//     public int wateringPlants(int[] plants, int capacity) {
//         int steps=0; //Take initially no of steps as 0
//         int k = capacity;// Take k to store water capacity
//         for(int i=0;i<plants.length;i++){ // use for loop and run it till plants length
//             if(k<plants[i]){ // if capacity of container is less than i'th plant's capacity
//                 steps = steps + 2*i;  
//                 k = capacity; // refill the conatiner k
//             }
//             k = k - plants[i];
//             steps++;
//         }
//         return steps;
//     }
// }
//|// with 3 capacity
// public int minRefill(int[] plants, int capacity_1, int capacity_2) {
//     int step = 0;
//     int newcap_1 = capacity_1;
//     int newcap_2 = capacity_2;

//     int j = plants.length-1;

//     for(int i = 0; i <= j; i++) {
//         if(i==j) {
//             if(Math.max(newcap_1, newcap_2)< plants[i]) {
//                 step++;
//             }
//             break;
//         }
//         if(newcap_1 < plants[i]) {
//             newcap_1 = capacity_1;
//             step++;
//         }
//         if(newcap_2 < plants[j]) {
//             newcap_2 = capacity_2;
//             step++;
//         }
//         newcap_2 -= plants[j];
//         newcap_1 -= plants[i];
//         j--;
//     }
//     return step;
// }

//find next pallindrome of number
// class Answer {
//     public static int  nextPallindrome(int input) {
//         int n = input;
//         int k;
//         int reverse = 0;
//         while(input != 0)  {
//             k =input % 10;
//             reverse = (reverse * 10) + k;
//             input /= 10;
//         }
//         if( n == reverse) {
//             return 1;
//         } else {

//     }
//     public static void main (String[] args) {
//         Answer ans = new Answer();
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         while(ans.nextPallindrome(input) == 0) {
//             input = input + 1;
//             System.out.print("Next new pallindrome will be: ");
//             System.out.print(input);
//             System.out.println();
//         };
//     }
// }

// class One {
//     public One(int x) {
//         System.out.println("int cons");
//     }
//     public One(char chr) {
//         System.out.println("char cons");
//     }
//     void One(String str) {
//         System.out.println("string cons");
//     }
// }

// class Answer {
//     public static void main(String[] args) {
//         if(args.length>0)
//         System.out.println(args.length);
//     }
// }

// class Answer {

//     public int waterPlants(int[] plants, int capacity) {
//         int result = 0;
//         int tank = capacity;
//         for(int i =0;i<plants.length;i++)
//         {
//             if(capacity < plants[i])
//             {
//                 capacity = tank-plants[i];
//                 result += i + i+1;
//             }
//             else{
//                 capacity -= plants[i];
//                 result++;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
// Answer ans = new Answer();
// Scanner sc = new Scanner(System.in);
// System.out.println("enter no of element u want in array");
// int n = sc.nextInt();

// int[] plants = new int[10];
// for (int i = 0; i < n; i++) {
//     plants[i] = sc.nextInt();
// }
// System.out.println("Array elements are: ");
// for (int i = 0; i < n; i++) {
//     System.out.println(plants[i]);
// }
// System.out.println("Assign capacity_1 ");
// int capacity_1 = sc.nextInt();

// int result = ans.waterPlants(plants, capacity_1);
// System.out.println("Answer is:  " + result);

//     }

// }

// public class Answer {
//     public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//     public static void printCombination(String str, int index, String combination) {
//         if(index == str.length()) {
//             System.out.println(combination);
//             return;
//         }
//         char currentChar = str.charAt(index);
//         String mapping = keypad[currentChar - '1'];

//         for(int i = 0; i < mapping.length(); i++) {
//             printCombination(str, index+1, combination + mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str = "23";
//         printCombination(str, 0, "");
//     }
// }

//veg or non-veg food bill
// class Answer {
//     public static int FinalReceipt(String type_of_Food, int quantity, int distance) {
//         if (type_of_Food.equals("V")) {
//             int cost = 12;
//             int bill = 0;

//             int dCharge = 0;
//             int factor = 0;

//             while (distance > 0) {
//                 if (factor == 2) {
//                     dCharge += distance * factor;
//                     break;
//                 } else {
//                     dCharge += (distance > 3 ? 3 : distance) * factor;
//                     distance = distance - 3;
//                     factor++;
//                 }
//             }

//             System.out.println(" Delivery Charges : " + dCharge);
//             return (cost * quantity) + dCharge;

//         } else if (type_of_Food.equals("N")) {
//             int cost = 15;
//             int bill = 0;

//             int dCharge = 0;
//             int factor = 0;

//             while (distance > 0) {
//                 if (factor == 2) {
//                     dCharge += distance * factor;
//                     break;
//                 } else {
//                     dCharge += (distance > 3 ? 3 : distance) * factor;
//                     distance = distance - 3;
//                     factor++;
//                 }
//             }

//             System.out.println(" Delivery Charges : " + dCharge);
//             return (cost * quantity) + dCharge;
//         } else {
//             System.out.println("Enter valid type of food! ");
//             return -1;
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter V for veg and N for non-veg food: ");
//         String type_of_Food = sc.nextLine();
//         System.out.println("Enter Quantity of food: ");
//         int quantity = sc.nextInt();
//         System.out.println("Enter distance: ");
//         int distance = sc.nextInt();
//         int Receipt = FinalReceipt(type_of_Food, quantity, distance);
//         System.out.println("Total price to pay is: " + Receipt);

//     }
// }
// // v = 1= 7=17 => 12 + (0 + 3 + 2) [ distant - 3 ] * 0 + [distance - 3] * 1 +
// // [distnace] * 2

// // n = q2= d3=30

// class Answer {
//     public static void checkValidAccount(int account_no) {
//         int count = 0;
//         int accountNumber = account_no;
//         int firstDigit = accountNumber/1000;

//         while(account_no != 0) {
//             account_no /= 10;
//             ++count;
//         } if(count < 4 || count > 4) {
//             System.out.println("Enter valid number!");
//         } else if(count == 4) {
//             if(firstDigit == 1) {
//                 System.out.println("This is a valid account");
//             } else {
//                 System.out.println("It's an invalid account!");
//             }
//         } else {
//             System.out.println("Invalid number!");
//         }
//     }
//     public static void checkBalance(float balance) {
//         float accountBalance = balance;
//         if(accountBalance >= 1000) {
//             System.out.println("Elligible! ");
//         } else {
//             System.out.println("Not elligible");
//         }
//     }
//     public static void FinalReceipt(int salary, String loan_type, int loan_in_need, int expectedEmis) {
//         if(salary >= 25000) {
//             int eligibleLoanAmount = 500000;
//             int eligibleEmis = 36;
//             loan_type = "Car";
//             if(loan_in_need <= eligibleLoanAmount) {
//                 if(expectedEmis <= eligibleEmis) {
//                     System.out.println("eligibleLoanAmount: " + eligibleLoanAmount);
//                     System.out.println(" eligibleEmis: " + eligibleEmis);

//                 } else {
//                     System.out.println("Not elligible emis");
//                 }
//             } else {
//                 System.out.println("Not elligible as amount is not accepted");
//             }
//         } else if(salary >= 50000) {
//             int eligibleLoanAmount = 6000000;
//             int eligibleEmis = 60;
//             loan_type = "House";
//             if(loan_in_need <= eligibleLoanAmount) {
//                 if(expectedEmis <= eligibleEmis) {
//                     System.out.println("eligibleLoanAmount: " + eligibleLoanAmount);
//                     System.out.println(" eligibleEmis: " + eligibleEmis);

//                 } else {
//                     System.out.println("Not elligible emis");
//                 }
//             } else {
//                 System.out.println("Not elligible as amount is not accepted");
//             }
//         } else if(salary >= 75000) {
//             int eligibleLoanAmount = 7500000;
//             int eligibleEmis = 84;
//             loan_type = "Car";
//             if(loan_in_need <= eligibleLoanAmount) {
//                 if(expectedEmis <= eligibleEmis) {
//                     System.out.println("eligibleLoanAmount: " + eligibleLoanAmount);
//                     System.out.println(" eligibleEmis: " + eligibleEmis);

//                 } else {
//                     System.out.println("Not elligible emis");
//                 }
//             } else {
//                 System.out.println("Not elligible as amount is not accepted");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter account no: ");
//         int account_no = sc.nextInt();
//         checkValidAccount(account_no);
//         System.out.println("Enter Account balance: " );
//         float balance = sc.nextFloat();
//         checkBalance(balance);
//         System.out.println("Enter Salary: ");
//         int salary = sc.nextInt();
//         System.out.println("Enter Loan type: ");
//         String loan_type = sc.nextLine();
//         System.out.println("Enter Expected loan amount: ");
//         int loan_in_need = sc.nextInt();
//         System.out.println("Enter expected EMIs: ");
//         int expectedEmis = sc.nextInt();
//         FinalReceipt(salary, loan_type, loan_in_need, expectedEmis);
//     }
// }

// Permutation of string
// class Answer {
//       static void printPermutn(String str, String ans)
//     {
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             String ros = str.substring(0, i) + 
//                          str.substring(i + 1);
//             printPermutn(ros, ans + ch);
//         }
//     }
//     public static void main(String[] args)
//     {
//         String s = "abc";
//         printPermutn(s, "");
//     }
// }

// OR
// class Answer {  
//     public static String swapString(String a, int i, int j) {  
//         char[] b =a.toCharArray();  
//         char ch;  
//         ch = b[i];  
//         b[i] = b[j];  
//         b[j] = ch;  
//         return String.valueOf(b);  
//     }  
//     public static void main(String[] args)  
//     {  
//         String str = "ABC";  
//         int len = str.length();  
//         System.out.println("All the permutations of the string are: ");  
//         generatePermutation(str, 0, len);  
//     }  
//         public static void generatePermutation(String str, int start, int end)  
//     {  
//         if (start == end-1)  
//             System.out.println(str);  
//         else  
//         {  
//             for (int i = start; i < end; i++)  
//             {  
//                 str = swapString(str,start,i);  
//                 generatePermutation(str,start+1,end);  
//                 str = swapString(str,start,i);  
//             }  
//         }  
//     }  
// }  

// N-queens

// class Solution {

//     public void saveBoard(char[][] board, List<List<String>> allBoards) {
//         String row = "";
//         List<String> newBoard = new ArrayList<>();
//         for(int i = 0; i<board.length; i++) {
//             row = "";
//              for(int j=0; j<board[0].length; j++) {
//                if(board[i][j] == 'Q')
//                    row += 'Q';
//                else
//                    row += '.';
//            }
//            newBoard.add(row);
//        }

//        allBoards.add(newBoard);
//    }

//     public boolean isSafe(int row, int col, char[][] board) {

//         //vertical check
//         for(int i=0; i<board.length; i++) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //horizontal check
//         for(int j=0; j<board.length; j++) {
//             if(board[row][j] == 'Q') {
//                 return false;
//             }
//         }
//         //upper left
//         int r = row;
//        for(int c=col; c>=0 && r>=0; c--, r--) {
//            if(board[r][c] == 'Q') {
//                return false;
//             }
//         }
//         //upper right
//         r = row;
//        for(int c=col; c<board.length && r>=0; r--, c++) {
//            if(board[r][c] == 'Q') {
//                return false;
//             }
//         }
//         //lower left
//         r = row;
//        for(int c=col; c>=0 && r<board.length; r++, c--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
//          //lower right
//         for(int c=col; c<board.length && r<board.length; c++, r++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }

//        return true;
//    }

//     public void backtrackingFunction(char[][] board, List<List<String>> allBoards, int col) {
//        if(col == board.length) {
//            saveBoard(board, allBoards);
//            return;
//        }

//         for(int row=0; row<board.length; row++) {
//            if(isSafe(row, col, board)) {
//                board[row][col] = 'Q';
//                backtrackingFunction(board, allBoards, col+1);
//                board[row][col] = '.';

//             }
//         }
//     }

//     public List<List<String>> solveNQueens(int n) {
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new char[n][n];

//        backtrackingFunction(board, allBoards, 0);
//        return allBoards;
//    }
// }

//Sudoku-Solver

// class Solution {
//     public boolean isSafe(char[][] board, int row, int col, int number) {

//         // column
//         for (int i = 0; i < board.length; i++) {
//             if (board[i][col] == (char) (number + '0')) {
//                 return false;
//             }
//         }

//         // row
//         for (int j = 0; j < board.length; j++) {
//             if (board[row][j] == (char) (number + '0')) {
//                 return false;
//             }
//         }

//         // grid
//         int sr = 3 * (row / 3);
//         int sc = 3 * (col / 3);

//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (board[i][j] == (char) (number + '0')) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public boolean helper(char[][] board, int row, int col) {
//         if (row == board.length) {
//             return true;
//         }

//         int nrow = 0;
//         int ncol = 0;

//         if (col == board.length - 1) {
//             nrow = row + 1;
//             ncol = 0;
//         } else {
//             nrow = row;
//             ncol = col + 1;
//         }

//         if (board[row][col] != '.') {
//             if (helper(board, nrow, ncol)) {
//                 return true;
//             }
//         } else {

//             // fill the place
//             for (int i = 1; i <= 9; i++) {
//                 if (isSafe(board, row, col, i)) {
//                     board[row][col] = (char) (i + '0');
//                     if (helper(board, nrow, ncol))
//                         return true;
//                     else
//                         board[row][col] = '.';
//                 }
//             }
//         }

//         return false;
//     }

//     public void solveSudoku(char[][] board) {
//         helper(board, 0, 0);
//     }
// }

// Minimum Size Subarray Sum
// class Answer {
//     public int minSubArrayLen(int s, int[] nums) {
//         if (nums == null || nums.length == 0)
//             return 0;

//         int i = 0;
//         int j = 0;
//         int sum = 0;

//         int minLen = Integer.MAX_VALUE;

//         while (j < nums.length) {
//             if (sum < s) {
//                 sum += nums[j];
//                 j++;
//             } else {
//                 minLen = Math.min(minLen, j - i);
//                 if (i == j - 1)
//                     return 1;

//                 sum -= nums[i];
//                 i++;
//             }
//         }

//         while (sum >= s) {
//             minLen = Math.min(minLen, j - i);

//             sum -= nums[i++];
//         }

//         return minLen == Integer.MAX_VALUE ? 0 : minLen;
//     }
// }

// count minimum no of notes to generate an amount using 5 and 1 rupee note
// class Answer {
//     public static void generateNotes(int purchaseAmount, int fiveRupeeNote, int oneRupeeNote) {
//         int moneyToPay = purchaseAmount;
//         int notesOfFive = moneyToPay/5;
//         int notesOfOne = moneyToPay%5;
//         if((notesOfFive <= fiveRupeeNote) && (notesOfOne <= oneRupeeNote)) {
//             System.out.println("$1 notes needed = " + notesOfOne);
//             System.out.println("$5 notes needed = " + notesOfFive);
//         } else {
//             System.out.println("-1 ");
//         } 
//     }

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         System.out.println("Enter $1 notes available = " );
//         int oneRupeeNote = sc.nextInt();
// 		System.out.println("Enter $5 notes available = " );
//         int fiveRupeeNote = sc.nextInt();
//         System.out.println("Enter Purchase amount = ");
// 		int purchaseAmount = sc.nextInt();
//         System.out.println("$1 notes available = " + oneRupeeNote);
//         System.out.println("$5 notes available = " + fiveRupeeNote);
// 		System.out.println("Purchase amount = " + purchaseAmount);
//         generateNotes(purchaseAmount, fiveRupeeNote, oneRupeeNote);
// 	}
// }

//New next Day
// class Answer {
//     public static void newNextDate(int day, int month, int year) {
//         int totalMonths = 12;
//         int totalDays;
//         int newDay = day + 1;
//         int newMonth = month + 1;
//         int newYear = year + 1;

//         if( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
//             if(newDay > 31) {
//                 day = 1;
//                 month = newMonth; 
//                 System.out.println(day+"-"+month+"-"+year);
//             } else {
//                 System.out.println(newDay+"-"+month+"-"+year);
//             }
//         }
//         else if(month == 2) {
//             if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
//                 totalDays = 29;
//                 if(newDay > totalDays) {
//                     day = 1;
//                     month = newMonth;
//                     System.out.println(day+"-"+month+"-"+year);
//                 } else {
//                     System.out.println(newDay+"-"+month+"-"+year);
//                 }
//             } else {
//                 totalDays = 28;
//                 if(newDay > totalDays) {
//                     day = 1;
//                     month = newMonth;
//                     System.out.println(day+"-"+month+"-"+year);
//                 } else {
//                     System.out.println(newDay+"-"+month+"-"+year);
//                 }
//             }
//         }
//         else if(month == 4 || month == 6 || month == 9 || month == 11) {
//             if(newDay > 30) {
//                 day = 1;
//                 month = newMonth; 
//                 System.out.println(day+"-"+month+"-"+year);
//             }
//             else {
//                 System.out.println(newDay+"-"+month+"-"+year);
//             }
//         } 
//         else {
//             if(newDay > 31) {
//                 day = 1;
//                 month = 1; 
//                 year = newYear;
//                 System.out.println(day+"-"+month+"-"+year);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Day = ");
//         int day = sc.nextInt();
//         System.out.print("Month = ");
//         int month = sc.nextInt();
//         System.out.print("Year = ");
//         int year = sc.nextInt();
//         newNextDate(day, month, year);
//     }
// }

//Print zip for multiple of 3 , zap for multiple of 5 and zoom for multiple of 3 and 5
// class Answer {
//     public static void displayForNumbers(int input) {
//         int multipleOfThree = (input % 3);
//         int multipleOfFive = (input % 5);
//         if (multipleOfThree == 0 && multipleOfFive == 0) {
//             System.out.print("Zoom");
//         } else if (multipleOfFive == 0) {
//             System.out.print("Zap");
//         } else if (multipleOfThree == 0) {
//             System.out.print("Zip");
//         } else {
//             System.out.print("Invalid");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         displayForNumbers(input);
//     }
// }

//isPallindrome?
// class Answer {
//     public static void isPallindrome(String input) {
//         int size = input.length();
//         String reverse  = "";
//         for(int i = size - 1; i >= 0; i--) {
//             reverse = reverse + input.charAt(i); 
//         }
//         if(input.equals(reverse)) {
//             System.out.print(input + " is a pallindrome");
//         } else {
//             System.out.print(input + " is not a pallindrome");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         isPallindrome(input);
//     }
// }

//how many rabbit and chicken
// class Answer {
//     public static void countRabbitsAndChickens(int heads, int legs) {
//         int OneRabbitHead = 1;
//         int OneRabbitLegs = 4;
//         int OneChickenHead = 1;
//         int OneChickenLegs = 2;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int heads = sc.nextInt();
//         int legs = sc.nextInt();
//         countRabbitsAndChickens(heads, legs);
//     }
// 

//count no of chicken and rabbit from given heads and legs
//IF head=150, leg = 500; => chicken =50 , rabbit=100
// trick=>
// x+y = 150 => y = 150 - x
//     4x+2y = 500
//     4x = 500 - 2y
//     4x = 500 - 2(150 - x)
//     4x = 500 - 300 + 2x
//     2x = 200
//     x = 100//rabbit

//     y = 150-100 => 50//chicken
// class Answer {

//     public static int countNoOfRabbits(int head, int legs) {
//         int count = 0;
//         count = (legs) - 2 * (head);
//         count /= 2;
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int head = sc.nextInt();
//         int legs = sc.nextInt();

//         System.out.println( "Rabbits = " + countNoOfRabbits(head, legs));
//         System.out.println( "Chickens = " + (head - countNoOfRabbits(head, legs)));

//     }
// }

//Number is divisible by Sum of its digits 
// class Answer {
//     public static int ifIsDivisible(int num) {
//         int number = num;
//         int sum = 0;
//         while(num != 0) {
//             int k = (int) num % 10;
//             sum += k;
//             num /= 10;
//         } 
//         int divide = number % sum;
//         if(divide == 0) {
//             System.out.println(number  + " is divisible by sum of its digits ");
//         } else {
//             System.out.println(number + " is not divisible by sum of its digits ");
//         }
//         return divide;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num: ");
//         int num = sc.nextInt();
//         int divisible = ifIsDivisible(num);
//     }
// }

// Implement a program to find out whether a number is a seed of another number.
// A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
// E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
// class Answer {
//     public static void seedOfNumber(int seed, int number) {
//         int newSeed = seed;
//         // System.out.println("newSeed: " + newSeed);
//         int newNumber = number;
//         // System.out.println("newNumber: " + newNumber);
//         while (seed != 0) {
//             newSeed *= (seed % 10);
//             // System.out.println(" while newSeed: " + newSeed);
//             seed /= 10;
//             // System.out.println("while seed: " + seed);
//         }
//         if (newSeed == newNumber) {
//             System.out.println("123 is a seed of " + number);
//         } else {
//             System.out.println(" 123 is a not a seed of " + number);
//         }

//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Seed: ");
//         // int seed = sc.nextInt();
//         int seed = 123;
//         // System.out.println("Number: ");
//         // int number = sc.nextInt();
//         int number = 738;
//         System.out.println(seed + ", " + number);
//         seedOfNumber(seed, number);
//     }
// }

// class Answer {
//     public static void ifIsArmstrongNumber(int input) {
//         int tempNumber = input;
//         int digits = 0;
//         int result = 0;
//         int sum = 0;

//         while(tempNumber != 0) {
//             tempNumber = tempNumber/10;
//             digits++;
//         }

//         tempNumber = input;
//         while(tempNumber != 0) {
//             result = tempNumber % 10;
//             sum += (Math.pow(result, digits));
//             tempNumber /= 10;
//         }
//         if(input == sum) {
//             System.out.println(input + " is an Armstrong number ");
//         } else {
//             System.out.println(input + " is not an Armstrong number ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         ifIsArmstrongNumber(input);
//     }
// }

//  Check if it is a lucky number. A lucky number is the sum of squares of even-positioned
//  digit (starting from the second position) is a multiple of 9.
// class Answer {
//     public static void ifIsLuckyNumber(int input) {
//         int temp = input;
//         int sum = 0;
//         int digits = 0;

//         while (temp != 0) {
//             int div = input % 10;
//             temp = temp / 10;
//             digits++;
//             if (digits % 2 == 0) {
//                 sum += div*div;
//             }
//         }
//         if (sum % 9 == 0) {
//             System.out.println("The number " + input + " is a lucky number");
//         } else {
//             System.out.println("The number is not a lucky number");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         ifIsLuckyNumber(input);
//     }
// }

//LCM of numbers
// class Answer {
//     public static void lcmOfNumbers(int num1, int num2) {
//         int lcm = (num1 > num2) ? num1 : num2;
//         while(true) {
//             if(lcm % num1 == 0 && lcm % num2 ==0) {
//                 System.out.println(lcm);
//                 break;
//             }
//             lcm++;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         System.out.println("num1 = " + num1 + ", " + "num2 = " + num2);
//         lcmOfNumbers(num1, num2);
//     }
// }

//patern
// *****
// ****
// ***
// **
// *
//
// class Answer {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         for(int i = row; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//find sum of number till 5 and after 8. also add string from 5 to 8 and sum the total up of string and previous sum
// class Answer {
//     public static void sumOfNumberThatDoesNotLieBtwFiveAndEight(int[] array) {
//         int first = 0, last = 0;
//         int sum = 0;
//         boolean found = false;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 5) {
//                 first = i;
//                 found = true;
//                 continue;
//             }
//             if (array[i] == 8) {
//                 last = i;
//                 found = false;
//                 continue;
//             }
//             if (found) {
//                 continue;
//             }
//             sum += array[i];
//         }
//         String middle = "";
//         for (int i = first; i <= last; i++) {
//             middle = middle + array[i];
//         }
//         int result = (sum + Integer.parseInt(middle));
//         // System.out.println("Sum : " + sum + " first : " + first + " last : " + last + " middle : " + middle
//         //         + " result : " + result);
//         System.out.println(result);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] array = new int[size];
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }
//         sumOfNumberThatDoesNotLieBtwFiveAndEight(array);
//     }
// }

//find IF substring exist
// class Answer {
//     static boolean commonSubsequenceString(String string1, String string2, int lengthOfString1, int lengthOfString2) {
//         if (lengthOfString1 == 0) {
//             return true;
//         } 
//         if (lengthOfString2 == 0) {
//             return false;
//         }
//         if (string1.charAt(lengthOfString1-1) == string2.charAt(lengthOfString2-1)) {
//             return commonSubsequenceString(string1, string2, lengthOfString1-1, lengthOfString2-1);
//         }
//         return commonSubsequenceString(string1, string2, lengthOfString1, lengthOfString2-1); 
//     } 
//     public static void main (String[] args) { 
//         String string1 = "ADollY"; 
//         String string2 = "ADXoCllPY"; 
//         int lengthOfString1 = string1.length(); 
//         int lengthOfString2 = string2.length(); 
//         boolean result = commonSubsequenceString(string1, string2, lengthOfString1, lengthOfString2); 
//         if(result) 
//             System.out.println("Yes"); 
//         else
//             System.out.println("No"); 
//     } 
// }

//You are given an array Arr of size N. You can perform two types of operations on the array:
// 1. Divide Arr[i] by 2 this is only possible when Arr[i] is even
// 2. Add any odd integer to Arr[i].
// You need to count the minimum number of steps in which all the elements of Arr will become 1.
// testcae1:
// 5
// 1
// 6
// 6
// 6
// 2
// testcae2:
// 1
// 1
// testcae3:
// 2
// 5
// 8
// class Answer {

//     private static int getClosest(int n) {
//         int power = 1;
//         while(power < n)
//             power*=2;
//         return power;
//     }

//     public static void function(int[] arr) {
//         // System.out.println("Function begins here ");
//         int nextCount = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 1) {
//                 nextCount = 0;
//             }
//             if (arr[i] == 0) {
//                 break;
//             }
//             while (arr[i] != 1) {
//                 if (arr[i] % 2 == 0) {
//                     arr[i] /= 2;
//                     nextCount++;
//                 } else {
//                     int n = getClosest(arr[i]);
//                     arr[i] = n;
//                     nextCount++;
//                 }
//             }
//         }
//         System.out.println("Next: " + nextCount);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("No of elements u want in array: ");
//         int N = sc.nextInt();
//         // int N = 2;
//         int[] arr = new int[N];
//         System.out.println("Enetr elements in array: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//             // System.out.println("element: " + arr[i]);
//         }
//         function(arr);
//     }
// }

//findAverage() : Calculate the average of three numbers and Return the average rounded off to two decimal digits
// class Answer {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num1, num2 num3: ");
//         int number1 = sc.nextInt();
//         int number2 = sc.nextInt();
//         int number3 = sc.nextInt();
//         calculator.findAverage(number1, number2, number3);

//     }
// }
// class Calculator {
//     public static void findAverage(int number1, int number2, int number3) {
//         double sum = number1 + number2 + number3;
//         System.out.println(sum);
//         double average = sum / 3;
//         System.out.println(average);
//         System.out.println("finalAvg: " + String.format("%.2f", average));
// OR System.out.println("finalAvg: " + Math.round(average * 100.0) / 100.0);
//     }
// }

//calculate sum using two classes
// class Calculator {
//     public static int sumOfDigits(int num) {
//         int sum = 0;
//         while(num != 0) {
//             sum += num % 10;
//             num /= 10;
//         }
//         return sum;
//     }
// }
// class Answer {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num: ");
//         int num = sc.nextInt();
//         int result = calculator.sumOfDigits(num);
//         System.out.println("Result: " + result);
//     }
// }

//calculate area and perimeter of rectangle
// class Rectangle {
//     public static int areaOfRectangle(int length, int width) {
//         int area = length * width;
//         return area;
//     }
//     public static int perimeterOfRectangle(int length, int width) {
//         int perimeter = 2 * (length + width);
//         return perimeter;
//     }
// }
// class Answer {
//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length: ");
//         int length = sc.nextInt();
//         System.out.println("Enter width: ");
//         int width = sc.nextInt();
//         System.out.println("length= " + length + "f");
//         System.out.println("width= " + width + "f");
//         double area = (double) rectangle.areaOfRectangle(length, width);
//         double perimeter = (double) rectangle.perimeterOfRectangle(length, width);
//         System.out.println("Area= " + area);
// 		System.out.println("Perimeter= " + perimeter);
//     }
// }

// Implement the class MovieTicket with the instance variables and methods
// class Answer {
//     private int movieID;
//     private int noOfSeats;
//     private double costPerTicket;

//     Answer(int movieID, int noOfSeats) {
//         this.movieID = movieID;
//         this.noOfSeats = noOfSeats;

//     }
//     public double calculateTotalAmount() {
//         double cost, cost2;
//         double amount;  
//         if (movieID == 111) {
//             costPerTicket = 7;
//             cost = costPerTicket * noOfSeats;
//             // System.out.println(cost);
//             cost2 = 0.02 * cost;
//             // System.out.println(cost2);
//             amount = cost + cost2;
//             // System.out.println(amount);
//             return amount;
//         }
//         else if (movieID == 112) {
//             costPerTicket = 8;  
//             cost = costPerTicket * noOfSeats;
//             // System.out.println(cost);
//             cost2 = 0.02 * cost;
//             // System.out.println(cost2);
//             amount = cost + cost2;
//             // System.out.println(amount);
//             return amount;
//         }
//         else if(movieID == 113) {
//             costPerTicket = 8.5; 
//             cost = costPerTicket * noOfSeats;
//             // System.out.println(cost);
//             cost2 = 0.02 * cost;
//             // System.out.println(cost2);
//             amount = cost + cost2;
//             // System.out.println(amount);
//             return amount; 
//         }
//         else {
//             return 0;
//         }
//     }
//     public int getMovieId() {
//         return movieID;
//     }
//     public void setMovieId(int movieID) {
//         this.movieID = movieID;

//     }
//     public int getNoOfSeats() {
//         return noOfSeats;
//     }
//     public void seTNoOfSeats(int noOfSeats) {
//         this.noOfSeats = noOfSeats;
//     }
//     public double getCostPerTicket(int noOfSeats) {
//         return costPerTicket;
//     }
//     public void seTCostPerTicket(int noOfSeats) {
//         this.noOfSeats = noOfSeats;
//     }

// }
// class Main {
//     public static void main(String[] args) {
//         Answer movieTicket = new Answer(112, 3);
//         double amount = movieTicket.calculateTotalAmount();
//         if (amount==0)
//             System.out.println("Sorry! Please enter valid movie Id and number of seats");
//         else
//             System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
//     }
// }

// sum of even numbers in array
// class Answer {

//     public static int calculateSumOfEvenNumbers(int[] numbers){
//         int sum = 0;
//         for(int i = 0; i < numbers.length; i++) {
//              if(numbers[i] % 2 == 0) {
//                  sum += numbers[i];
//                  System.out.println("Sum" + sum);
//              }
//         }
//         return 0;
//     }

// 	public static void main(String[] args) {
// 		int[] numbers = {68,79,86,99,23,2,41,100};
// 		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
// 	}
// }

// print all special characters at the end of the string
// class Answer {

//     public static String moveSpecialCharacters(String str) {
//         int len = str.length();
//         String regx = "[a-zA-Z0-9\\s+]";
//         String res1 = "", res2 = "";
//         for (int i = 0; i < len; i++) {

//             char c = str.charAt(i);
//             if (String.valueOf(c).matches(regx))
//                 res1 = res1 + c;
//             else
//                 res2 = res2 + c;
//         }
//         return res1 + res2;

//     }

//     public static void main(String args[]) {
//         String str = "He@#$llo!*&";
//         System.out.println(moveSpecialCharacters(str));
//     }

// }

//checkPalindrome() method
// class Answer {
//     public static boolean checkPalindrome(String str) {
//         int i = 0, j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         String str = "radar";
//         if (checkPalindrome(str))
//             System.out.println("True");
//         else
//             System.out.println("False");
//     }
// }

// reverse Each Word
// class Answer {
//     public static String reverseEachWord(String str) {
//         String words[] = str.split("\\s");
//         String reverseWord = "";
//         for (String w : words) {
//             StringBuilder sb = new StringBuilder(w);
//             sb.reverse();
//             reverseWord += sb.toString() + " ";
//         }
//         return reverseWord.trim();
//     }

//     public static void main(String args[]) {
//         String str = "all cows eat grass";
//         System.out.println(reverseEachWord(str));
//     }
// }

//find Highest Occurrence
// class Answer {
//     static final int MAX_CHAR = 256;

//     static int findHighestOccurrence(String str) {
//         int count[] = new int[MAX_CHAR];
//         int len = str.length();

//         for (int i = 0; i < len; i++)
//             count[str.charAt(i)]++;

//         int max = -1;

//         for (int i = 0; i < len; i++) {
//             if (max < count[str.charAt(i)]) {
//                 max = count[str.charAt(i)];
//             }
//         }
//         return max;
//     }

//     public static void main(String args[]) {
//         String str = "Dolly";
//         System.out.println(findHighestOccurrence(str));
//     }
// }

//remove duplicates
// class Answer {
//     // static String removeSpaces(String[] str) {
//     // int count = 0;
//     //
//     // }
//     static String removeDuplicate(char str[], int n) {
//         int index = 0;

//         for (int i = 0; i < n; i++) {
//             int j;
//             for (j = 0; j < i; j++) {
//                 if (str[i] == str[j]) {
//                     break;
//                 }
//                 if (str[i] != ' ') {
//                     str[count++] = str[i];
//                     return count;
//                 }
//                 // char[] str = str.replaceAll("\\s", "");
//             }

//             if (j == i) {
//                 str[index++] = str[i];
//             }
//         }
//         return String.valueOf(Arrays.copyOf(str, index));
//     }

//     public static void main(String[] args) {
//         char str[] = "aye leelo ailesa".toCharArray();
//         int n = str.length;
//         System.out.println(removeDuplicate(str, n));
//     }
// }

//Implement a program to display the geometric sequence as given below for 
// a given value n, where n is the number of elements in the sequence.
// 1, 2, 4, 8, 16, 32, 64, ......, 1024

// class Answer {
//     public static void geometricSequence(int num) {
//         int seq = 1;
//         while(num != 0){
//             System.out.print(seq + ", ");
//             seq *= 2;
//             num--;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         geometricSequence(num);
//     }
// }

// print zee
// if 
// Input: N = 5
// Output: 
// 1 2 3 4 5 
//       4
//     3
//   2
// 1 2 3 4 5
// and like 
// 1 2 3 * * * N
//           *
//         *
//       *
//     3
//   2
// 1 2 3 * * * N
// class Answer {
// 	static void alphabetPattern(int N) {

// 		int index, side_index;
// 		int Top = 1, Bottom = 1, Diagonal = N - 1;

// 		for (index = 0; index < N; index++)
// 			System.out.print(Top++ + " ");

// 		System.out.println();

// 		for (index = 1; index < N - 1; index++) {

// 			for (side_index = 0; side_index < 2 * (N - index - 1); side_index++)
// 				System.out.print(" ");

// 			System.out.print(Diagonal--);

// 			System.out.println();
// 		}
// 		for (index = 0; index < N; index++)
// 			System.out.print(Bottom++ + " ");
// 	}

// 	public static void main(String[] a) {
// 		int N = 5;

// 		alphabetPattern(N);
// 	}
// }

// make
// * * * * * 
//       *
//     *
//   *
// * * * * * 
// class Answer {
// 	static void alphabetPattern(int N) {

// 		int index, side_index;
// 		int Top = 1, Bottom = 1, Diagonal = N - 1;

// 		for (index = 0; index < N; index++)
// 			System.out.print("*" + " ");

// 		System.out.println();

// 		for (index = 1; index < N - 1; index++) {

// 			for (side_index = 0; side_index < 2 * (N - index - 1); side_index++)
// 				System.out.print(" ");
// 			System.out.print("*");

// 			System.out.println();
// 		}
// 		for (index = 0; index < N; index++)
// 			System.out.print("*" + " ");
// 	}

// 	public static void main(String[] a) {
// 		int N = 5;

// 		alphabetPattern(N);
// 	}
// }

// we get a number 'n' and it's base 'b', and we are required to convert the number 'n' into a decimal number.
// public class Answer {
// 	public static void main(String[] args) {
// 	  Scanner scn = new Scanner(System.in);
// 	  int n = scn.nextInt();
// 	  int b = scn.nextInt();
// 	  scn.close();
// 	  int d = toDecimal(n, b);
// 	  System.out.println(d);
// 	}
// 	public static int toDecimal(int n, int b) {
// 	  int multiplier = 0, ans_num = 0;
// 	  while (n > 0) {
// 		int remainder = n % 10;
// 		n = n / 10;
// 		ans_num += remainder * Math.pow(b, multiplier);
// 		multiplier++;
// 	  }
// 	  return ans_num;
// 	}
//   }

// public class Answer {

// 	public static boolean isPrime(int n) {
// 		if (n <= 1) {
// 			return false;
// 		}
// 		for (int i = 2; i < Math.sqrt(n); i++) {
// 			if (n % i == 0) {
// 				return false;
// 			}
// 		}
// 		return true;
// 	}

// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		int t = scn.nextInt();
// 		for (int i = 1; i <= t; i++) {
// 			int n = scn.nextInt();
// 			if (isPrime(n)) {
// 				System.out.println("prime");
// 			} else {
// 				System.out.println("not prime");
// 			}
// 		}

// 	}

// }

// class Bill{
//     int counter = 0;
//     String billId;
//     String payementMode;
//     public static String getBillId() {
//         String 
//         System.out.println("B")
//     }
//     public static String getPaymentMode(payementMode) {

//     }
// }

// class Tester {
//     public static void main(String[] args) {

//         Bill bill1 = new Bill("DebitCard");
//         Bill bill2 = new Bill("PayPal");

//         //Create more objects and add them to the bills array for testing your code

//         Bill[] bills = { bill1, bill2 };

//         for (Bill bill : bills) {

//             System.out.println("Bill Details");
//             System.out.println("Bill Id: " + bill.getBillId());
//             System.out.println("Payment method: " + bill.getPaymentMode());
//             System.out.println();
//        }
//     }
// }

// class Tester {
// 	public static void main(String[] args) {
// 		Car c1 = new Car("Red");
// 		Car c2 = new Car("Green");
// 		Car c3 = new Car("Blue");
// 		System.out.println("Number of cars created: " + Car.getNumberOfCars());
// 	}

// 	static {
// 		System.out.println("Tester class loaded");
// 	}
// }

// class Car {
// 	private String color;
// 	private static int numberOfCars = 0;

// 	static {
// 		System.out.println("Car class loaded");
// 	}

// 	public Car(String color) {
// 		this.color = color;
// 		numberOfCars++;
// 	}

// 	public static String getColor() {
// 		return this.color;
// 	}

// 	public static int getNumberOfCars() {
// 		return numberOfCars;
// 	}
// }

class Answer
{
    public static void main(String[] args)
    {		
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char Name=name.charAt(0);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int avg=0;
        //avg=(m1+m2+m3)/3;
        if(m1>=0 && m2>=0 && m3>=0)
           {
             if(m1<=100 && m2<=100 && m3 <=100)
                {
                    avg=(m1+m2+m3)/3;
                }
           }       
        System.out.println(Name+"\n"+avg);
    }
}