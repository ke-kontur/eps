
package ru.acs.fts.schemas.album.invoice;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractDeliveryTermsType;

/** 
 * �������� ������� �������� � �������
 */
public class InvoiceDeliveryTermsType extends ContractDeliveryTermsType
{
    private String dispatchCountryCode;
    private String tradingCountryCode;
    private String destinationCountryCode;
    private LocalDate deadline;

    /** 
     * Get the 'DispatchCountryCode' element value. ��� ������ ����������� 
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. ��� ������ ����������� 
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'TradingCountryCode' element value. ��� ��������� ������
     * 
     * @return value
     */
    public String getTradingCountryCode() {
        return tradingCountryCode;
    }

    /** 
     * Set the 'TradingCountryCode' element value. ��� ��������� ������
     * 
     * @param tradingCountryCode
     */
    public void setTradingCountryCode(String tradingCountryCode) {
        this.tradingCountryCode = tradingCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ��� ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ��� ������ ����������
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'Deadline' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. ���� ��������
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
