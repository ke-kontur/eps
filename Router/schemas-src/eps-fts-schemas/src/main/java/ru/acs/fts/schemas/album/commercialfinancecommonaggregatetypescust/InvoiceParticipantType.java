
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Сведения об участниках сделки по  купли-продажи (продавец или покупатель)
 */
public class InvoiceParticipantType
{
    private String companyID;
    private String KPPCode;
    private String name;
    private String phone;

    /** 
     * Get the 'CompanyID' element value. Индивидуальный номер налогоплательщика  в соответствии с национальной системой кодирования (в РФ для юр. лиц - ИНН)
     * 
     * @return value
     */
    public String getCompanyID() {
        return companyID;
    }

    /** 
     * Set the 'CompanyID' element value. Индивидуальный номер налогоплательщика  в соответствии с национальной системой кодирования (в РФ для юр. лиц - ИНН)
     * 
     * @param companyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /** 
     * Get the 'KPPCode' element value. Код причины постановки на налоговый учет
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. Код причины постановки на налоговый учет
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }

    /** 
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Phone' element value. Телефон
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Телефон
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
