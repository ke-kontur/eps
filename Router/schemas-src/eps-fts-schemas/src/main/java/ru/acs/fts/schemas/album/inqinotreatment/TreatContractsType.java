
package ru.acs.fts.schemas.album.inqinotreatment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Контракт или иные документы, в соответствии с которыми товары ввозятся /вывозятся  на переработку
 */
public class TreatContractsType extends DocumentBaseType
{
    private String companyCountry;
    private String companyName;

    /** 
     * Get the 'CompanyCountry' element value. Страна, где расположена иностранная организация
     * 
     * @return value
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    /** 
     * Set the 'CompanyCountry' element value. Страна, где расположена иностранная организация
     * 
     * @param companyCountry
     */
    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    /** 
     * Get the 'CompanyName' element value. Наименование иностранной организации
     * 
     * @return value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'CompanyName' element value. Наименование иностранной организации
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
