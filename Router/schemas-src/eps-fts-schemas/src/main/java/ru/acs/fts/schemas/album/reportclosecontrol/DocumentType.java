
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * ����������� ����������� ���������� ��������
 */
public class DocumentType
{
    private String kind;
    private String EDCode;
    private String EDType;
    private String EDRef;

    /** 
     * Get the 'Kind' element value. ������ �������� ������������ ���������
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. ������ �������� ������������ ���������
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'EDCode' element value. ��� ���� ������������ ����������� ��������� (1-��)
     * 
     * @return value
     */
    public String getEDCode() {
        return EDCode;
    }

    /** 
     * Set the 'EDCode' element value. ��� ���� ������������ ����������� ��������� (1-��)
     * 
     * @param EDCode
     */
    public void setEDCode(String EDCode) {
        this.EDCode = EDCode;
    }

    /** 
     * Get the 'EDType' element value. ��� ������������ ����������� ���������
     * 
     * @return value
     */
    public String getEDType() {
        return EDType;
    }

    /** 
     * Set the 'EDType' element value. ��� ������������ ����������� ���������
     * 
     * @param EDType
     */
    public void setEDType(String EDType) {
        this.EDType = EDType;
    }

    /** 
     * Get the 'EDRef' element value. ������ �� ��������: GUID | ������� ����� | ���������� �����
     * 
     * @return value
     */
    public String getEDRef() {
        return EDRef;
    }

    /** 
     * Set the 'EDRef' element value. ������ �� ��������: GUID | ������� ����� | ���������� �����
     * 
     * @param EDRef
     */
    public void setEDRef(String EDRef) {
        this.EDRef = EDRef;
    }
}
