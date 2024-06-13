package createFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        String data = "Conteudo a ser gravado no arquivo: ";
        System.out.println(data);
        Scanner leitura = new Scanner(System.in);
        String dataFile = "";
        dataFile = leitura.nextLine();

        try (FileWriter writer = new FileWriter("arquivo.txt")){
            writer.write(dataFile);
            writer.close();
            System.out.println("Dados gravados com sucesso!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
