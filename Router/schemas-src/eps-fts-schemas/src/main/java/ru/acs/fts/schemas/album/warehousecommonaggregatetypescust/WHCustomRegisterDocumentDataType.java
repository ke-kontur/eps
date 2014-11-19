
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.warehousecommonleaftypescust.CustomDocumentState;

/** 
 * ����������� ��� ��� ������ � ����������� ��������� � ���������� ������
 */
public class WHCustomRegisterDocumentDataType
{
    private CustomDocumentState customState;
    private String registerTime;
    private WHCustomInspectorType inspector;
    private WHDocumentCancelationType cancelation;
    private WHDocumentRegisterNumberType registerNumber;

    /** 
     * Get the 'CustomState' element value. ���������� ������ ������
     * 
     * @return value
     */
    public CustomDocumentState getCustomState() {
        return customState;
    }

    /** 
     * Set the 'CustomState' element value. ���������� ������ ������
     * 
     * @param customState
     */
    public void setCustomState(CustomDocumentState customState) {
        this.customState = customState;
    }

    /** 
     * Get the 'RegisterTime' element value. ����� ����������� ������ � ������� ����������� �� ����������� ������
     * 
     * @return value
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /** 
     * Set the 'RegisterTime' element value. ����� ����������� ������ � ������� ����������� �� ����������� ������
     * 
     * @param registerTime
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    /** 
     * Get the 'Inspector' element value. ��������� ����������� ������, ������������������ �����
     * 
     * @return value
     */
    public WHCustomInspectorType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. ��������� ����������� ������, ������������������ �����
     * 
     * @param inspector
     */
    public void setInspector(WHCustomInspectorType inspector) {
        this.inspector = inspector;
    }

    /** 
     * Get the 'Cancelation' element value. ������ �� ������������� ������
     * 
     * @return value
     */
    public WHDocumentCancelationType getCancelation() {
        return cancelation;
    }

    /** 
     * Set the 'Cancelation' element value. ������ �� ������������� ������
     * 
     * @param cancelation
     */
    public void setCancelation(WHDocumentCancelationType cancelation) {
        this.cancelation = cancelation;
    }

    /** 
     * Get the 'RegisterNumber' element value. ��������������� ����� ������ �� ������� ����������� �� ����������� ������
     * 
     * @return value
     */
    public WHDocumentRegisterNumberType getRegisterNumber() {
        return registerNumber;
    }

    /** 
     * Set the 'RegisterNumber' element value. ��������������� ����� ������ �� ������� ����������� �� ����������� ������
     * 
     * @param registerNumber
     */
    public void setRegisterNumber(WHDocumentRegisterNumberType registerNumber) {
        this.registerNumber = registerNumber;
    }
}
