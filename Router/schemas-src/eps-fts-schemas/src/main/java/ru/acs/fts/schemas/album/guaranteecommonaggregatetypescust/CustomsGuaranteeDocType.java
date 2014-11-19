
package ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ���������, �� �������� �������������� ��������� �������/� ��������� �����������
 */
public class CustomsGuaranteeDocType extends DocumentBaseType
{
    private String documentKind;
    private String contractNumber;
    private LocalDate contractDate;

    /** 
     * Get the 'DocumentKind' element value. ��� ���������, �� �������� �������������� ��������� �������/��� ��������� �����������: 1 - ��; 2 - ��; 3 - ������ ���; 4 - ����������; 5 - ���; 6 - ��; 7 - ���������� � �������� ��������������; 8 - ���������� ��������; 9 - ��������� �� ��������� � ������; 10 - ������������� � ��������� � ������
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. ��� ���������, �� �������� �������������� ��������� �������/��� ��������� �����������: 1 - ��; 2 - ��; 3 - ������ ���; 4 - ����������; 5 - ���; 6 - ��; 7 - ���������� � �������� ��������������; 8 - ���������� ��������; 9 - ��������� �� ��������� � ������; 10 - ������������� � ��������� � ������
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    /** 
     * Get the 'ContractNumber' element value. ����� �������� ��������������
     * 
     * @return value
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /** 
     * Set the 'ContractNumber' element value. ����� �������� ��������������
     * 
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /** 
     * Get the 'ContractDate' element value. ���� �������� ��������������
     * 
     * @return value
     */
    public LocalDate getContractDate() {
        return contractDate;
    }

    /** 
     * Set the 'ContractDate' element value. ���� �������� ��������������
     * 
     * @param contractDate
     */
    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }
}
