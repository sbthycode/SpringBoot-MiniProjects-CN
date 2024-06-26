package com.example.tax;

public class IncomeTax implements Tax {
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	double taxableAmount = 0.0;
	double taxAmount = 0.0;
	boolean isTaxPayed;
	
	public IncomeTax(){
		this.isTaxPayed = false;
		
	}
	
	@Override
	public void setTaxableAmount(int amount) {
		taxableAmount = amount;
	}
	
	@Override
	public void calculateTaxAmount() {
		if(taxableAmount<300000.0) {
			taxAmount = 0;
		}
		else if(taxableAmount>300000.0 && taxableAmount<600000.0) {
			taxAmount = taxableAmount * 0.05;
		}
		else if(taxableAmount>600000.0 && taxableAmount<900000.0){
			taxAmount = taxableAmount * 0.1;
		}
		else if(taxableAmount>900000.0 && taxableAmount<1200000.0){
			taxAmount = taxableAmount * 0.15;
		}
		else if(taxableAmount>1200000.0 && taxableAmount<1500000.0){
			taxAmount = taxableAmount * 0.2;
		}
		else {
			taxAmount = taxableAmount * 0.3;
		}
	}
	
	@Override
	public double getTaxAmount() {
		return taxAmount;
	}
	
	@Override
	public String getTaxType() {
		return "income";
	}
	
	@Override
	public boolean isTaxPayed() {
		return isTaxPayed;
	}
	
	@Override
	public void payTax() {
		System.out.println("Tax is payed");
		isTaxPayed = true;
	}
	
	
}
