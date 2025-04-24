package org.javapractice;

import org.codetemplates.Collections;

public class OOPs {

}

class PClass extends GPClass{

    PClass(String firstName, String middleName, String surName) {
        super(firstName, middleName, surName);
    }

    @Override
    public void setSurName(String surName) {
        System.out.println("surname is getting change post marriage");
        super.setSurName(surName);
    }

    private int BankBalance;

    public int getBankBalance() {
        return BankBalance;
    }
}

class GPClass{
    private String firstName;
    private String middleName;
    private String surName;

    GPClass(String firstName, String middleName, String surName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public String getSurName(){
        return this.surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }
}

class CClass extends PClass{

    CClass(String firstName, String middleName, String surName) {
        super(firstName, middleName, surName);
    }

    @Override
    public int getBankBalance() {
        return super.getBankBalance() + 2000;
    }

    public int getBankBalance(int myBankBalance){
        return super.getBankBalance() + myBankBalance;
    }

    public int getBankBalance(int myBankBalance, float interestEarned){
        return (int) (super.getBankBalance() + myBankBalance + interestEarned);
    }

    public String familyMembers(String[] familyMembers){
        Collections.printArray(familyMembers);
        return familyMembers[0];
    }

}