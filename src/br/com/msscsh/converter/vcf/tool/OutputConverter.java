package br.com.msscsh.converter.vcf.tool;

import java.io.File;
import java.io.FileWriter;

/**
 * Classe responsavel pela conversão
 * 
 * Formato:
 * 
 * BEGIN:VCARD
 * VERSION:4.0
 * FN:FullName
 * N:Suffix
 * TEL;TYPE=cell:(55) 55555-5555
 * END:VCARD
 * 
 */
public class OutputConverter {

    public static void convertToFile(VCSFile file) {
        createFileWithContent(file.getFileName, createContent(file.getLines()));
    }

    public static String createContent(List<VCFContact> rows) {

        StringBuilder fileContent = new StringBuilder("");

        for ( VCFContact row : rows ) {

            String contact = "BEGIN:VCARD" + "\\n" +
            "VERSION:4.0" + "\\n" +
            "FN:FullName" + row.getGrouper().toUpperCase() + " " + row.getFullName() + "\\n" +
            "N:Suffix" + "\\n" +
            "TEL;TYPE=" + row.getNumber() + "\\n" +
            "END:VCARD\\n";

            fileContent.append(contact);

        }

        return fileContent.toString();

    }

    public static File createFileWithContent(String fileName, String content) {

        try {

            FileWriter vcsFile = new FileWriter(fileName);
            vcsFile.write(content);
            vcsFile.close();

        } catch (Exception e) {
            e.printStackTrace("ERR 001: Falha na criação do arquivo");
        }

        return vcsFile;

    }

}
