
package ru.acs.fts.schemas.album.liquidationapplicationin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� �������
 */
public class CustomsMarkType
{
    private String customsDecision;
    private LocalDate composeDate;
    private String customsControl;
    private List<String> refusalReasonList = new ArrayList<String>();
    private LocalDate finalLiquidationDate;
    private DocumentBaseType prolongFoundation;
    private CustomsPersonType customsPerson;

    /** 
     * Get the 'CustomsDecision' element value. ��� ������� ����������� ������: 1 - ���������� �� �����������; 2 - ��������� ����� �����������; 3 - ����� � ������ ����������; 4 - ����� � ��������� ����� �����������
     * 
     * @return value
     */
    public String getCustomsDecision() {
        return customsDecision;
    }

    /** 
     * Set the 'CustomsDecision' element value. ��� ������� ����������� ������: 1 - ���������� �� �����������; 2 - ��������� ����� �����������; 3 - ����� � ������ ����������; 4 - ����� � ��������� ����� �����������
     * 
     * @param customsDecision
     */
    public void setCustomsDecision(String customsDecision) {
        this.customsDecision = customsDecision;
    }

    /** 
     * Get the 'ComposeDate' element value. ���� ������������ ���������� �������
     * 
     * @return value
     */
    public LocalDate getComposeDate() {
        return composeDate;
    }

    /** 
     * Set the 'ComposeDate' element value. ���� ������������ ���������� �������
     * 
     * @param composeDate
     */
    public void setComposeDate(LocalDate composeDate) {
        this.composeDate = composeDate;
    }

    /** 
     * Get the 'CustomsControl' element value. ������� ������������� ���������� ����������� ����������
     * 
     * @return value
     */
    public String getCustomsControl() {
        return customsControl;
    }

    /** 
     * Set the 'CustomsControl' element value. ������� ������������� ���������� ����������� ����������
     * 
     * @param customsControl
     */
    public void setCustomsControl(String customsControl) {
        this.customsControl = customsControl;
    }

    /** 
     * Get the list of 'RefusalReasons' element items. ������� ������������� ������ ���������� �� �����������/������ � ��������� �����
     * 
     * @return list
     */
    public List<String> getRefusalReasonList() {
        return refusalReasonList;
    }

    /** 
     * Set the list of 'RefusalReasons' element items. ������� ������������� ������ ���������� �� �����������/������ � ��������� �����
     * 
     * @param list
     */
    public void setRefusalReasonList(List<String> list) {
        refusalReasonList = list;
    }

    /** 
     * Get the 'FinalLiquidationDate' element value. ���� ����������� �� ������� ����������� ������
     * 
     * @return value
     */
    public LocalDate getFinalLiquidationDate() {
        return finalLiquidationDate;
    }

    /** 
     * Set the 'FinalLiquidationDate' element value. ���� ����������� �� ������� ����������� ������
     * 
     * @param finalLiquidationDate
     */
    public void setFinalLiquidationDate(LocalDate finalLiquidationDate) {
        this.finalLiquidationDate = finalLiquidationDate;
    }

    /** 
     * Get the 'ProlongFoundation' element value. ��������� ��������� ����� �����������
     * 
     * @return value
     */
    public DocumentBaseType getProlongFoundation() {
        return prolongFoundation;
    }

    /** 
     * Set the 'ProlongFoundation' element value. ��������� ��������� ����� �����������
     * 
     * @param prolongFoundation
     */
    public void setProlongFoundation(DocumentBaseType prolongFoundation) {
        this.prolongFoundation = prolongFoundation;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
