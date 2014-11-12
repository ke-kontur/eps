
package ru.acs.fts.schemas.album.goodsexportinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.GTDExportInfoType;

/** 
 * Информация о фактически вывезенных товарах по ДТ
 */
public class GoodsExportInfoType extends BaseDocType
{
    private List<GTDExportInfoType> exportInfoList = new ArrayList<GTDExportInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'ExportInfo' element items. Информация о фактическом вывозе по ДТ
     * 
     * @return list
     */
    public List<GTDExportInfoType> getExportInfoList() {
        return exportInfoList;
    }

    /** 
     * Set the list of 'ExportInfo' element items. Информация о фактическом вывозе по ДТ
     * 
     * @param list
     */
    public void setExportInfoList(List<GTDExportInfoType> list) {
        exportInfoList = list;
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
