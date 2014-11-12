
package ru.acs.fts.schemas.album.transportmeanschassispassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * �������� � ������� � ����� ��
 */
public class ChassicBargainType
{
    private LocalDate sellingDate;
    private TransportOwnerType newChassisOwner;
    private List<DocumentBaseType> docPropertyRightList = new ArrayList<DocumentBaseType>();
    private PersonBaseType prevOwnerSign;
    private PersonBaseType newOwnerSign;

    /** 
     * Get the 'SellingDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getSellingDate() {
        return sellingDate;
    }

    /** 
     * Set the 'SellingDate' element value. ���� �������
     * 
     * @param sellingDate
     */
    public void setSellingDate(LocalDate sellingDate) {
        this.sellingDate = sellingDate;
    }

    /** 
     * Get the 'NewChassisOwner' element value. �������� � ����� ������������ ��
     * 
     * @return value
     */
    public TransportOwnerType getNewChassisOwner() {
        return newChassisOwner;
    }

    /** 
     * Set the 'NewChassisOwner' element value. �������� � ����� ������������ ��
     * 
     * @param newChassisOwner
     */
    public void setNewChassisOwner(TransportOwnerType newChassisOwner) {
        this.newChassisOwner = newChassisOwner;
    }

    /** 
     * Get the list of 'DocPropertyRights' element items. �������� �� �����  �������������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocPropertyRightList() {
        return docPropertyRightList;
    }

    /** 
     * Set the list of 'DocPropertyRights' element items. �������� �� �����  �������������
     * 
     * @param list
     */
    public void setDocPropertyRightList(List<DocumentBaseType> list) {
        docPropertyRightList = list;
    }

    /** 
     * Get the 'PrevOwnerSign' element value. ������� ��������  ������������
     * 
     * @return value
     */
    public PersonBaseType getPrevOwnerSign() {
        return prevOwnerSign;
    }

    /** 
     * Set the 'PrevOwnerSign' element value. ������� ��������  ������������
     * 
     * @param prevOwnerSign
     */
    public void setPrevOwnerSign(PersonBaseType prevOwnerSign) {
        this.prevOwnerSign = prevOwnerSign;
    }

    /** 
     * Get the 'NewOwnerSign' element value. ������� ����������  ������������
     * 
     * @return value
     */
    public PersonBaseType getNewOwnerSign() {
        return newOwnerSign;
    }

    /** 
     * Set the 'NewOwnerSign' element value. ������� ����������  ������������
     * 
     * @param newOwnerSign
     */
    public void setNewOwnerSign(PersonBaseType newOwnerSign) {
        this.newOwnerSign = newOwnerSign;
    }
}
