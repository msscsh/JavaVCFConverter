package br.com.msscsh.converter.vcf.tool;

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

        StringBuilder fileContent = new StringBuilder("");

        for ( VCFContact row : file.getLines() ) {

            String contact = "BEGIN:VCARD" + 
            "VERSION:4.0" + 
            "FN:FullName" + row.getFullName();
            "N:Suffix" + 
            "TEL;TYPE=" + row.getNumber();
            "END:VCARD\n";

            fileContent.append(contact);

        }

        //Do something
    }

}