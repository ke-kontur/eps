
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;

/** 
 * ������� ������ ���.��. 11, 20, 22, 23,  24
 */
public class KTDinMainContractTermsType extends CUESADMainContractTermsType
{
    private String tradeDigitCountryCode;
    private String contractDigitCurrencyCode;

    /** 
     * Get the 'TradeDigitCountryCode' element value. �������� ��� ��������� ������
     * 
     * @return value
     */
    public String getTradeDigitCountryCode() {
        return tradeDigitCountryCode;
    }

    /** 
     * Set the 'TradeDigitCountryCode' element value. �������� ��� ��������� ������
     * 
     * @param tradeDigitCountryCode
     */
    public void setTradeDigitCountryCode(String tradeDigitCountryCode) {
        this.tradeDigitCountryCode = tradeDigitCountryCode;
    }

    /** 
     * Get the 'ContractDigitCurrencyCode' element value. �������� ��� ������ ���� ��������.
     * 
     * @return value
     */
    public String getContractDigitCurrencyCode() {
        return contractDigitCurrencyCode;
    }

    /** 
     * Set the 'ContractDigitCurrencyCode' element value. �������� ��� ������ ���� ��������.
     * 
     * @param contractDigitCurrencyCode
     */
    public void setContractDigitCurrencyCode(String contractDigitCurrencyCode) {
        this.contractDigitCurrencyCode = contractDigitCurrencyCode;
    }
}
