/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class TransportEnterprise extends Enterprise{
    public TransportEnterprise(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, String OrgZipCode, String OrgEmail, String OrgPhone) {
        super(OrgName,Enterprise.EnterpriseType.Transport, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }
 @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
