
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Дополнительные сведения по внешнеторговым контрактам. Для РФ
 */
public class ESADContractListType
{
    private String dealPassportNumber;
    private String contractNumber;
    private LocalDate contractDate;
    private String bankName;
    private List<SupplyInformationsType> supplyInformationList = new ArrayList<SupplyInformationsType>();
    private List<DocumentBaseType> additionalContractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'DealPassportNumber' element value. Номер паспорта сделки
     * 
     * @return value
     */
    public String getDealPassportNumber() {
        return dealPassportNumber;
    }

    /** 
     * Set the 'DealPassportNumber' element value. Номер паспорта сделки
     * 
     * @param dealPassportNumber
     */
    public void setDealPassportNumber(String dealPassportNumber) {
        this.dealPassportNumber = dealPassportNumber;
    }

    /** 
     * Get the 'ContractNumber' element value. Номер внешнеторгового контракта
     * 
     * @return value
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /** 
     * Set the 'ContractNumber' element value. Номер внешнеторгового контракта
     * 
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /** 
     * Get the 'ContractDate' element value. Дата внешнеторгового контракта
     * 
     * @return value
     */
    public LocalDate getContractDate() {
        return contractDate;
    }

    /** 
     * Set the 'ContractDate' element value. Дата внешнеторгового контракта
     * 
     * @param contractDate
     */
    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    /** 
     * Get the 'BankName' element value. Наименование банка, оформившего паспорт сделки
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Наименование банка, оформившего паспорт сделки
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the list of 'SupplyInformations' element items. Описание поставки товаров.
     * 
     * @return list
     */
    public List<SupplyInformationsType> getSupplyInformationList() {
        return supplyInformationList;
    }

    /** 
     * Set the list of 'SupplyInformations' element items. Описание поставки товаров.
     * 
     * @param list
     */
    public void setSupplyInformationList(List<SupplyInformationsType> list) {
        supplyInformationList = list;
    }

    /** 
     * Get the list of 'AdditionalContract' element items. Дополнения и приложения к основному контракту.
     * 
     * @return list
     */
    public List<DocumentBaseType> getAdditionalContractList() {
        return additionalContractList;
    }

    /** 
     * Set the list of 'AdditionalContract' element items. Дополнения и приложения к основному контракту.
     * 
     * @param list
     */
    public void setAdditionalContractList(List<DocumentBaseType> list) {
        additionalContractList = list;
    }
}
