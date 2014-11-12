
package ru.acs.fts.schemas.album.duplicationdt;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ������������ ��/������������� � ������ �� � ����������  �����
 */
public class DuplicationDTType extends BaseDocType
{
    private String procedureID;
    private String declarationID;
    private String dubleDateTime;
    private GTDIDType DTRegNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'ProcedureID' element value. ������������� ���������, � ������� ������� ����� ������������������ ��/������������� � ������ �� � ����������  �����
     * 
     * @return value
     */
    public String getProcedureID() {
        return procedureID;
    }

    /** 
     * Set the 'ProcedureID' element value. ������������� ���������, � ������� ������� ����� ������������������ ��/������������� � ������ �� � ����������  �����
     * 
     * @param procedureID
     */
    public void setProcedureID(String procedureID) {
        this.procedureID = procedureID;
    }

    /** 
     * Get the 'DeclarationID' element value. ���������� ������������� ��/������������� � ������ �� � ����������  ����� (DocumentID), �������(��) ����(�) ����� ����������������(�)
     * 
     * @return value
     */
    public String getDeclarationID() {
        return declarationID;
    }

    /** 
     * Set the 'DeclarationID' element value. ���������� ������������� ��/������������� � ������ �� � ����������  ����� (DocumentID), �������(��) ����(�) ����� ����������������(�)
     * 
     * @param declarationID
     */
    public void setDeclarationID(String declarationID) {
        this.declarationID = declarationID;
    }

    /** 
     * Get the 'DubleDateTime' element value. ���� � ����� ��������� ���������� � ������������
     * 
     * @return value
     */
    public String getDubleDateTime() {
        return dubleDateTime;
    }

    /** 
     * Set the 'DubleDateTime' element value. ���� � ����� ��������� ���������� � ������������
     * 
     * @param dubleDateTime
     */
    public void setDubleDateTime(String dubleDateTime) {
        this.dubleDateTime = dubleDateTime;
    }

    /** 
     * Get the 'DTRegNumber' element value. ��������������� ����� ��/������������� � ������ ��, ������������������(���) ����� � ��
     * 
     * @return value
     */
    public GTDIDType getDTRegNumber() {
        return DTRegNumber;
    }

    /** 
     * Set the 'DTRegNumber' element value. ��������������� ����� ��/������������� � ������ ��, ������������������(���) ����� � ��
     * 
     * @param DTRegNumber
     */
    public void setDTRegNumber(GTDIDType DTRegNumber) {
        this.DTRegNumber = DTRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. �������� � ����������� ����.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. �������� � ����������� ����.
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
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
