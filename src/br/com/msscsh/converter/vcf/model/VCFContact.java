package br.com.msscsh.converter.vcf.model;

import java.rmi.dgc.Lease;

/**
 * Classe para representação de uma dado do VCF
 */
public class VCFContact {

    private String name;
    private String lastName;
    private String number;

    public String getFullName(){
        return name + lastName; //TODO there is no criteia for empty names part
    }

    public String getNumber(){
        return number;
    }

}