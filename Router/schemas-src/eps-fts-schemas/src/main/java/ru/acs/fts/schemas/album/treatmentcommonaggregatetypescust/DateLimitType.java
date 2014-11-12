
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���� �����������
 */
public class DateLimitType
{
    private String generalTerm;
    private StartTermType startTerm;
    private List<ExtensionTermType> extensionTermList = new ArrayList<ExtensionTermType>();

    /** 
     * Get the 'GeneralTerm' element value. ����� ����
     * 
     * @return value
     */
    public String getGeneralTerm() {
        return generalTerm;
    }

    /** 
     * Set the 'GeneralTerm' element value. ����� ����
     * 
     * @param generalTerm
     */
    public void setGeneralTerm(String generalTerm) {
        this.generalTerm = generalTerm;
    }

    /** 
     * Get the 'StartTerm' element value. ������ ����� �����������
     * 
     * @return value
     */
    public StartTermType getStartTerm() {
        return startTerm;
    }

    /** 
     * Set the 'StartTerm' element value. ������ ����� �����������
     * 
     * @param startTerm
     */
    public void setStartTerm(StartTermType startTerm) {
        this.startTerm = startTerm;
    }

    /** 
     * Get the list of 'ExtensionTerm' element items. ��������� ����� �����������
     * 
     * @return list
     */
    public List<ExtensionTermType> getExtensionTermList() {
        return extensionTermList;
    }

    /** 
     * Set the list of 'ExtensionTerm' element items. ��������� ����� �����������
     * 
     * @param list
     */
    public void setExtensionTermList(List<ExtensionTermType> list) {
        extensionTermList = list;
    }
}
