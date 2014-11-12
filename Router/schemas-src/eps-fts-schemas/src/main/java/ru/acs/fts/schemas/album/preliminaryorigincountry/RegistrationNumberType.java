
package ru.acs.fts.schemas.album.preliminaryorigincountry;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String indexManagement;
    private String caseNumber;
    private String serialNumber;

    /** 
     * Get the 'IndexManagement' element value. Индекс Управления
     * 
     * @return value
     */
    public String getIndexManagement() {
        return indexManagement;
    }

    /** 
     * Set the 'IndexManagement' element value. Индекс Управления
     * 
     * @param indexManagement
     */
    public void setIndexManagement(String indexManagement) {
        this.indexManagement = indexManagement;
    }

    /** 
     * Get the 'CaseNumber' element value. Номер дела по номенклатуре дел Управления
     * 
     * @return value
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /** 
     * Set the 'CaseNumber' element value. Номер дела по номенклатуре дел Управления
     * 
     * @param caseNumber
     */
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый исходящий номер предварительного решения в Управлении
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый исходящий номер предварительного решения в Управлении
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
