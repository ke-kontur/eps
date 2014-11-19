
package ru.acs.fts.schemas.album.gtdobligationin;

import org.joda.time.LocalDate;

/** 
 * ���������� ������������� (������)
 */
public class CustBrokerType
{
    private String abbreviationCustBrokerName;
    private String brokerReestrNumber;
    private LocalDate brokerReestrDate;
    private String documentModeCode;

    /** 
     * Get the 'AbbreviationCustBrokerName' element value. ����������� ������������ ����������� �������������
     * 
     * @return value
     */
    public String getAbbreviationCustBrokerName() {
        return abbreviationCustBrokerName;
    }

    /** 
     * Set the 'AbbreviationCustBrokerName' element value. ����������� ������������ ����������� �������������
     * 
     * @param abbreviationCustBrokerName
     */
    public void setAbbreviationCustBrokerName(String abbreviationCustBrokerName) {
        this.abbreviationCustBrokerName = abbreviationCustBrokerName;
    }

    /** 
     * Get the 'BrokerReestrNumber' element value. ����� ������������� � ��������� � ������ ���������� ��������������
     * 
     * @return value
     */
    public String getBrokerReestrNumber() {
        return brokerReestrNumber;
    }

    /** 
     * Set the 'BrokerReestrNumber' element value. ����� ������������� � ��������� � ������ ���������� ��������������
     * 
     * @param brokerReestrNumber
     */
    public void setBrokerReestrNumber(String brokerReestrNumber) {
        this.brokerReestrNumber = brokerReestrNumber;
    }

    /** 
     * Get the 'BrokerReestrDate' element value. ���� ������ ������������� � ��������� � ������ ���������� ��������������
     * 
     * @return value
     */
    public LocalDate getBrokerReestrDate() {
        return brokerReestrDate;
    }

    /** 
     * Set the 'BrokerReestrDate' element value. ���� ������ ������������� � ��������� � ������ ���������� ��������������
     * 
     * @param brokerReestrDate
     */
    public void setBrokerReestrDate(LocalDate brokerReestrDate) {
        this.brokerReestrDate = brokerReestrDate;
    }

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���������:2 - ������������� �����������  ������������� (������� ); 3 - ������������� ����������� �������������
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������:2 - ������������� �����������  ������������� (������� ); 3 - ������������� ����������� �������������
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
