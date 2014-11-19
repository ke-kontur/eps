
package ru.acs.fts.schemas.album.inqinotreatment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 *  онтракт или иные документы, в соответствии с которыми товары ввоз€тс€ /вывоз€тс€  на переработку
 */
public class TreatContractsType extends DocumentBaseType
{
    private String companyCountry;
    private String companyName;

    /** 
     * Get the 'CompanyCountry' element value. —трана, где расположена иностранна€ организаци€
     * 
     * @return value
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    /** 
     * Set the 'CompanyCountry' element value. —трана, где расположена иностранна€ организаци€
     * 
     * @param companyCountry
     */
    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    /** 
     * Get the 'CompanyName' element value. Ќаименование иностранной организации
     * 
     * @return value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'CompanyName' element value. Ќаименование иностранной организации
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
