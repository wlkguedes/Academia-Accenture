package sef.module4.activity;

import java.util.Date;

/**
 * @author Wilkie Guedes
 * 
 */

public class DateActivity {
	
	private int dia;
	private int mes;
	private int ano;
	
	public DateActivity() {
		dia = 01;
		mes = 01;
		ano = 2000;
	}
	
	public static void main(String[] args) {
		DateActivity dateActivity = new DateActivity();
		
		//imprimindo dia, mes e ano definidos no construtor
		System.out.println(dateActivity.dia+"/"+dateActivity.mes+"/"+dateActivity.ano);
		//imprimindo o metodo hoje() da instancia
		System.out.println("Hoje: "+dateActivity.hoje());
	}
	
	public Date hoje(){
		return new Date();
	}
}
