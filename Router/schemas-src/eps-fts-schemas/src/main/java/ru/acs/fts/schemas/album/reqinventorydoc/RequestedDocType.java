
package ru.acs.fts.schemas.album.reqinventorydoc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� ��������
 */
public class RequestedDocType extends DocumentBaseType
{
    private String requestPositionID;
    private String position;
    private String docCode;
    private String archDeclID;
    private String aarchID;
    private String archDocID;
    private String ADocumentID;
    private String reqPurpose;
    private String note;
    private String requestorName;
    private String inventLineID;

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������. ������������ � ��� "����������� ������������� ��������"
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������. ������������ � ��� "����������� ������������� ��������"
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'Position' element value. ���������� ����� ������ � �������
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� ����� ������ � �������
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'ArchDeclID' element value. ���������� ������������� ���������� � ����������� ������ ����������.
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. ���������� ������������� ���������� � ����������� ������ ����������.
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the 'AarchID' element value. ���������� ������������� ������ ���������� (������������ ��� ������� ��������� �� ������)
     * 
     * @return value
     */
    public String getAarchID() {
        return aarchID;
    }

    /** 
     * Set the 'AarchID' element value. ���������� ������������� ������ ���������� (������������ ��� ������� ��������� �� ������)
     * 
     * @param aarchID
     */
    public void setAarchID(String aarchID) {
        this.aarchID = aarchID;
    }

    /** 
     * Get the 'ArchDocID' element value. ���������� ������������� ��������� � ������ (������������ ��� ������� ��������� �� ������)
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. ���������� ������������� ��������� � ������ (������������ ��� ������� ��������� �� ������)
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ADocumentID' element value. ���������� ������������� ��������� (������������ ��� ������� ��������� �� ������)
     * 
     * @return value
     */
    public String getADocumentID() {
        return ADocumentID;
    }

    /** 
     * Set the 'ADocumentID' element value. ���������� ������������� ��������� (������������ ��� ������� ��������� �� ������)
     * 
     * @param ADocumentID
     */
    public void setADocumentID(String ADocumentID) {
        this.ADocumentID = ADocumentID;
    }

    /** 
     * Get the 'ReqPurpose' element value. ����, ��� ������� ������������� ��������
     * 
     * @return value
     */
    public String getReqPurpose() {
        return reqPurpose;
    }

    /** 
     * Set the 'ReqPurpose' element value. ����, ��� ������� ������������� ��������
     * 
     * @param reqPurpose
     */
    public void setReqPurpose(String reqPurpose) {
        this.reqPurpose = reqPurpose;
    }

    /** 
     * Get the 'Note' element value. ����������
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. ����������
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'RequestorName' element value. ��� ������������ ����, �������������� �������������� ��������� � ��������
     * 
     * @return value
     */
    public String getRequestorName() {
        return requestorName;
    }

    /** 
     * Set the 'RequestorName' element value. ��� ������������ ����, �������������� �������������� ��������� � ��������
     * 
     * @param requestorName
     */
    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    /** 
     * Get the 'InventLineID' element value. ���������� ������������� ������ � �����. GUID. ����������� ��� ������� ��������� �� �����.
     * 
     * @return value
     */
    public String getInventLineID() {
        return inventLineID;
    }

    /** 
     * Set the 'InventLineID' element value. ���������� ������������� ������ � �����. GUID. ����������� ��� ������� ��������� �� �����.
     * 
     * @param inventLineID
     */
    public void setInventLineID(String inventLineID) {
        this.inventLineID = inventLineID;
    }
}
