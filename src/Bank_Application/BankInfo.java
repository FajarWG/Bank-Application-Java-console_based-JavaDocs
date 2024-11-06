package Bank_Application;

import java.util.Scanner;

/**
 * Kelas ini merepresentasikan informasi akun bank.
 * Kelas ini menyimpan detail akun seperti nomor akun, nama pemilik, jenis akun, dan saldo.
 * 
 * @author pratiksutar841
 
 */
public class BankInfo 
{  
    private String accno;   // Nomor akun
    private String name;    // Nama pemilik akun
    private String acc_type; // Jenis akun
    private long balance;    // Saldo akun
    
    /**
     * Mengambil nama pemilik akun.
     * 
     * @return nama pemilik akun
     */
    public String getName() 
    {
		return name;
	}

    /**
     * Mengatur nama pemilik akun.
     * 
     * @param name nama pemilik akun
     */
	public void setName(String name) 
	{
		this.name = name;
	}

    /**
     * Mengambil saldo akun.
     * 
     * @return saldo akun
     */
	public long getBalance() 
	{
		return balance;
	}

    /**
     * Mengatur saldo akun.
     * 
     * @param balance saldo yang akan diatur pada akun
     */
	public void setBalance(long balance)
	{
		this.balance = balance;
	}

    /**
     * Mengambil nomor akun.
     * 
     * @return nomor akun
     */
	public String getAccno()
	{
		return accno;
	}

    /**
     * Mengatur nomor akun.
     * 
     * @param accno nomor akun yang akan diatur
     */
	public void setAccno(String accno)
	{
		this.accno = accno;
	}

    /**
     * Mengambil jenis akun.
     * 
     * @return jenis akun
     */
	public String getAcc_type() 
	{
		return acc_type;
	}

    /**
     * Mengatur jenis akun.
     * 
     * @param acc_type jenis akun yang akan diatur
     */
	public void setAcc_type(String acc_type) 
	{
		this.acc_type = acc_type;
	}
}
