
package ru.acs.fts.schemas.album.packagepts;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Пакет с информацией об оформлении бланков ПТС и ПШТС.
 */
public class PackagePTSType extends BaseDocType
{
    private String systemId;
    private String version;
    private List<FormType> formList = new ArrayList<FormType>();
    private String documentModeID;

    /** 
     * Get the 'SystemId' element value. Идентификатор системы таможенного оформления и таможенного контроля (ID_PS)
     * 
     * @return value
     */
    public String getSystemId() {
        return systemId;
    }

    /** 
     * Set the 'SystemId' element value. Идентификатор системы таможенного оформления и таможенного контроля (ID_PS)
     * 
     * @param systemId
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /** 
     * Get the 'Version' element value. Номер версии пакета (VERSION)
     * 
     * @return value
     */
    public String getVersion() {
        return version;
    }

    /** 
     * Set the 'Version' element value. Номер версии пакета (VERSION)
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /** 
     * Get the list of 'Form' element items. Бланк ПТС и ПШТС-Т
     * 
     * @return list
     */
    public List<FormType> getFormList() {
        return formList;
    }

    /** 
     * Set the list of 'Form' element items. Бланк ПТС и ПШТС-Т
     * 
     * @param list
     */
    public void setFormList(List<FormType> list) {
        formList = list;
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
