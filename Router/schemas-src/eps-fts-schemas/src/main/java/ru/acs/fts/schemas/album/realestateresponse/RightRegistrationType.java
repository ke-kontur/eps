
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ������������������ �����
 */
public class RightRegistrationType
{
    private LocalDate regDate;
    private String regNum;
    private LocalDate expirationDate;
    private String shareNominator;
    private String shareDenominator;
    private String shareText;
    private AddDescriptionType rightDescription;
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
     * Get the 'ExpirationDate' element value. ���� ����������� �����
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. ���� ����������� �����
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'ShareNominator' element value. ��������� ����
     * 
     * @return value
     */
    public String getShareNominator() {
        return shareNominator;
    }

    /** 
     * Set the 'ShareNominator' element value. ��������� ����
     * 
     * @param shareNominator
     */
    public void setShareNominator(String shareNominator) {
        this.shareNominator = shareNominator;
    }

    /** 
     * Get the 'ShareDenominator' element value. ����������� ����
     * 
     * @return value
     */
    public String getShareDenominator() {
        return shareDenominator;
    }

    /** 
     * Set the 'ShareDenominator' element value. ����������� ����
     * 
     * @param shareDenominator
     */
    public void setShareDenominator(String shareDenominator) {
        this.shareDenominator = shareDenominator;
    }

    /** 
     * Get the 'ShareText' element value. �������� ���� �������
     * 
     * @return value
     */
    public String getShareText() {
        return shareText;
    }

    /** 
     * Set the 'ShareText' element value. �������� ���� �������
     * 
     * @param shareText
     */
    public void setShareText(String shareText) {
        this.shareText = shareText;
    }

    /** 
     * Get the 'RightDescription' element value. �������� �����
     * 
     * @return value
     */
    public AddDescriptionType getRightDescription() {
        return rightDescription;
    }

    /** 
     * Set the 'RightDescription' element value. �������� �����
     * 
     * @param rightDescription
     */
    public void setRightDescription(AddDescriptionType rightDescription) {
        this.rightDescription = rightDescription;
    }

    /** 
     * Get the list of 'FoundationDoc' element items. ��������� - ��������� ����������� �����
     * 
     * @return list
     */
    public List<FoundationDocType> getFoundationDocList() {
        return foundationDocList;
    }

    /** 
     * Set the list of 'FoundationDoc' element items. ��������� - ��������� ����������� �����
     * 
     * @param list
     */
    public void setFoundationDocList(List<FoundationDocType> list) {
        foundationDocList = list;
    }
}
