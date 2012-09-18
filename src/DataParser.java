import java.io.*;
import java.util.ArrayList;

public class DataParser {

	/**
	 * Parse Data from csv file to Arraylist
	 * @param fileReader of csv file
	 * @param dataout Parsed data
	 * @throws FileNotFoundException error if file not Found
	 */
	public DataParser(FileReader fileReader,ArrayList<String[]> dataout) throws FileNotFoundException
	{
		BufferedReader CSVFile;
		String dataRow = null;
		try {
			CSVFile = new BufferedReader(fileReader);
			while ((dataRow = CSVFile.readLine()) != null)   {
				dataout.add(dataRow.split(";"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Data parser tester
	 * @param args no parameter needed
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String[]> data = new ArrayList<String[]>();
		int i=0;
		try {

			DataParser dataParser = new DataParser(new FileReader("Musees.csv"), data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int j = 0; j < data.size(); j++) {
			System.out.println(data.get(j)[0]);
		}

	} //main()


} // DataParser