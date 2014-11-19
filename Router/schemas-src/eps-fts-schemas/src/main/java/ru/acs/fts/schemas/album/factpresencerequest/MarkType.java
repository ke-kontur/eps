
package ru.acs.fts.schemas.album.factpresencerequest;

/** 
 * ������� � ����������� �������� ����������� � ���� ����� ��������
 */
public class MarkType
{
    private String markSign;
    private String markKind;
    private String resultControl;

    /** 
     * Get the 'MarkSign' element value. ������� ������� �������
     * 
     * @return value
     */
    public String getMarkSign() {
        return markSign;
    }

    /** 
     * Set the 'MarkSign' element value. ������� ������� �������
     * 
     * @param markSign
     */
    public void setMarkSign(String markSign) {
        this.markSign = markSign;
    }

    /** 
     * Get the 'MarkKind' element value. ��� �������
     * 
     * @return value
     */
    public String getMarkKind() {
        return markKind;
    }

    /** 
     * Set the 'MarkKind' element value. ��� �������
     * 
     * @param markKind
     */
    public void setMarkKind(String markKind) {
        this.markKind = markKind;
    }

    /** 
     * Get the 'ResultControl' element value. ��������� ����������� ��������
     * 
     * @return value
     */
    public String getResultControl() {
        return resultControl;
    }

    /** 
     * Set the 'ResultControl' element value. ��������� ����������� ��������
     * 
     * @param resultControl
     */
    public void setResultControl(String resultControl) {
        this.resultControl = resultControl;
    }
}
