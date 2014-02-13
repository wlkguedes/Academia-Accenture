package sef.module8.activity;



//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/activity1";
		String user = "root";
		String pass = "abcd1234";

		// The following code would not compile unless it's put inside a try
		// catch
		// 1 - put it in a try block and handle ClassNotFoundException

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Nao foi possivel encontrar a casse: com.mysql.jdbc.Driver");
		}

		// 2 - You also need to catch SQLException for it to compile
		try {
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			cn.close();
		} catch (SQLException e) {
			System.out.println("Nao foi possivel estabelecer conexao com o banco");
		}
		

		//FORMA MAIS ELEGANTE DE FAZER E COMO EH FEITO EM AMBIENTE DE DESENVOLVIMENTO
		
		// 2 - You also need to catch SQLException for it to compile
		/*Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
		} catch (SQLException e) {
			System.out.println("Nao foi possivel estabelecer conexao com o banco");
		} catch (ClassNotFoundException e) {
			System.out.println("Nao foi possivel encontrar a casse: com.mysql.jdbc.Driver");
		} finally {
			if (cn == null) {
				cn.close();
			}
		}*/
		
	}

}