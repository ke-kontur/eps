
package ru.acs.fts.schemas.album.actinspection;

/** 
 * �������� �������������
 */
public class IdentifyMeanType
{
    private String identMeanState;
    private String identNumber;
    private String identBreakFlag;
    private String identKind;
    private String identDesc;
    private String recordNumber;

    /** 
     * Get the 'IdentMeanState' element value. ������ �������� ������������� 1 - �������� ������������� �� ������ ���������� ����������� �������� 2 - �������� ������������� ����� ���������� ����������� �������� (����������)
     * 
     * @return value
     */
    public String getIdentMeanState() {
        return identMeanState;
    }

    /** 
     * Set the 'IdentMeanState' element value. ������ �������� ������������� 1 - �������� ������������� �� ������ ���������� ����������� �������� 2 - �������� ������������� ����� ���������� ����������� �������� (����������)
     * 
     * @param identMeanState
     */
    public void setIdentMeanState(String identMeanState) {
        this.identMeanState = identMeanState;
    }

    /** 
     * Get the 'IdentNumber' element value. ����� ����������� �������� �������������
     * 
     * @return value
     */
    public String getIdentNumber() {
        return identNumber;
    }

    /** 
     * Set the 'IdentNumber' element value. ����� ����������� �������� �������������
     * 
     * @param identNumber
     */
    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    /** 
     * Get the 'IdentBreakFlag' element value. ������� ��������� ������� �������������
     * 
     * @return value
     */
    public String getIdentBreakFlag() {
        return identBreakFlag;
    }

    /** 
     * Set the 'IdentBreakFlag' element value. ������� ��������� ������� �������������
     * 
     * @param identBreakFlag
     */
    public void setIdentBreakFlag(String identBreakFlag) {
        this.identBreakFlag = identBreakFlag;
    }

    /** 
     * Get the 'IdentKind' element value. ��� ������� �������������: 1 - ������, 2 - ������, 3 - ����
     * 
     * @return value
     */
    public String getIdentKind() {
        return identKind;
    }

    /** 
     * Set the 'IdentKind' element value. ��� ������� �������������: 1 - ������, 2 - ������, 3 - ����
     * 
     * @param identKind
     */
    public void setIdentKind(String identKind) {
        this.identKind = identKind;
    }

    /** 
     * Get the 'IdentDesc' element value. ���������� �� �������� �������������
     * 
     * @return value
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /** 
     * Set the 'IdentDesc' element value. ���������� �� �������� �������������
     * 
     * @param identDesc
     */
    public void setIdentDesc(String identDesc) {
        this.identDesc = identDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
