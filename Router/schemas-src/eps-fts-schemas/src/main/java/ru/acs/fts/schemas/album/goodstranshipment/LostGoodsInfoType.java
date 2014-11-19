
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * ���������� �� ������ (����������/�����������) ����� ������
 */
public class LostGoodsInfoType
{
    private String goodsNumber;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String packageKindSequence;
    private String absenceKind;
    private String grossMass;
    private PackingInformationType lostPackages;
    private SupplementaryQuantityType lostGoodsQuantity;

    /** 
     * Get the 'GoodsNumber' element value. ���������� ����� ������ �� ��/���.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ���������� ����� ������ �� ��/���.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'PackageKindSequence' element value. ���������� ����� ���� ��������, ���������� ����� ������
     * 
     * @return value
     */
    public String getPackageKindSequence() {
        return packageKindSequence;
    }

    /** 
     * Set the 'PackageKindSequence' element value. ���������� ����� ���� ��������, ���������� ����� ������
     * 
     * @param packageKindSequence
     */
    public void setPackageKindSequence(String packageKindSequence) {
        this.packageKindSequence = packageKindSequence;
    }

    /** 
     * Get the 'AbsenceKind' element value. ��� ������ ������ ��� ��� �����: 1 - ������; 2 - ���������; 3 - �������� ������, �������� ���������
     * 
     * @return value
     */
    public String getAbsenceKind() {
        return absenceKind;
    }

    /** 
     * Set the 'AbsenceKind' element value. ��� ������ ������ ��� ��� �����: 1 - ������; 2 - ���������; 3 - �������� ������, �������� ���������
     * 
     * @param absenceKind
     */
    public void setAbsenceKind(String absenceKind) {
        this.absenceKind = absenceKind;
    }

    /** 
     * Get the 'GrossMass' element value. ��� ������ ���������� ����� ������.
     * 
     * @return value
     */
    public String getGrossMass() {
        return grossMass;
    }

    /** 
     * Set the 'GrossMass' element value. ��� ������ ���������� ����� ������.
     * 
     * @param grossMass
     */
    public void setGrossMass(String grossMass) {
        this.grossMass = grossMass;
    }

    /** 
     * Get the 'LostPackages' element value. �������� �� ���������� ���������
     * 
     * @return value
     */
    public PackingInformationType getLostPackages() {
        return lostPackages;
    }

    /** 
     * Set the 'LostPackages' element value. �������� �� ���������� ���������
     * 
     * @param lostPackages
     */
    public void setLostPackages(PackingInformationType lostPackages) {
        this.lostPackages = lostPackages;
    }

    /** 
     * Get the 'LostGoodsQuantity' element value. ���������� ���������� ����� ������.
     * 
     * @return value
     */
    public SupplementaryQuantityType getLostGoodsQuantity() {
        return lostGoodsQuantity;
    }

    /** 
     * Set the 'LostGoodsQuantity' element value. ���������� ���������� ����� ������.
     * 
     * @param lostGoodsQuantity
     */
    public void setLostGoodsQuantity(SupplementaryQuantityType lostGoodsQuantity) {
        this.lostGoodsQuantity = lostGoodsQuantity;
    }
}
