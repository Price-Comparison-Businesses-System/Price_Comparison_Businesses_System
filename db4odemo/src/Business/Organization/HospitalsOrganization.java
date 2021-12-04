/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

/**
 *
 * @author tarushukla
 */
public class HospitalsOrganization extends Organization{
    
    public HospitalsOrganization(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, int OrgZipCode, String OrgEmail, String OrgPhone) {
        super(Organization.Type.Hospitals.getValue(), OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }
    
}
