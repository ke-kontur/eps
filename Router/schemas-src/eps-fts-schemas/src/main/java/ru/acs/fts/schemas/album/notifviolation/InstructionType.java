
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание действий, необходимых для устранения выявленных нарушений и несоответствий.Требование предоставления документов, корректировки сведений и перехода на общий порядок декларирования.
 */
public class InstructionType
{
    private List<String> instrDescriptionList = new ArrayList<String>();
    private String dateLimit;
    private List<CorrectReqType> correctReqList = new ArrayList<CorrectReqType>();
    private List<DocumentReqType> documentReqList = new ArrayList<DocumentReqType>();

    /** 
     * Get the list of 'InstrDescription' element items. Описание действий.
     * 
     * @return list
     */
    public List<String> getInstrDescriptionList() {
        return instrDescriptionList;
    }

    /** 
     * Set the list of 'InstrDescription' element items. Описание действий.
     * 
     * @param list
     */
    public void setInstrDescriptionList(List<String> list) {
        instrDescriptionList = list;
    }

    /** 
     * Get the 'DateLimit' element value. Срок до которого необходимо выполнить действия.
     * 
     * @return value
     */
    public String getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Срок до которого необходимо выполнить действия.
     * 
     * @param dateLimit
     */
    public void setDateLimit(String dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'CorrectReq' element items. Описание сведений, которые необходимо скорректировать для устранения нарушений или соблюдения условий выпуска
     * 
     * @return list
     */
    public List<CorrectReqType> getCorrectReqList() {
        return correctReqList;
    }

    /** 
     * Set the list of 'CorrectReq' element items. Описание сведений, которые необходимо скорректировать для устранения нарушений или соблюдения условий выпуска
     * 
     * @param list
     */
    public void setCorrectReqList(List<CorrectReqType> list) {
        correctReqList = list;
    }

    /** 
     * Get the list of 'DocumentReq' element items. Документы и сведения, которые необходимо предоставить для устранения выявленных нарушений, соблюдения условий выпуска.
     * 
     * @return list
     */
    public List<DocumentReqType> getDocumentReqList() {
        return documentReqList;
    }

    /** 
     * Set the list of 'DocumentReq' element items. Документы и сведения, которые необходимо предоставить для устранения выявленных нарушений, соблюдения условий выпуска.
     * 
     * @param list
     */
    public void setDocumentReqList(List<DocumentReqType> list) {
        documentReqList = list;
    }
}
