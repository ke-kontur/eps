
package ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о документе, по которому осуществляется перевозка товаров/о документе обеспечения
 */
public class CustomsGuaranteeDocType extends DocumentBaseType
{
    private String documentKind;
    private String contractNumber;
    private LocalDate contractDate;

    /** 
     * Get the 'DocumentKind' element value. Тип документа, по которому осуществляется перевозка товаров/Тип документа обеспечения: 1 - ДТ; 2 - ТД; 3 - книжка МДП; 4 - Сертификат; 5 - ТПО; 6 - ТР; 7 - дополнение к договору поручительства; 8 - банковская гарантия; 9 - заявление на включение в реестр; 10 - свидетельство о включение в реестр
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. Тип документа, по которому осуществляется перевозка товаров/Тип документа обеспечения: 1 - ДТ; 2 - ТД; 3 - книжка МДП; 4 - Сертификат; 5 - ТПО; 6 - ТР; 7 - дополнение к договору поручительства; 8 - банковская гарантия; 9 - заявление на включение в реестр; 10 - свидетельство о включение в реестр
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    /** 
     * Get the 'ContractNumber' element value. Номер договора поручительства
     * 
     * @return value
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /** 
     * Set the 'ContractNumber' element value. Номер договора поручительства
     * 
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /** 
     * Get the 'ContractDate' element value. Дата договора поручительства
     * 
     * @return value
     */
    public LocalDate getContractDate() {
        return contractDate;
    }

    /** 
     * Set the 'ContractDate' element value. Дата договора поручительства
     * 
     * @param contractDate
     */
    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }
}
