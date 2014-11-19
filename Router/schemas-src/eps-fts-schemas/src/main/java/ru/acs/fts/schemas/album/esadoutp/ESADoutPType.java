
package ru.acs.fts.schemas.album.esadoutp;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� ����������� � �������������� �������
 */
public class ESADoutPType extends BaseDocType
{
    private String customsProcedure;
    private String customsModeCode;
    private String transitDirectionCode;
    private String declarationKind;
    private String PIURN;
    private String formKind;
    private ESADGoodsShipmentPType ESADGoodsShipmentP;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value. ���������� ���������. ��, ��. ���, ���. ����� ��������� ��.1 ��.
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ���������� ���������. ��, ��. ���, ���. ����� ��������� ��.1 ��.
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'CustomsModeCode' element value. ��� ����������� ������.  ��. 1. ������� ��������� ��. ������ ������ ���� ��. 37.
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ����������� ������.  ��. 1. ������� ��������� ��. ������ ������ ���� ��. 37.
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'TransitDirectionCode' element value. ����������� ����������� ��� ��������.  ��, ��, ��. ��. 1 ��. ������ ���������. 
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value. ����������� ����������� ��� ��������.  ��, ��, ��. ��. 1 ��. ������ ���������. 
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. ��� ���������� ���������� �� �������������� ����� ���������� ����������.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ���������� ���������� �� �������������� ����� ���������� ����������.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'PI_URN' element value. ���������� ������������� ��������������� ����������
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. ���������� ������������� ��������������� ����������
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'FormKind' element value. ��� �����
     * 
     * @return value
     */
    public String getFormKind() {
        return formKind;
    }

    /** 
     * Set the 'FormKind' element value. ��� �����
     * 
     * @param formKind
     */
    public void setFormKind(String formKind) {
        this.formKind = formKind;
    }

    /** 
     * Get the 'ESADGoodsShipmentP' element value. �������� � �������� ������.
     * 
     * @return value
     */
    public ESADGoodsShipmentPType getESADGoodsShipmentP() {
        return ESADGoodsShipmentP;
    }

    /** 
     * Set the 'ESADGoodsShipmentP' element value. �������� � �������� ������.
     * 
     * @param ESADGoodsShipmentP
     */
    public void setESADGoodsShipmentP(ESADGoodsShipmentPType ESADGoodsShipmentP) {
        this.ESADGoodsShipmentP = ESADGoodsShipmentP;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
