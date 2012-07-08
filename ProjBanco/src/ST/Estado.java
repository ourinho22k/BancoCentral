/**
 * 
 */
package ST;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import AG.Agencia;
import BC.Banco;
import CL.ClienteBancario;

/**
 * @author fil
 *
 */
public class Estado {

	XStream xstream = new XStream(new StaxDriver());

	public boolean salvaEstadoBC(String  Bcxml){


		try{

			FileOutputStream fos = new FileOutputStream("Bcxml.ser");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(Bcxml);

			oos.close();

			return true;

		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public String recuperaEstadoBC(){

		try{

			FileInputStream fis = new FileInputStream("Bcxml.ser");

			ObjectInputStream ois = new ObjectInputStream(fis);

			String bc = (String) ois.readObject();

			ois.close();

			return bc;

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public String BCtoXML(Banco bbanco){

		String Bcxml = xstream.toXML(bbanco);


		return Bcxml;

	}

	public Banco XMLtoBC(String xml){

		Banco newbc = (Banco)xstream.fromXML(xml);

		return newbc;

	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String, ClienteBancario> XMLtoCL(String xml){

		
		HashMap<String, ClienteBancario> newcl = (HashMap<String, ClienteBancario>)xstream.fromXML(xml);

		return newcl;

	}
	
	public boolean salvaEstadoAG(String  AGxml, String CLxml){


		try{

			FileOutputStream fos = new FileOutputStream("AGxml.ser");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(AGxml);

			oos.close();


			FileOutputStream fosC = new FileOutputStream("CLxml.ser");

			ObjectOutputStream oosC = new ObjectOutputStream(fosC);

			oosC.writeObject(CLxml);

			oosC.close();


			return true;

		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}

	public String recuperaEstadoAG(){

		try{

			FileInputStream fis = new FileInputStream("AGxml.ser");

			ObjectInputStream ois = new ObjectInputStream(fis);

			String ag = (String) ois.readObject();

			ois.close();

			return ag;

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String, Agencia> XMLtoAG(String xml){

		HashMap<String, Agencia> newag = (HashMap<String, Agencia>)xstream.fromXML(xml);

		return newag;

	}

	public String AGtoXML(HashMap<String, Agencia> agencia){

		String agxml = xstream.toXML(agencia);

		
		return agxml;

	}
	
	public String recuperaEstadoCLI(){

		try{

			FileInputStream fisCL = new FileInputStream("CLxml.ser");

			ObjectInputStream oisCL = new ObjectInputStream(fisCL);

			String cl = (String) oisCL.readObject();

			oisCL.close();

			return cl;

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	
	
	public String CLtoXML(HashMap<String, ClienteBancario> listaClienteDoBanco){
		

		String clxml = xstream.toXML(listaClienteDoBanco);


		return clxml;

	}
	
	

	
	/**
	 * 
	 */
	public Estado() {
		// TODO Auto-generated constructor stub
	}

}
