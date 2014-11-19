
package ru.acs.fts.schemas.album.reqcorrecteddata;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������� �� ������������� ��������, ���������� � ���������� �� ������.
 */
public class ReqCorrectedDataType extends BaseDocType
{
    private LocalDate requestDate;
    private String requestNumber;
    private String TKPunkt;
    private OrganizationBaseType declarant;
    private UncertaintyType uncertainty;
    private InstructionReqType instruction;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'RequestDate' element value. ���� ���������� �� �������������.
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. ���� ���������� �� �������������.
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    /** 
     * Get the 'RequestNumber' element value. ����� �������
     * 
     * @return value
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /** 
     * Set the 'RequestNumber' element value. ����� �������
     * 
     * @param requestNumber
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /** 
     * Get the 'TKPunkt' element value. ����� ������ ����������� ������� TC, � ������������ � ������� ������������ ��������
     * 
     * @return value
     */
    public String getTKPunkt() {
        return TKPunkt;
    }

    /** 
     * Set the 'TKPunkt' element value. ����� ������ ����������� ������� TC, � ������������ � ������� ������������ ��������
     * 
     * @param TKPunkt
     */
    public void setTKPunkt(String TKPunkt) {
        this.TKPunkt = TKPunkt;
    }

    /** 
     * Get the 'Declarant' element value. ����,  ������������� ������. ������������ / ��� (��� ���������� ���)
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ����,  ������������� ������. ������������ / ��� (��� ���������� ���)
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationBaseType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Uncertainty' element value. ���������� ��������������
     * 
     * @return value
     */
    public UncertaintyType getUncertainty() {
        return uncertainty;
    }

    /** 
     * Set the 'Uncertainty' element value. ���������� ��������������
     * 
     * @param uncertainty
     */
    public void setUncertainty(UncertaintyType uncertainty) {
        this.uncertainty = uncertainty;
    }

    /** 
     * Get the 'Instruction' element value. ��������,  ����������� ��� ���������� ��������������
     * 
     * @return value
     */
    public InstructionReqType getInstruction() {
        return instruction;
    }

    /** 
     * Set the 'Instruction' element value. ��������,  ����������� ��� ���������� ��������������
     * 
     * @param instruction
     */
    public void setInstruction(InstructionReqType instruction) {
        this.instruction = instruction;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������.
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������.
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
