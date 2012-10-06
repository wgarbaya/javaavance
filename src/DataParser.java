import java.io.*;
import java.util.ArrayList;

public class DataParser {
	ArrayList<String[]> data=null;
	int lat;
	int lon;
	int name;
	int size;
	/**
	 * Dataparser for CSV
	 * @param fileReader file to parse
	 * @param name row num of mnt
	 * @param lat row num of latitude
	 * @param lon row num of longitude
	 * @throws FileNotFoundException
	 */
	public DataParser(FileReader fileReader,int name,int lat,int lon) throws FileNotFoundException
	{

		BufferedReader CSVFile;
		String dataRow = null;
		data = new ArrayList<String[]>() ;
		this.lat=lat;
		this.lon=lon;
		this.name=name;
		try {
			CSVFile = new BufferedReader(fileReader);
			while ((dataRow = CSVFile.readLine()) != null)   {
				data.add(dataRow.split(";"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.size=data.size();
		System.out.println("created");
	}
	/**
	 * get latitude by Id
	 * @param id
	 * @return
	 */
	public String getLatById(int id){

		return data.get(id)[lat];

	}
	/**
	 * get longitude by Id
	 * @param id
	 * @return
	 */
	public String getLonById(int id){

		return data.get(id)[lon];

	}
	/**
	 * get longitude by Id
	 * @param id
	 * @return
	 */
	public String getNameById(int id){
		return data.get(id)[name];

	}


	/**
	 * Data parser tester
	 * @param args no parameter needed
	 */
	public static void main(String[] args) {


	} //main()


} // DataParser