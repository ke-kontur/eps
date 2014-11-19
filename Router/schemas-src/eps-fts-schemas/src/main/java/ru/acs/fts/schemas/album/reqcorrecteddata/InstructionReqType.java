
package ru.acs.fts.schemas.album.reqcorrecteddata;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ����� �������� (���������) � � ����� ���� ���������� ��������������� (�����������) � ���������� �����
 */
public class InstructionReqType
{
    private LocalDate dateLimit;
    private List<String> instructionDescriptionList = new ArrayList<String>();
    private List<String> instrDocumentList = new ArrayList<String>();

    /** 
     * Get the 'DateLimit' element value. ����, � ������� ���������� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ����, � ������� ���������� ��������� ��������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'InstructionDescription' element items. �������� ��������
     * 
     * @return list
     */
    public List<String> getInstructionDescriptionList() {
        return instructionDescriptionList;
    }

    /** 
     * Set the list of 'InstructionDescription' element items. �������� ��������
     * 
     * @param list
     */
    public void setInstructionDescriptionList(List<String> list) {
        instructionDescriptionList = list;
    }

    /** 
     * Get the list of 'InstrDocument' element items. ��������,  � ������������ � ������� ��������� ���������� ��������
     * 
     * @return list
     */
    public List<String> getInstrDocumentList() {
        return instrDocumentList;
    }

    /** 
     * Set the list of 'InstrDocument' element items. ��������,  � ������������ � ������� ��������� ���������� ��������
     * 
     * @param list
     */
    public void setInstrDocumentList(List<String> list) {
        instrDocumentList = list;
    }
}
