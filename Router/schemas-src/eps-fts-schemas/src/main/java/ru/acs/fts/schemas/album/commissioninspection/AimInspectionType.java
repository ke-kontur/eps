
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * ���� ��������
 */
public class AimInspectionType
{
    private String identifierGood;
    private String chooseControl;
    private String others;
    private String otherComments;

    /** 
     * Get the 'IdentifierGood' element value. ������������� �������. ���� �������� "true" - ��; "false" - ���
     * 
     * @return value
     */
    public String getIdentifierGood() {
        return identifierGood;
    }

    /** 
     * Set the 'IdentifierGood' element value. ������������� �������. ���� �������� "true" - ��; "false" - ���
     * 
     * @param identifierGood
     */
    public void setIdentifierGood(String identifierGood) {
        this.identifierGood = identifierGood;
    }

    /** 
     * Get the 'ChooseControl' element value. ���������� ��������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getChooseControl() {
        return chooseControl;
    }

    /** 
     * Set the 'ChooseControl' element value. ���������� ��������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param chooseControl
     */
    public void setChooseControl(String chooseControl) {
        this.chooseControl = chooseControl;
    }

    /** 
     * Get the 'Others' element value. ������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getOthers() {
        return others;
    }

    /** 
     * Set the 'Others' element value. ������.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param others
     */
    public void setOthers(String others) {
        this.others = others;
    }

    /** 
     * Get the 'OtherComments' element value. ������(�������)
     * 
     * @return value
     */
    public String getOtherComments() {
        return otherComments;
    }

    /** 
     * Set the 'OtherComments' element value. ������(�������)
     * 
     * @param otherComments
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
