import java.io.BufferedReader;
import java.io.FileReader;

public class HomeTask3 {
    public static void main(String[] args) throws Exception {

        String dataFile = "file.txt";
        String[] infoBase;
        StringBuilder stringBuilder = new StringBuilder();

		try (BufferedReader bufferReader = new BufferedReader(new FileReader(dataFile))) {
			String line;
            while ((line = bufferReader.readLine()) != null) {
                infoBase = line.replace("\"", "").split(":|,");
				stringBuilder.append("Студент ").append(infoBase[1]).append(" получил ").append(infoBase[3])
                .append(" по предмету ").append(infoBase[5]).append(".\n");
			}
            System.out.println(stringBuilder);
		}
                catch (Exception e) {
			e.printStackTrace();
		}
    }
}
