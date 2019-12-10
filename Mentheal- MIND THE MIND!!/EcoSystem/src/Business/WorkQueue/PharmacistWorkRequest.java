/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author steve
 */
public class PharmacistWorkRequest  extends WorkRequest{
     private String pharmainfo;

    public String getPharmainfo() {
        return pharmainfo;
    }

    public void setPharmainfo(String pharmainfo) {
        this.pharmainfo = pharmainfo;
    }
@Override
    public String toString()
    {
        return getPharmainfo();
    }
    
    
}
