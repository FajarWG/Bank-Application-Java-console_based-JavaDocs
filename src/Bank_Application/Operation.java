package Bank_Application;
import java.util.Scanner;

/**
 * Kelas ini berisi operasi utama untuk aplikasi sistem perbankan.
 * Menyediakan antarmuka pengguna untuk melakukan operasi seperti membuat akun baru, memeriksa saldo,
 * menyetor dana, menarik dana, menonton demo akun, dan keluar dari aplikasi.
 * 
 * @author pratiksutar841

 */
public class Operation 
{
    /**
     * Menampilkan menu utama aplikasi perbankan dan menangani input pengguna.
     * Mengarahkan pengguna ke metode operasi sesuai dengan pilihan mereka.
     */
	public static void bankinfo() 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println(" ***Banking System Application***");
	    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println(" 1. Create a new account  \n 2. Check Balance\n 3. Deposit the amount \n 4. Withdraw the amount  \n 5. Watch demo account \n 6. Exit  \n\nENTER YOUR CHOISE :: "); 
	    int key = scan.nextInt();
	    operation(key);
	}
	
	/**
     * Menangani operasi berdasarkan input pengguna yang dipilih dari menu utama.
     * Metode ini mengarahkan pengguna ke berbagai proses perbankan seperti membuka akun baru, 
     * memeriksa saldo, menyetor atau menarik dana, menonton demo akun, atau keluar dari aplikasi.
     * 
     * @param key Pilihan menu yang dimasukkan oleh pengguna
     */
	public static void operation(int key)
	{
		BankInfo bank = new BankInfo();
		Scanner scan = new Scanner(System.in);
		procces bankprocess = new procces();
		
		switch (key) 
		{
			case 1:
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				bankprocess.openAccount();
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println();
			    System.out.println("MAIN PAGE_:: PRESS 1 ::");
				if (scan.nextInt() == 1) 
					bankinfo();
				break;
			case 2:
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				bankprocess.checkbalance();
				System.out.println();
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("MAIN PAGE_:: PRESS 1 ::");
				if (scan.nextInt() == 1) 
					bankinfo();
				break;
			case 3:
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    System.out.println("---------WELCOME TO DEPOSITE PAGE---------------- ");
				bankprocess.deposite();
				System.out.println();
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("MAIN PAGE_:: PRESS 1 ::");
				if (scan.nextInt() == 1) 
					bankinfo();
				break;
			case 4:
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				bankprocess.withdraw();
				System.out.println();
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("MAIN PAGE_:: PRESS 1 ::");
				if (scan.nextInt() == 1) 
					bankinfo();
				break;
			case 5:
			    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    bankprocess.demoaccount();
			    System.out.println();
				System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("MAIN PAGE_:: PRESS 1 ::");
				if (scan.nextInt() == 1) 
					bankinfo();
				break;
			case 6:
				System.out.println("THANKS FOR USING OUT BANK APPLICATION");
				break;
		}
	}
}
