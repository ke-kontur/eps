
package ru.acs.fts.schemas.album.tir_carnet;

/** 
 * ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
 */
public class MarkType
{
    private String markSing;
    private String markKind;
    private String resultControl;

    /** 
     * Get the 'MarkSing' element value. ������� ������� �������
     * 
     * @return value
     */
    public String getMarkSing() {
        return markSing;
    }

    /** 
     * Set the 'MarkSing' element value. ������� ������� �������
     * 
     * @param markSing
     */
    public void setMarkSing(String markSing) {
        this.markSing = markSing;
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
