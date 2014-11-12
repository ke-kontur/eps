
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ������, ��������������� ������������ ���� ����������� ������
 */
public class CustomsModeQuantityType
{
    private String customsModeCode;
    private String quantity;
    private GTDIDType declarationNumber;

    /** 
     * Get the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'DeclarationNumber' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. ����� ���������� ����������
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(GTDIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
    }
}
