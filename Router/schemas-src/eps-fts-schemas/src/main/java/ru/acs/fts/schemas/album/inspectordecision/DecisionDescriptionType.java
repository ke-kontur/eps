
package ru.acs.fts.schemas.album.inspectordecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * �������� ������� ������������ ����
 */
public class DecisionDescriptionType
{
    private LocalDate decisionDate;
    private String decisionTime;
    private List<String> decisionTextList = new ArrayList<String>();
    private DocumentInfoType documentInfo;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private CustomsType goodsCustoms;

    /** 
     * Get the 'DecisionDate' element value. ���� ������� 
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� ������� 
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. ����� ������� 
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. ����� ������� 
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the list of 'DecisionText' element items. �������� �������
     * 
     * @return list
     */
    public List<String> getDecisionTextList() {
        return decisionTextList;
    }

    /** 
     * Set the list of 'DecisionText' element items. �������� �������
     * 
     * @param list
     */
    public void setDecisionTextList(List<String> list) {
        decisionTextList = list;
    }

    /** 
     * Get the 'DocumentInfo' element value. �������� � ���������
     * 
     * @return value
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. �������� � ���������
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentInfoType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ����
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ����
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'GoodsCustoms' element value. ���������� �����, � ������� ������������ �������� ��������� ������
     * 
     * @return value
     */
    public CustomsType getGoodsCustoms() {
        return goodsCustoms;
    }

    /** 
     * Set the 'GoodsCustoms' element value. ���������� �����, � ������� ������������ �������� ��������� ������
     * 
     * @param goodsCustoms
     */
    public void setGoodsCustoms(CustomsType goodsCustoms) {
        this.goodsCustoms = goodsCustoms;
    }
}
