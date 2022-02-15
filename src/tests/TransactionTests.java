package tests;

import java.util.Date;

import model.Transaction;

public class TransactionTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction testTransaction = new Transaction("123",10.0,new Date());
		System.out.println(testTransaction);

	}

}
