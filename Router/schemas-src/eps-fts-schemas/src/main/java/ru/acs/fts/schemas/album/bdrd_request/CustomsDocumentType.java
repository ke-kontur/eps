
package ru.acs.fts.schemas.album.bdrd_request;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Таможенный документ
 */
public class CustomsDocumentType extends GTDIDType
{
    private String docKind;

    /** 
     * Get the 'DocKind' element value. Вид запрашиваемого документа: 1 - ДТ (декларация на товары); 2 - ТД (транзитная декларация); 3 - СП (сообщение о прибытии); 4 - СУ (сообщение об убытии)
     * 
     * @return value
     */
    public String getDocKind() {
        return docKind;
    }

    /** 
     * Set the 'DocKind' element value. Вид запрашиваемого документа: 1 - ДТ (декларация на товары); 2 - ТД (транзитная декларация); 3 - СП (сообщение о прибытии); 4 - СУ (сообщение об убытии)
     * 
     * @param docKind
     */
    public void setDocKind(String docKind) {
        this.docKind = docKind;
    }
}
