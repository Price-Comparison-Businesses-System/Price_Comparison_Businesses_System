/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.WorkQueue.WorkQueue;
import java.util.Random;
/**
 *
 * @author tarushukla
 */
public abstract class Organization {
    private String OrgName;
    private int OrgPhone;
    private String OrgType;
    private String OrgAddress;
    private String OrgCountry;
    private String OrgCity;

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public int getOrgPhone() {
        return OrgPhone;
    }

    public void setOrgPhone(int OrgPhone) {
        this.OrgPhone = OrgPhone;
    }

    public String getOrgType() {
        return OrgType;
    }

    public void setOrgType(String OrgType) {
        this.OrgType = OrgType;
    }

    public String getOrgAddress() {
        return OrgAddress;
    }

    public void setOrgAddress(String OrgAddress) {
        this.OrgAddress = OrgAddress;
    }

    public String getOrgCountry() {
        return OrgCountry;
    }

    public void setOrgCountry(String OrgCountry) {
        this.OrgCountry = OrgCountry;
    }

    public String getOrgCity() {
        return OrgCity;
    }

    public void setOrgCity(String OrgCity) {
        this.OrgCity = OrgCity;
    }

    public int getOrgZipCode() {
        return OrgZipCode;
    }

    public void setOrgZipCode(int OrgZipCode) {
        this.OrgZipCode = OrgZipCode;
    }

    public String getOrgEmail() {
        return OrgEmail;
    }

    public void setOrgEmail(String OrgEmail) {
        this.OrgEmail = OrgEmail;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrgID() {
        return OrgID;
    }

    public void setOrgID(int OrgID) {
        this.OrgID = OrgID;
    }
    private int OrgZipCode;
    private String OrgEmail;
    private WorkQueue workQueue;
    private int OrgID;
    
    
     public enum OrgType{
        Admin("Admin Organization"), BuyCar("Buy Car"), RentCar("Rent Car"), CarRideServices("Car Ride Services"), ReadyMadeClothes("Ready Made Clothes"), BuyFabric("Buy Fabric"), TailorService("Tailor Service"), ElectronicKit("Electronic Kit"), SpareParts("Spare Parts"), Accessories("Accessories"), Restaurant("Restaurant"), VeggiesFruits("Veggies Or Fruits"), FrozenPackaged("Frozen or Packaged"), Medicine("Medicine"), DoctorsTherapists("Doctors or Therapists"), Hospitals("Hospital"), InsurancePlanService("Insurance Plan Service");
        private String value;
        private OrgType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
      public Organization(String OrgType, String OrgName, String OrgAddress, String OrgCity, String OrgCountry, int OrgZipCode, String OrgEmail, int OrgPhone) {
        this.OrgName = OrgName;
        this.OrgType = OrgType;
        this.OrgAddress = OrgAddress;
        this.OrgEmail = OrgEmail;
        this.OrgCountry = OrgCountry;
        this.OrgCity = OrgCity;
        this.OrgZipCode = OrgZipCode;
        this.OrgPhone = OrgPhone;
        workQueue = new WorkQueue();
        OrgID = gen();
        
    }
      public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    
}
