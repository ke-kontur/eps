
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Импортер
 */
public class ImporterType extends OrganizationType
{
    private String importerIndex;
    private String VATNumber;

    /** 
     * Get the 'ImporterIndex' element value. Индекс импортера
     * 
     * @return value
     */
    public String getImporterIndex() {
        return importerIndex;
    }

    /** 
     * Set the 'ImporterIndex' element value. Индекс импортера
     * 
     * @param importerIndex
     */
    public void setImporterIndex(String importerIndex) {
        this.importerIndex = importerIndex;
    }

    /** 
     * Get the 'VAT_Number' element value. Номер НДС
     * 
     * @return value
     */
    public String getVATNumber() {
        return VATNumber;
    }

    /** 
     * Set the 'VAT_Number' element value. Номер НДС
     * 
     * @param VATNumber
     */
    public void setVATNumber(String VATNumber) {
        this.VATNumber = VATNumber;
    }
}
