
package ru.acs.fts.schemas.album.roszdravtranspl;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Ответ на запрос разрешения (заключение) на ввоз костного мозга и гемопоэтических стволовых клеток с целью проведения неродственной трансплантации
 */
public class RosZdravTransplType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private List<ConclusionType> conclusionList = new ArrayList<ConclusionType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the list of 'Conclusion' element items. Сведения о заключениях на ввоз костного мозга и гемопоэтических стволовых клеток с целью проведения неродственной трансплантации
     * 
     * @return list
     */
    public List<ConclusionType> getConclusionList() {
        return conclusionList;
    }

    /** 
     * Set the list of 'Conclusion' element items. Сведения о заключениях на ввоз костного мозга и гемопоэтических стволовых клеток с целью проведения неродственной трансплантации
     * 
     * @param list
     */
    public void setConclusionList(List<ConclusionType> list) {
        conclusionList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
