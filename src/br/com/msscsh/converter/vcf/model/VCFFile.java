package br.com.msscsh.converter.vcf.model;

import java.rmi.dgc.Lease;

/**
 * Classe para representação do arquivo de exportação
 */
public class VCFFiLe {

    private String fileName;
    private List<VCFContact> lines;


    public List<VCFContact> getLines() {
        return this.lines;
    }

    public String getFileName() {
        return this.fileName;
    }

}