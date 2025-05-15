package models;

public class Customer {
    private String customerName;
    private String customerNumber;
    private int customerID;
    private int rewardPoints;
    private int moneySpent;
    private String membershipLevel;
    private int donationsMade;

    public Customer(String customerName, String customerNumber, int customerID, int rewardPoints, int moneySpent, String membershipLevel) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.customerID = customerID;
        this.rewardPoints = rewardPoints;
        this.moneySpent = moneySpent;
        this.membershipLevel = membershipLevel;
    }

    public void updateMembership(){
        if (moneySpent >= 100){
            membershipLevel = "Gold";
        } else if (moneySpent >= 50){
            membershipLevel = "Silver";
        } else {
            membershipLevel = "Bronze";
        }
    }

    public int getDonationsMade() {
        return donationsMade;
    }

    public void addDonation(int amount) {
        this.donationsMade += amount;
    }

    public String getMembershipLevel(){

        return membershipLevel;
    }

    public String getCustomerName(){

        return customerName;
    }

    public String getCustomerNumber(){

        return customerNumber;
    }

    public int getCustomerID(){

        return customerID;
    }

    public int getRewardPoints(){

        return rewardPoints;
    }

    public int getMoneySpent(){
        return moneySpent;
    }

    public void setCustomerName(String newName){
        this.customerName = newName;
    }

    public void setCustomerNumber(String newNumber){
        this.customerNumber = newNumber;
    }

    public void setCustomerID(int newID){
        this.customerID = newID;
    }

    public void setRewardPoints(int newRewardPoints){
        this.rewardPoints = newRewardPoints;
    }

    public void setMoneySpent(int newMoneySpent){
        this.moneySpent = newMoneySpent;
    }

    public void setMembershipLevel(String newMembershipLevel){
        this.membershipLevel = newMembershipLevel;
    }
}