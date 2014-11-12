
package ru.acs.fts.schemas.album.gtdobligation;

import org.joda.time.LocalDate;

/** 
 * Таможенный представитель (брокер)
 */
public class CustBrokerType
{
    private String abbreviationCustBrokerName;
    private String brokerReestrNumber;
    private LocalDate brokerReestrDate;
    private String documentModeCode;

    /** 
     * Get the 'AbbreviationCustBrokerName' element value. Сокращенное наименование таможенного представителя
     * 
     * @return value
     */
    public String getAbbreviationCustBrokerName() {
        return abbreviationCustBrokerName;
    }

    /** 
     * Set the 'AbbreviationCustBrokerName' element value. Сокращенное наименование таможенного представителя
     * 
     * @param abbreviationCustBrokerName
     */
    public void setAbbreviationCustBrokerName(String abbreviationCustBrokerName) {
        this.abbreviationCustBrokerName = abbreviationCustBrokerName;
    }

    /** 
     * Get the 'BrokerReestrNumber' element value. Номер Свидетельства о включении в Реестр таможенных представителей
     * 
     * @return value
     */
    public String getBrokerReestrNumber() {
        return brokerReestrNumber;
    }

    /** 
     * Set the 'BrokerReestrNumber' element value. Номер Свидетельства о включении в Реестр таможенных представителей
     * 
     * @param brokerReestrNumber
     */
    public void setBrokerReestrNumber(String brokerReestrNumber) {
        this.brokerReestrNumber = brokerReestrNumber;
    }

    /** 
     * Get the 'BrokerReestrDate' element value. Дата выдачи Свидетельства о включении в Реестр таможенных представителей
     * 
     * @return value
     */
    public LocalDate getBrokerReestrDate() {
        return brokerReestrDate;
    }

    /** 
     * Set the 'BrokerReestrDate' element value. Дата выдачи Свидетельства о включении в Реестр таможенных представителей
     * 
     * @param brokerReestrDate
     */
    public void setBrokerReestrDate(LocalDate brokerReestrDate) {
        this.brokerReestrDate = brokerReestrDate;
    }

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера ); 3 - свидетельство таможенного представителя
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера ); 3 - свидетельство таможенного представителя
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
