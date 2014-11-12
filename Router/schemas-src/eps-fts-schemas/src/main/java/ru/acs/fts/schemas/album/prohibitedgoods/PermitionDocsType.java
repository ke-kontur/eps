
package ru.acs.fts.schemas.album.prohibitedgoods;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о разрешительных документах
 */
public class PermitionDocsType extends DocumentBaseType
{
    private String documentDescriprion;
    private String permitDocOrganization;

    /** 
     * Get the 'DocumentDescriprion' element value. Описание разрешительного документа
     * 
     * @return value
     */
    public String getDocumentDescriprion() {
        return documentDescriprion;
    }

    /** 
     * Set the 'DocumentDescriprion' element value. Описание разрешительного документа
     * 
     * @param documentDescriprion
     */
    public void setDocumentDescriprion(String documentDescriprion) {
        this.documentDescriprion = documentDescriprion;
    }

    /** 
     * Get the 'PermitDocOrganization' element value. Наименование организации, выдавшей разрешительный документ
     * 
     * @return value
     */
    public String getPermitDocOrganization() {
        return permitDocOrganization;
    }

    /** 
     * Set the 'PermitDocOrganization' element value. Наименование организации, выдавшей разрешительный документ
     * 
     * @param permitDocOrganization
     */
    public void setPermitDocOrganization(String permitDocOrganization) {
        this.permitDocOrganization = permitDocOrganization;
    }
}
