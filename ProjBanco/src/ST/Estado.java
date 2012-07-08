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
	
	/**
	 * declaracao da XStream transformacao das classes em  XML
	 */
	XStream xstream = new XStream(new StaxDriver());

	/**
	 * Este metodo he responcavel pela percistencia do banco em hd 
	 * esta recebe uma string XStream em formato XML, salvando este arquivo em hd
	 */
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

	/**
	 * Este metodo quando é envocado retorna String XML do banco, que sera tranformado em uma classe Banco,
	 * apos ser enviado ha o metodo XMLtoBC(despersistido).
	 */
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

	/**
	 * metodo que recebe um objeto Banco faz a persistencia para uma String XStream, e retorna uma String XML,
	 *  que representa um objeto Banco. 
	 */
	public String BCtoXML(Banco bbanco){

		String Bcxml = xstream.toXML(bbanco);


		return Bcxml;

	}

	/**
	 * metodo tranforma uma XMLBC em uma calsse Banco e retorna esta calsse transformada
	 */
	public Banco XMLtoBC(String xml){

		Banco newbc = (Banco)xstream.fromXML(xml);

		return newbc;

	}
	
	/**
	 *este metodo tranforma um arquivo salvo XML em um Hashmap<String, ClienteBancario > retornando o mesmo
	 */
	@SuppressWarnings("unchecked")
	public HashMap<String, ClienteBancario> XMLtoCL(String xml){

		
		HashMap<String, ClienteBancario> newcl = (HashMap<String, ClienteBancario>)xstream.fromXML(xml);

		return newcl;

	}
	
	/**
	 * Este metodo faz o Streaming em hd de dos arquivos XML da classe Agencia e classe Cliente bancario ,transformados 
	 * nos metodos AGtoXML e CLtoXML.
	 */
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

	/**
	 * Este metodo quando é envocado retorna String XML do Agencias, que sera tranformado de Agencias da classe Banco, apos ser enviado 
	 * ha o metodo XMLtoAg(despersistido).
	 */
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
	
	/**
	 *este metodo tranforma um arquivo salvo XML em um Hashmap<String, ClienteBancario > retornandop o mesmo
	 */
	@SuppressWarnings("unchecked")
	public HashMap<String, Agencia> XMLtoAG(String xml){

		HashMap<String, Agencia> newag = (HashMap<String, Agencia>)xstream.fromXML(xml);

		return newag;

	}

	/**
	 *este metodo tranforma uma classe agencia em uma arquivo XML por intermedio do XStream e retornando este arquivo XML
	 */
	public String AGtoXML(HashMap<String, Agencia> agencia){

		String agxml = xstream.toXML(agencia);

		
		return agxml;

	}
	
	/**
	 * Este metodo quando é envocado retorna String XML do Hahsmap LiataClientebancario, que sera tranformado 
	 * em uma hashmap da classe Banco, apos ser enviado ha o metodo XMLtoBC(despersistido).
	 */
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

	/**
	 * Este metodo transforma um hashMap da classe Banco em um arquivo XML
	 * @param listaClienteDoBanco
	 * @return
	 */
	
	public String CLtoXML(HashMap<String, ClienteBancario> listaClienteDoBanco){
		

		String clxml = xstream.toXML(listaClienteDoBanco);


		return clxml;

	}
	
	

	
	/**
	 * Construtor generico
	 */
	public Estado() {
		// TODO Auto-generated constructor stub
	}

}
