/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class DiseaseWorkRequest extends WorkRequest{
    
    private String diseaseinfo;

    public String getDiseaseinfo() {
        return diseaseinfo;
    }

    public void setDiseaseinfo(String diseaseinfo) {
        this.diseaseinfo = diseaseinfo;
    }

   @Override
    public String toString()
    {
        return getDiseaseinfo();
    }
    
}
