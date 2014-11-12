
package ru.acs.fts.schemas.album.ed_container;

/** 
 * Элемент контейнера
 */
public class ContainerDocType
{
    private String order;
    private DocBodyType docBody;

    /** 
     * Get the 'Order' element value. Порядок обработки документа. Используется в системах электронного декларирования. при обычном порядке оформления не заполняется.
     * 
     * @return value
     */
    public String getOrder() {
        return order;
    }

    /** 
     * Set the 'Order' element value. Порядок обработки документа. Используется в системах электронного декларирования. при обычном порядке оформления не заполняется.
     * 
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /** 
     * Get the 'DocBody' element value.
     * 
     * @return value
     */
    public DocBodyType getDocBody() {
        return docBody;
    }

    /** 
     * Set the 'DocBody' element value.
     * 
     * @param docBody
     */
    public void setDocBody(DocBodyType docBody) {
        this.docBody = docBody;
    }
}
