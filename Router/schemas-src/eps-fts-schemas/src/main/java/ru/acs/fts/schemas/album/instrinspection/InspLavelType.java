
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ��������
 */
public class InspLavelType
{
    private String withdrWeight;
    private String otherLevel;
    private List<String> levelDescriptionList = new ArrayList<String>();
    private ReCountPackType reCountPack;
    private ReCountItemType reCountItem;
    private FeatureFindingType featureFinding;

    /** 
     * Get the 'WithdrWeight' element value. ����������� (������/����������/��� �����������).���� �������� ����: 1 - ������; 2 - ����������; 3 - ��� �����������.
     * 
     * @return value
     */
    public String getWithdrWeight() {
        return withdrWeight;
    }

    /** 
     * Set the 'WithdrWeight' element value. ����������� (������/����������/��� �����������).���� �������� ����: 1 - ������; 2 - ����������; 3 - ��� �����������.
     * 
     * @param withdrWeight
     */
    public void setWithdrWeight(String withdrWeight) {
        this.withdrWeight = withdrWeight;
    }

    /** 
     * Get the 'OtherLevel' element value. ������
     * 
     * @return value
     */
    public String getOtherLevel() {
        return otherLevel;
    }

    /** 
     * Set the 'OtherLevel' element value. ������
     * 
     * @param otherLevel
     */
    public void setOtherLevel(String otherLevel) {
        this.otherLevel = otherLevel;
    }

    /** 
     * Get the list of 'LevelDescription' element items. �������� ��������������  �������
     * 
     * @return list
     */
    public List<String> getLevelDescriptionList() {
        return levelDescriptionList;
    }

    /** 
     * Set the list of 'LevelDescription' element items. �������� ��������������  �������
     * 
     * @param list
     */
    public void setLevelDescriptionList(List<String> list) {
        levelDescriptionList = list;
    }

    /** 
     * Get the 'ReCountPack' element value. �������� �������� ����
     * 
     * @return value
     */
    public ReCountPackType getReCountPack() {
        return reCountPack;
    }

    /** 
     * Set the 'ReCountPack' element value. �������� �������� ����
     * 
     * @param reCountPack
     */
    public void setReCountPack(ReCountPackType reCountPack) {
        this.reCountPack = reCountPack;
    }

    /** 
     * Get the 'ReCountItem' element value. �������� ���������� ��������� � �������� ������
     * 
     * @return value
     */
    public ReCountItemType getReCountItem() {
        return reCountItem;
    }

    /** 
     * Set the 'ReCountItem' element value. �������� ���������� ��������� � �������� ������
     * 
     * @param reCountItem
     */
    public void setReCountItem(ReCountItemType reCountItem) {
        this.reCountItem = reCountItem;
    }

    /** 
     * Get the 'FeatureFinding' element value. ��������� � ����������� ������������� ������� (� ��������� ���������/� ������ ���������)
     * 
     * @return value
     */
    public FeatureFindingType getFeatureFinding() {
        return featureFinding;
    }

    /** 
     * Set the 'FeatureFinding' element value. ��������� � ����������� ������������� ������� (� ��������� ���������/� ������ ���������)
     * 
     * @param featureFinding
     */
    public void setFeatureFinding(FeatureFindingType featureFinding) {
        this.featureFinding = featureFinding;
    }
}
