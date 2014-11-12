
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ����������� �����
 */
public class EncumbranceType
{
    private LocalDate regDate;
    private String regNum;
    private String shareText;
    private LocalDate startDate;
    private LocalDate endDate;
    private String term;
    private String allShareOwner;
    private AddDescriptionType encumbranceDetails;
    private List<OwnerType> ownerList = new ArrayList<OwnerType>();
    private List<FoundationDocType> foundationDocList = new ArrayList<FoundationDocType>();

    /** 
     * Get the 'RegDate' element value. ���� ��������������� �����������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ��������������� �����������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. ����� ��������������� ����������� 
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ����� ��������������� ����������� 
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'ShareText' element value. ������� �����������
     * 
     * @return value
     */
    public String getShareText() {
        return shareText;
    }

    /** 
     * Set the 'ShareText' element value. ������� �����������
     * 
     * @param shareText
     */
    public void setShareText(String shareText) {
        this.shareText = shareText;
    }

    /** 
     * Get the 'StartDate' element value. ���� ������ ��������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ ��������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ����������� ��������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ����������� ��������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Term' element value. �����������������
     * 
     * @return value
     */
    public String getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. �����������������
     * 
     * @param term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /** 
     * Get the 'AllShareOwner' element value. ���������  �������� ������������� �� ��������� ������� � ������� �������������
     * 
     * @return value
     */
    public String getAllShareOwner() {
        return allShareOwner;
    }

    /** 
     * Set the 'AllShareOwner' element value. ���������  �������� ������������� �� ��������� ������� � ������� �������������
     * 
     * @param allShareOwner
     */
    public void setAllShareOwner(String allShareOwner) {
        this.allShareOwner = allShareOwner;
    }

    /** 
     * Get the 'EncumbranceDetails' element value. �������� ����������� �����
     * 
     * @return value
     */
    public AddDescriptionType getEncumbranceDetails() {
        return encumbranceDetails;
    }

    /** 
     * Set the 'EncumbranceDetails' element value. �������� ����������� �����
     * 
     * @param encumbranceDetails
     */
    public void setEncumbranceDetails(AddDescriptionType encumbranceDetails) {
        this.encumbranceDetails = encumbranceDetails;
    }

    /** 
     * Get the list of 'Owner' element items. ����, � ������ ������� �������������� �����
     * 
     * @return list
     */
    public List<OwnerType> getOwnerList() {
        return ownerList;
    }

    /** 
     * Set the list of 'Owner' element items. ����, � ������ ������� �������������� �����
     * 
     * @param list
     */
    public void setOwnerList(List<OwnerType> list) {
        ownerList = list;
    }

    /** 
     * Get the list of 'FoundationDoc' element items. ��������� - ��������� ����������� �����������
     * 
     * @return list
     */
    public List<FoundationDocType> getFoundationDocList() {
        return foundationDocList;
    }

    /** 
     * Set the list of 'FoundationDoc' element items. ��������� - ��������� ����������� �����������
     * 
     * @param list
     */
    public void setFoundationDocList(List<FoundationDocType> list) {
        foundationDocList = list;
    }
}
