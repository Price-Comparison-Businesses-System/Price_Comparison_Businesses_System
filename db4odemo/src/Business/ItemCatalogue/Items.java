/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ItemCatalogue;

/**
 *
 * @author tarushukla
 */
public class Items {
    private String name;
    private String desc;
    private String price;
    private int quantity;
    private String state;
    private String sellertailorname;
    private String services;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSellertailorname() {
        return sellertailorname;
    }

    public void setSellertailorname(String sellertailorname) {
        this.sellertailorname = sellertailorname;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
    

    public Items(String name, String desc, String price, int quantity, String state, String sellertailorname, String services) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
        this.state = state;
        this.sellertailorname = sellertailorname;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
