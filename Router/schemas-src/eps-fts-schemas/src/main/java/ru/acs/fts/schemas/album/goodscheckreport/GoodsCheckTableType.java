
package ru.acs.fts.schemas.album.goodscheckreport;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ������
 */
public class GoodsCheckTableType
{
    private String GTDValue;
    private String GTDValueFlag;
    private String trueValue;
    private List<String> GTDValueNoteList = new ArrayList<String>();
    private ElementLocationType checkElementLocation;
    private DescriptionDocumentType trueValueRefDocumentDT;
    private FactValueDocumentType trueValueRefDocument;

    /** 
     * Get the 'GTDValue' element value. �������� � ��
     * 
     * @return value
     */
    public String getGTDValue() {
        return GTDValue;
    }

    /** 
     * Set the 'GTDValue' element value. �������� � ��
     * 
     * @param GTDValue
     */
    public void setGTDValue(String GTDValue) {
        this.GTDValue = GTDValue;
    }

    /** 
     * Get the 'GTDValueFlag' element value. ������� ����������/������������ �������� � �� � ���������������� �����������: 0 - �������, 1 � �� �������
     * 
     * @return value
     */
    public String getGTDValueFlag() {
        return GTDValueFlag;
    }

    /** 
     * Set the 'GTDValueFlag' element value. ������� ����������/������������ �������� � �� � ���������������� �����������: 0 - �������, 1 � �� �������
     * 
     * @param GTDValueFlag
     */
    public void setGTDValueFlag(String GTDValueFlag) {
        this.GTDValueFlag = GTDValueFlag;
    }

    /** 
     * Get the 'TrueValue' element value. �������� ����������� (� ������������ � ����������������������� ����������� ��� �����������, ������������ � ���������� ����������� �������� (��� �������� � �.�.)
     * 
     * @return value
     */
    public String getTrueValue() {
        return trueValue;
    }

    /** 
     * Set the 'TrueValue' element value. �������� ����������� (� ������������ � ����������������������� ����������� ��� �����������, ������������ � ���������� ����������� �������� (��� �������� � �.�.)
     * 
     * @param trueValue
     */
    public void setTrueValue(String trueValue) {
        this.trueValue = trueValue;
    }

    /** 
     * Get the list of 'GTDValueNote' element items. �������� � �� ����������
     * 
     * @return list
     */
    public List<String> getGTDValueNoteList() {
        return GTDValueNoteList;
    }

    /** 
     * Set the list of 'GTDValueNote' element items. �������� � �� ����������
     * 
     * @param list
     */
    public void setGTDValueNoteList(List<String> list) {
        GTDValueNoteList = list;
    }

    /** 
     * Get the 'CheckElementLocation' element value. ������������� �������� ������ (������ ����� ��)
     * 
     * @return value
     */
    public ElementLocationType getCheckElementLocation() {
        return checkElementLocation;
    }

    /** 
     * Set the 'CheckElementLocation' element value. ������������� �������� ������ (������ ����� ��)
     * 
     * @param checkElementLocation
     */
    public void setCheckElementLocation(ElementLocationType checkElementLocation) {
        this.checkElementLocation = checkElementLocation;
    }

    /** 
     * Get the 'TrueValueRefDocumentDT' element value. �������� ���������, ����������� �������� �� �� 
     * 
     * @return value
     */
    public DescriptionDocumentType getTrueValueRefDocumentDT() {
        return trueValueRefDocumentDT;
    }

    /** 
     * Set the 'TrueValueRefDocumentDT' element value. �������� ���������, ����������� �������� �� �� 
     * 
     * @param trueValueRefDocumentDT
     */
    public void setTrueValueRefDocumentDT(
            DescriptionDocumentType trueValueRefDocumentDT) {
        this.trueValueRefDocumentDT = trueValueRefDocumentDT;
    }

    /** 
     * Get the 'TrueValueRefDocument' element value. �������� ���������, ����������� ����������� ��������
     * 
     * @return value
     */
    public FactValueDocumentType getTrueValueRefDocument() {
        return trueValueRefDocument;
    }

    /** 
     * Set the 'TrueValueRefDocument' element value. �������� ���������, ����������� ����������� ��������
     * 
     * @param trueValueRefDocument
     */
    public void setTrueValueRefDocument(
            FactValueDocumentType trueValueRefDocument) {
        this.trueValueRefDocument = trueValueRefDocument;
    }
}
