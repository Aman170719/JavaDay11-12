import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class StockAccount{
    public static void main(String[] args) {
        class stockPortfolio {
            public String Companies;
            public int No_ofShares;

            double price;
            final ArrayList<Stock> port = new ArrayList<Stock>();
            double total_value = 0;

            class Stock {
                public int price;
                String Companies;
                public int No_ofShares;
            }

            public double totalValue() {
                for (Stock stock : port) {
                    total_value += stock.price * stock.No_ofShares;
                }
            return total_value;
            }

        }
        {
            System.out.println("Welcome to Stock Account Arrangement :");
            int flag = 0;
            stockPortfolio p = new stockPortfolio();
            Scanner sc = new Scanner(System.in);

            while (flag == 0) {
                System.out.println("Enter the Details of the Stock");
                System.out.println("Enter the Company Name");
                p.Companies = sc.nextLine();
                System.out.println("Enter the Number of Stocks");
                p.No_ofShares = sc.nextInt();
                System.out.println("Enter the Price of the Share");
                p.price = sc.nextDouble();
break;
            }
        }}}

