/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, String streetaddress, String city, String country, int zipcode, String email, Enterprise.EnterpriseType type, String phone){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Automobile){
            enterprise = new HospitalEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Clothing){
            enterprise = new EateriesEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.HealthCare){
            enterprise = new ServiceEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Electronics){
            enterprise = new EssentialsEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.FoodProducts){
            enterprise = new RetailEnterprise(name, streetaddress, city, country, zipcode, email, phone);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    public Enterprise getEnterprise(String name){
        for(Enterprise e : enterpriseList){
            if(e.getOrgName().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }
}
