
package ru.acs.fts.schemas.album.resolutioncommissionexportcontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� �� ���������
 */
public class ApplicationType
{
    private String applicationNumber;
    private LocalDate applicationDate;
    private String action;
    private List<String> productDescriptionList = new ArrayList<String>();
    private String stateDestination;
    private DocumentBaseType conformityDocument;

    /** 
     * Get the 'ApplicationNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /** 
     * Set the 'ApplicationNumber' element value. ����� ���������
     * 
     * @param applicationNumber
     */
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /** 
     * Get the 'ApplicationDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    /** 
     * Set the 'ApplicationDate' element value. ���� ���������
     * 
     * @param applicationDate
     */
    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    /** 
     * Get the 'Action' element value. ��������� ��: 1- �������; 2 - ��������� �����; 3 - ���������� �����; 4 - �������� �����.
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. ��������� ��: 1- �������; 2 - ��������� �����; 3 - ���������� �����; 4 - �������� �����.
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /** 
     * Get the list of 'ProductDescription' element items. �������� ���������, ���������� ��������� ������������������� ��������
     * 
     * @return list
     */
    public List<String> getProductDescriptionList() {
        return productDescriptionList;
    }

    /** 
     * Set the list of 'ProductDescription' element items. �������� ���������, ���������� ��������� ������������������� ��������
     * 
     * @param list
     */
    public void setProductDescriptionList(List<String> list) {
        productDescriptionList = list;
    }

    /** 
     * Get the 'StateDestination' element value. ����������� ����������
     * 
     * @return value
     */
    public String getStateDestination() {
        return stateDestination;
    }

    /** 
     * Set the 'StateDestination' element value. ����������� ����������
     * 
     * @param stateDestination
     */
    public void setStateDestination(String stateDestination) {
        this.stateDestination = stateDestination;
    }

    /** 
     * Get the 'ConformityDocument' element value. � ������������ � ����������
     * 
     * @return value
     */
    public DocumentBaseType getConformityDocument() {
        return conformityDocument;
    }

    /** 
     * Set the 'ConformityDocument' element value. � ������������ � ����������
     * 
     * @param conformityDocument
     */
    public void setConformityDocument(DocumentBaseType conformityDocument) {
        this.conformityDocument = conformityDocument;
    }
}
