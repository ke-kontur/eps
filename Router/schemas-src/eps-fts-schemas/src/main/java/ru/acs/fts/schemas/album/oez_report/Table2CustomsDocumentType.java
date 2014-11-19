
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������� 2. ������ 3. ���������� ��������. ����� ��, ���� ��������� ����������� ���������, �� ��������� �������� �������������� ���������� ����������, ����� � ��������� ����� ������� ��������� ���������� 
 */
public class Table2CustomsDocumentType
{
    private int choiceSelect = -1;
    private static final int ALIENATION_DOCUMENT_LIST_CHOICE = 0;
    private static final int GTD_NUMBER_LIST_CHOICE = 1;
    private List<DocumentBaseType> alienationDocumentList = new ArrayList<DocumentBaseType>();
    private List<GTDIDType> GTDNumberList = new ArrayList<GTDIDType>();

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if AlienationDocumentList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifAlienationDocumentList() {
        return choiceSelect == ALIENATION_DOCUMENT_LIST_CHOICE;
    }

    /** 
     * Get the list of 'AlienationDocument' element items. ��������� ����������� ���������, �� ��������� �������� �������������� ���������� ����������, ����� � ���������  ������ ��������� ���������� 
     * 
     * @return list
     */
    public List<DocumentBaseType> getAlienationDocumentList() {
        return alienationDocumentList;
    }

    /** 
     * Set the list of 'AlienationDocument' element items. ��������� ����������� ���������, �� ��������� �������� �������������� ���������� ����������, ����� � ���������  ������ ��������� ���������� 
     * 
     * @param list
     */
    public void setAlienationDocumentList(List<DocumentBaseType> list) {
        setChoiceSelect(ALIENATION_DOCUMENT_LIST_CHOICE);
        alienationDocumentList = list;
    }

    /** 
     * Check if GTDNumberList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGTDNumberList() {
        return choiceSelect == GTD_NUMBER_LIST_CHOICE;
    }

    /** 
     * Get the list of 'GTDNumber' element items. ����� ��,  � ������������ � ������� ������ ���� �������� ��� ���������� ����� ��� 
     * 
     * @return list
     */
    public List<GTDIDType> getGTDNumberList() {
        return GTDNumberList;
    }

    /** 
     * Set the list of 'GTDNumber' element items. ����� ��,  � ������������ � ������� ������ ���� �������� ��� ���������� ����� ��� 
     * 
     * @param list
     */
    public void setGTDNumberList(List<GTDIDType> list) {
        setChoiceSelect(GTD_NUMBER_LIST_CHOICE);
        GTDNumberList = list;
    }
}
