/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name, String streetaddress, String city, String country, int zipcode, String email, String phone){
        Organization organization = null;
        if (type.getValue().equals(Type.BuyCar.getValue())){
            organization = new DoctorOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RentCar.getValue())){
            organization = new LabOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CarRideServices.getValue())){
            organization = new CleaningOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ReadyMadeClothes.getValue())){
            organization = new MechanicOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BuyFabric.getValue())){
            organization = new ElectricianOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TailorService.getValue())){
            organization = new WholesaleOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ElectronicKit.getValue())){
            organization = new PlumbingOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SpareParts.getValue())){
            organization = new SuppliersOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Accessories.getValue())){
            organization = new VendorsOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization = new DeliveryOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VeggiesFruits.getValue())){
            organization = new FactoriesOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FrozenPackaged.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Medicine.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DoctorsTherapists.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Hospitals.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsurancePlanService.getValue())){
            organization = new TransportOrganization(name, streetaddress, city, country, zipcode, email, phone);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void removeOrganization(Organization org){
        organizationList.remove(org);
    }
    
    public Organization getOrganization(String name){
        for(Organization o : organizationList){
            if(o.getOrgName().equalsIgnoreCase(name)){
                return o;
            }
        }
        return null;
    }
}
