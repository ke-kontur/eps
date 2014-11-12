
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Контракт или иные документы, в соответствии с которыми товары ввозятся   на переработку
 */
public class BaseTreatmentDocsType extends DocumentBaseType
{
    private String companyName;

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
