
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание выявленных нарушений и несоответствий.
 */
public class ViolationInfoType
{
    private List<String> violationTextList = new ArrayList<String>();
    private String lawArticle;
    private List<ViolationDocType> violationDocList = new ArrayList<ViolationDocType>();

    /** 
     * Get the list of 'ViolationText' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @return list
     */
    public List<String> getViolationTextList() {
        return violationTextList;
    }

    /** 
     * Set the list of 'ViolationText' element items. Описание выявленных нарушений и несоответствий.
     * 
     * @param list
     */
    public void setViolationTextList(List<String> list) {
        violationTextList = list;
    }

    /** 
     * Get the 'LawArticle' element value. Статья ТК РФ, Номера нормативных актов и пунктов в них, нарушенных при заявлении сведений.
     * 
     * @return value
     */
    public String getLawArticle() {
        return lawArticle;
    }

    /** 
     * Set the 'LawArticle' element value. Статья ТК РФ, Номера нормативных актов и пунктов в них, нарушенных при заявлении сведений.
     * 
     * @param lawArticle
     */
    public void setLawArticle(String lawArticle) {
        this.lawArticle = lawArticle;
    }

    /** 
     * Get the list of 'ViolationDoc' element items. Документ, источник информации о выявленном нарушении. (протокол, акт досмотра и т.п.)
     * 
     * @return list
     */
    public List<ViolationDocType> getViolationDocList() {
        return violationDocList;
    }

    /** 
     * Set the list of 'ViolationDoc' element items. Документ, источник информации о выявленном нарушении. (протокол, акт досмотра и т.п.)
     * 
     * @param list
     */
    public void setViolationDocList(List<ViolationDocType> list) {
        violationDocList = list;
    }
}
